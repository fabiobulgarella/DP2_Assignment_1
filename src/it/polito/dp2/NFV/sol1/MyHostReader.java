package it.polito.dp2.NFV.sol1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import it.polito.dp2.NFV.HostReader;
import it.polito.dp2.NFV.NodeReader;
import it.polito.dp2.NFV.sol1.jaxb.HostType;

public class MyHostReader extends MyNamedEntityReader implements HostReader
{
	private int availableMemory;
	private int availableStorage;
	private int maxVNFs;
	private List<String> nodeNameList;
	private HashMap<String, NodeReader> nodeMap;
	
	// Class constructor
	public MyHostReader(HostType host, HashMap<String, NodeReader> nodeMap)
	{
		super(host.getName());
		this.availableMemory = host.getMemory();
		this.availableStorage = host.getStorage();
		this.maxVNFs = host.getMaxVnfs();
		this.nodeNameList = host.getNodeRef();
		this.nodeMap = nodeMap;
	}

	@Override
	public int getAvailableMemory()
	{
		return availableMemory;
	}

	@Override
	public int getAvailableStorage()
	{
		return availableStorage;
	}

	@Override
	public int getMaxVNFs()
	{
		return maxVNFs;
	}

	@Override
	public Set<NodeReader> getNodes()
	{
		Set<NodeReader> set = new HashSet<NodeReader>();
		
		for (String nodeName: nodeNameList)
		{
			NodeReader newNode_r = nodeMap.get(nodeName);
			set.add(newNode_r);
		}
		
		return set;
	}

}
