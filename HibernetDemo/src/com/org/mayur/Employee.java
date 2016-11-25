package com.org.mayur;

import com.opensymphony.xwork2.Action;

public class Employee implements Action 
{
	private int id;
	
	private String firstName, lastName;

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	@Override
	public String execute() throws Exception
	{
		return "success";
	}

}
