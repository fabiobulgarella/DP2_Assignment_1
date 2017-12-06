package it.polito.dp2.NFV.sol1;

import java.io.File;
import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.UnmarshalException;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.SAXException;

import it.polito.dp2.NFV.NfvReader;
import it.polito.dp2.NFV.NfvReaderException;
import it.polito.dp2.NFV.sol1.jaxb.NfvType;

public class NfvReaderFactory extends it.polito.dp2.NFV.NfvReaderFactory {

	@SuppressWarnings("unchecked")
	@Override
	public NfvReader newNfvReader() throws NfvReaderException
	{
		// create NfvType object that will contain unmarshalled data
		NfvType nfv = null;
		
		try {
			// initialize JAXBContext and create unmarshaller
			JAXBContext jc = JAXBContext.newInstance("it.polito.dp2.NFV.sol1.jaxb");
			Unmarshaller u = jc.createUnmarshaller();
			
			// set validation wrt schema using default validation handler (rises exception with non-valid files)
			String xsdPath = "xsd" + File.separator + "nfvInfo.xsd";
			SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
			Schema schema = sf.newSchema(new File(xsdPath));
			u.setSchema(schema);
			
			// unmarshal file named fileName
			String fileName = System.getProperty("it.polito.dp2.NFV.sol1.NfvInfo.file");
			
			// check if System Property has been read correctly
			if (fileName == null)
			{
				System.err.println("System property \"it.polito.dp2.NFV.sol1.NfvInfo.file\" not found");
				System.exit(1);
			}
			
			JAXBElement<NfvType> jaxbNfv = (JAXBElement<NfvType>) u.unmarshal( new File(fileName) );
			nfv = (NfvType) jaxbNfv.getValue();
		}
		catch ( UnmarshalException ue ) {
			System.err.println( "Caught UnmarshalException" );
			ue.printStackTrace();
			System.exit(1);
		}
		catch ( JAXBException je ) {
			System.err.println("Error while unmarshalling or marshalling");
			je.printStackTrace();
			System.exit(1);
		}
		catch (SAXException se) {
			System.err.println("Unable to validate file or schema");
			se.printStackTrace();
		}
		
		return new MyNfvReader(nfv);
	}
}
