package com.org.mayur;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

public class DemoClass implements Serializable, Externalizable
{
	int number;
	DateClass date;

	public DemoClass()
	{     super();
		this.number = 0;
	}
	
	public DemoClass(int number,DateClass dc )
	{
		
		this.number = number;
		this.date = dc;
	}
	
	public void printData()
	{
		System.out.println(" Data : "+this.number);
	}

	// Call back Methods 
	@Override
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException
	{
		this.number = in.readInt();
		this.date = (DateClass) in.readObject();
		
	}

	//Cal back Methods
	@Override
	public void writeExternal(ObjectOutput out) throws IOException
	{
		out.write(number);
		out.writeObject(date);
		

		
	}
	
}
