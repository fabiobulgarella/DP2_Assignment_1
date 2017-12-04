package it.polito.dp2.NFV.sol1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import it.polito.dp2.NFV.HostReader;
import it.polito.dp2.NFV.LinkReader;
import it.polito.dp2.NFV.NffgReader;
import it.polito.dp2.NFV.NodeReader;
import it.polito.dp2.NFV.VNFTypeReader;
import it.polito.dp2.NFV.sol1.jaxb.LinkType;
import it.polito.dp2.NFV.sol1.jaxb.NodeType;

public class MyNodeReader implements NodeReader
{
	private String name;
	private String vnfName;
	private String hostName;
	private Set<LinkReader> links;
	private String nffgName;
	private HashMap<String, VNFTypeReader> vnfMap;
	private HashMap<String, NffgReader> nffgMap;
	private HashMap<String, HostReader> hostMap;

	// class constructor
	public MyNodeReader(NodeType node, String nffgName, HashMap<String, VNFTypeReader> vnfMap, HashMap<String, NffgReader> nffgMap, HashMap<String, NodeReader> nodeMap, HashMap<String, HostReader> hostMap)
	{
		this.name = node.getName();
		this.vnfName = node.getVnfRef();
		this.hostName = node.getHostRef();
		this.nffgName = nffgName;
		this.vnfMap = vnfMap;
		this.nffgMap = nffgMap;
		this.hostMap = hostMap;
		
		// load links
		links = new HashSet<LinkReader>();
		
		for (LinkType link: node.getLink())
		{
			LinkReader newLink_r = new MyLinkReader(link, node.getName(), nodeMap);
			links.add(newLink_r);
		}
	}

	@Override
	public String getName()
	{
		return (name != null) ? name : null;
	}

	@Override
	public VNFTypeReader getFuncType()
	{
		return (vnfName != null) ? vnfMap.get(vnfName) : null;
	}

	@Override
	public HostReader getHost()
	{
		return (hostName != null) ? hostMap.get(hostName) : null;
	}

	@Override
	public Set<LinkReader> getLinks()
	{
		return (links != null) ? links : null;
	}

	@Override
	public NffgReader getNffg()
	{
		return (nffgName != null) ? nffgMap.get(nffgName) : null;
	}

}
