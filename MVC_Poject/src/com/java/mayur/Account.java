package com.java.mayur;

import java.io.Serializable;

public class Account implements Serializable
{
	private int amount;
	
	public Account()
	{
		this.amount = 100;
	}

	public int getAmount()
	{
		return amount;
	}



	public void setAmount(int amount)
	{
		this.amount = amount;
	}



	public boolean depositAmmount( int ammount )
	{
		ammount = ammount + ammount;
		
		System.out.println(" Deposit : "+ammount);
		System.out.println(" Balance : "+ammount);
		
		return true;
	}

	
}
