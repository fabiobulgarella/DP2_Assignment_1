package it.polito.dp2.NFV.sol1;

import it.polito.dp2.NFV.ConnectionPerformanceReader;

public class MyConnectionPerformanceReader implements ConnectionPerformanceReader
{
	private int latency;
	private float throughput;
	
	// class constructor
	public MyConnectionPerformanceReader(int latency, float throughput)
	{
		this.latency = latency;
		this.throughput = throughput;
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
