package it.polito.dp2.NFV.sol1;

import java.util.HashMap;

import it.polito.dp2.NFV.LinkReader;
import it.polito.dp2.NFV.NodeReader;
import it.polito.dp2.NFV.sol1.jaxb.LinkType;

public class MyLinkReader implements LinkReader
{
	private String name;
	private String srcNodeName;
	private String dstNodeName;
	private int latency;
	private float throughput;
	private HashMap<String, NodeReader> nodeMap;

	public MyLinkReader(LinkType link, String srcNodeName, HashMap<String, NodeReader> nodeMap)
	{
		this.name = link.getName();
		this.srcNodeName = srcNodeName;
		this.dstNodeName = link.getDstNode();
		this.latency = link.getMaxLatency();
		this.throughput = link.getMinThroughput();
		this.nodeMap = nodeMap;
	}

	@Override
	public String getName()
	{
		return (name != null) ? name : null;
	}
	
	@Override
	public NodeReader getSourceNode()
	{
		return (srcNodeName != null) ? nodeMap.get(srcNodeName) : null;
	}

	@Override
	public NodeReader getDestinationNode()
	{
		return (dstNodeName != null) ? nodeMap.get(dstNodeName) : null;
	}

	@Override
	public int getLatency()
	{
		return latency;
	}

	@Override
	public float getThroughput()
	{
		return throughput;
	}

}
