package com.java.mayur;

public class Account
{
	private int ammount;
	
	public Account()
	{
		this.ammount = 100;
	}
	
	public int getBalence()
	{
		return ammount;
	}

	public void setBalence(int balance)
	{
		this.ammount = balance;
	}	

	public boolean depositAmmount( int ammount )
	{
		ammount = ammount + ammount;
		
		System.out.println(" Deposit : "+ammount);
		System.out.println(" Balance : "+ammount);
		
		return true;
	}

	
}
