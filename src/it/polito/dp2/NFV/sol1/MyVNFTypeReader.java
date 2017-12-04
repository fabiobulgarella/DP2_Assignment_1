package it.polito.dp2.NFV.sol1;

import it.polito.dp2.NFV.FunctionalType;
import it.polito.dp2.NFV.VNFTypeReader;
import it.polito.dp2.NFV.sol1.jaxb.VnfType;

public class MyVNFTypeReader implements VNFTypeReader
{
	private String name;
	private FunctionalType functionalType;
	private int requiredMemory;
	private int requiredStorage;

	// class constructor
	public MyVNFTypeReader(VnfType vnf)
	{
		this.name = vnf.getName();
		this.functionalType = FunctionalType.fromValue( vnf.getFunctionalType() );
		this.requiredMemory = vnf.getReqMemory();
		this.requiredStorage = vnf.getReqStorage();
	}
	
	@Override
	public String getName()
	{
		return name;
	}

	@Override
	public FunctionalType getFunctionalType()
	{
		return functionalType;
	}

	@Override
	public int getRequiredMemory()
	{
		return requiredMemory;
	}

	@Override
	public int getRequiredStorage()
	{
		return requiredStorage;
	}

}
