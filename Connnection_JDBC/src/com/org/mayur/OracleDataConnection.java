package com.org.mayur;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class OracleDataConnection
{

	public static void main(String[] args)
	{
		try
		{
			
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			
			Connection con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@sdc:1521/oracle","user24","user24");  
							
			
			String query = "select * from emp";
			
			Statement stat = con.createStatement();
			
			ResultSet res = stat.executeQuery(query);
			
			
			while(res.next())
			{
				System.out.println(" "+res.getString(1));
			}
			
			
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
