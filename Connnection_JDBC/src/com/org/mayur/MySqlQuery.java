package com.org.mayur;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlQuery
{

	public static void main(String[] args)
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			//create connection to database
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/iacsd", "root", "root");
			
			String query = "select * from emp";
			
			Statement stat = connect.createStatement();
			
			ResultSet result = stat.executeQuery(query);
			
			while(result.next())
			{
				System.out.println("\t"+result.getInt(1)+"\t"+result.getString(2)+"\t"+result.getString(3));
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
