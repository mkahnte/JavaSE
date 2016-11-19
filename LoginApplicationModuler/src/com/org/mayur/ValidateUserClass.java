package com.org.mayur;

import java.sql.SQLException;
import java.sql.Statement;

public class ValidateUserClass
{
		
	public ValidateUserClass()
	{
		
	}

	public static boolean isUserValid(String username, String password)
	{
	
		try
		{
			Statement stat = ConnectionClass.getConnection("root", "root");
			
			stat.executeQuery("");
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		
		//if valid
		return true;
		//else
		//return false;
	}
	
}
