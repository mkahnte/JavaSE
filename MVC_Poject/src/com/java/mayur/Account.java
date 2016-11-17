package com.java.mayur;

public class Account
{
	private int balence;
	
	public Account()
	{
		this.balence = 100;
	}
	
	public int getBalence()
	{
		return balence;
	}

	public void setBalence(int balence)
	{
		this.balence = balence;
	}	

	public boolean depositAmmount( int ammount )
	{
		balence = balence + ammount;
		
		System.out.println(" Deposit : "+ammount);
		System.out.println(" Balence : "+balence);
		
		return true;
	}

	
}
