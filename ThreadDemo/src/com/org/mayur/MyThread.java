package com.org.mayur;

public class MyThread extends Thread
{
	String name;

	public MyThread(String name)
	{
		this.name = name;
	}
	
	@Override
	public void run()
	{
		for (int i = 1; i <= 10 ;i++)
		{
			System.out.println(" "+this.name+" : "+i);
		}
	  	
	}

}
