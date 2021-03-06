package it.polito.dp2.NFV.sol1;

import java.io.File;
import java.util.GregorianCalendar;
import java.util.Set;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.SAXException;

import it.polito.dp2.NFV.*;
import it.polito.dp2.NFV.sol1.jaxb.*;

public class NfvInfoSerializer
{
	private NfvReader monitor;
	private ObjectFactory objFactory;

	
	/**
	 * Default constructor
	 * @throws NfvReaderException 
	 */
	public NfvInfoSerializer() throws NfvReaderException
	{
		it.polito.dp2.NFV.NfvReaderFactory factory = it.polito.dp2.NFV.NfvReaderFactory.newInstance();
		monitor = factory.newNfvReader();
	}
	
	public NfvInfoSerializer(NfvReader monitor)
	{
		super();
		this.monitor = monitor;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		NfvInfoSerializer wf;
		
		// Check if filename has been given as argument
		if (args.length != 1)
		{
			System.err.println("Output filename is missing");
			System.exit(1);
        }
		
		try {
			wf = new NfvInfoSerializer();
			wf.startMarshall(args[0]);
		}
		catch (NfvReaderException e) {
			System.err.println("Could not instantiate data generator.");
			e.printStackTrace();
			System.exit(1);
		}		
	}
	
	private void startMarshall(String fileName)
	{	
		try	{
			// Create new xml file
			File xmlFile = new File(fileName);
			
			// Initialize JAXBContext and create marshaller
			JAXBContext jc = JAXBContext.newInstance("it.polito.dp2.NFV.sol1.jaxb");
			Marshaller m = jc.createMarshaller();
			
			// Instantiate ObjectFactory and create main JAXBElement
			objFactory = new ObjectFactory();
			JAXBElement<NfvType> nfvObject = objFactory.createNfv( createAll() ); 
			
			// Set validation wrt schema using default validation handler (rises exception with non-valid files)
			String xsdPath = "xsd" + File.separator + "nfvInfo.xsd";
			SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
			Schema schema = sf.newSchema(new File(xsdPath));
			m.setSchema(schema);
			
			// Execute marshall to xmlFile 
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m.marshal(nfvObject, xmlFile);
		}
		catch (JAXBException je) {
			System.err.println("Error while marshalling");
			je.printStackTrace();
			System.exit(1);
		}
		catch (ClassCastException cce) {
			System.err.println("Wrong data type found in XML document");
			cce.printStackTrace();
			System.exit(1);
		}
		catch (SAXException se) {
			System.err.println("Unable to validate file or schema");
			se.printStackTrace();
		}
		
	}

	public NfvType createAll()
	{
		// Create ROOT element (nfv)
		NfvType nfv = objFactory.createNfvType();

		// Retrieve data from interfaces and generate XML related structures
		nfv.setCatalog( createCatalog() );
		nfv.setNffgs( createNffgs() );
		nfv.setHosts( createHosts() );
		nfv.setConnections( createConnections() );
		
		return nfv;
	}

	private CatalogType createCatalog()
	{
		// Get the list of vnf
		Set<VNFTypeReader> set = monitor.getVNFCatalog();
		CatalogType catalog = objFactory.createCatalogType();

		// For each VNF type get name and attribute
		for (VNFTypeReader vnfType_r: set)
		{
			// Create a new vnf object
			VnfType vnf = objFactory.createVnfType();
			vnf.setName( vnfType_r.getName() );
			vnf.setFunctionalType( vnfType_r.getFunctionalType().value() );
			vnf.setReqMemory( vnfType_r.getRequiredMemory() );
			vnf.setReqStorage( vnfType_r.getRequiredStorage() );
			
			// Add generated vnf to catalog
			catalog.getVnf().add(vnf);
		}
		
		return catalog;
	}
	
	private NffgsType createNffgs()
	{
		// Get the list of NF-FGs
		Set<NffgReader> set = monitor.getNffgs(null);
		NffgsType nffgs = objFactory.createNffgsType();
		
		// For each NFFG get related data
		for (NffgReader nffg_r: set)
		{
			// Create a new nffg object
			NffgType nffg = objFactory.createNffgType();
			nffg.setName( nffg_r.getName() );
			
			// Retrieve and convert date
			GregorianCalendar deployTime = (GregorianCalendar) nffg_r.getDeployTime();
			XMLGregorianCalendar convertedTime = null;
			try {
				convertedTime = DatatypeFactory.newInstance().newXMLGregorianCalendar(deployTime);
			}
			catch (DatatypeConfigurationException dce) {
				System.err.println("Error while converting date to XML format");
				dce.printStackTrace();
				System.exit(1);
			}
			nffg.setDeployTime(convertedTime);

			// Get nodes
			Set<NodeReader> nodeSet = nffg_r.getNodes();
			
			for (NodeReader nr: nodeSet)
			{
				// Create a new node object
				NodeType node = objFactory.createNodeType();
				node.setName( nr.getName() );
				node.setVnfRef( nr.getFuncType().getName() );
				node.setHostRef( nr.getHost().getName() );
				
				// Get related links
				Set<LinkReader> linkSet = nr.getLinks();
				
				for (LinkReader lr: linkSet)
				{
					// Create a new link object
					LinkType link = objFactory.createLinkType();
					link.setName( lr.getName() );
					link.setDstNode( lr.getDestinationNode().getName() );
					link.setMinThroughput( lr.getThroughput() );
					link.setMaxLatency( lr.getLatency() );
					
					// Add generated link to links list
					node.getLink().add(link);
				}
				
				// Add generated node to nodes list
				nffg.getNode().add(node);
			}
			
			// Add generated nffg to nffgs list
			nffgs.getNffg().add(nffg);
		}
		
		return nffgs;
	}

	private HostsType createHosts()
	{
		// Get the list of Hosts
		Set<HostReader> set = monitor.getHosts();
		HostsType hosts = objFactory.createHostsType();
		
		// For each Host get related data
		for (HostReader host_r: set)
		{
			// Create a new host object
			HostType host = objFactory.createHostType();
			host.setName( host_r.getName() );
			host.setMaxVnfs( host_r.getMaxVNFs() );
			host.setMemory( host_r.getAvailableMemory() );
			host.setStorage( host_r.getAvailableStorage() );

			// Get allocated nodes
			Set<NodeReader> nodeSet = host_r.getNodes();
			
			for (NodeReader nr: nodeSet)
			{
				NodeRefType nodeRef = objFactory.createNodeRefType();
				nodeRef.setName( nr.getName() );
				host.getNodeRef().add(nodeRef);
			}
			
			// Add generated host to hosts list
			hosts.getHost().add(host);
		}
		
		return hosts;
	}
	
	private ConnectionsType createConnections()
	{
		// Get the list of Hosts
		Set<HostReader> set = monitor.getHosts();
		ConnectionsType connections = objFactory.createConnectionsType();
		
		// For each pair of Hosts get related data
		for (HostReader sri: set) {
			for (HostReader srj: set)
			{
				// Create a new connection object
				ConnectionType connection = objFactory.createConnectionType();
				connection.setHost1( sri.getName() );
				connection.setHost2( srj.getName() );
				
				// Get performance data
				ConnectionPerformanceReader cpr = monitor.getConnectionPerformance(sri, srj);
				connection.setThroughput( cpr.getThroughput() );
				connection.setLatency( cpr.getLatency() );
				
				// Add generated connection to connections list
				connections.getConnection().add(connection);
			}
		}
		
		return connections;
	}
}