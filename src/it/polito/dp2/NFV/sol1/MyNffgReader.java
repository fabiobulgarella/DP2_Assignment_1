package it.polito.dp2.NFV.sol1;

import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import it.polito.dp2.NFV.HostReader;
import it.polito.dp2.NFV.NffgReader;
import it.polito.dp2.NFV.NodeReader;
import it.polito.dp2.NFV.VNFTypeReader;
import it.polito.dp2.NFV.sol1.jaxb.NffgType;
import it.polito.dp2.NFV.sol1.jaxb.NodeType;

public class MyNffgReader implements NffgReader
{
	private String name;
	private Calendar deployTime;
	private Set<NodeReader> nodes;
	private HashMap<String, NodeReader> nodeMap;
	
	// class constructor
	public MyNffgReader(NffgType nffg, HashMap<String, VNFTypeReader> vnfMap, HashMap<String, NffgReader> nffgMap, HashMap<String, NodeReader> nodeMap, HashMap<String, HostReader> hostMap)
	{
		this.name = nffg.getName();
		this.deployTime = nffg.getDeployTime().toGregorianCalendar();
		this.nodeMap = nodeMap;
		
		// load nodes
		nodes = new HashSet<NodeReader>();
		
		for (NodeType node: nffg.getNode())
		{
			NodeReader newNode_r = new MyNodeReader(node, nffg.getName(), vnfMap, nffgMap, nodeMap, hostMap);
			this.nodeMap.put(node.getName(), newNode_r);
			nodes.add(newNode_r);
		}
	}

	@Override
	public String getName()
	{
		return (name != null) ? name : null;
	}

	@Override
	public Calendar getDeployTime()
	{
		return (deployTime != null) ? deployTime : null;
	}

	@Override
	public NodeReader getNode(String arg0)
	{
		return (arg0 != null) ? nodeMap.get(arg0) : null;
	}

	@Override
	public Set<NodeReader> getNodes()
	{
		return (nodes != null) ? nodes : null;
	}

}
