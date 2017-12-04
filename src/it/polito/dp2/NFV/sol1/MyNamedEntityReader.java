package it.polito.dp2.NFV.sol1;

import it.polito.dp2.NFV.NamedEntityReader;

public class MyNamedEntityReader implements NamedEntityReader
{
	private String name;
	
	// class constructor
	public MyNamedEntityReader(String name)
	{
		this.name = name;
	}

	@Override
	public String getName()
	{
		if (name != null)
			return name;
		else
			return null;
	}

}
