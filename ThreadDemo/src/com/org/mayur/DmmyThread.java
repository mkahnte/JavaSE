package com.org.mayur;

public class DmmyThread implements Runnable
{

	String name;
	
	public DmmyThread(String name)
	{
		this.name = name;
	}
	
	@Override
	public void run()
	{
		System.out.println(" Thread : "+this.name);
		
	}

}
