package com.org.mayur;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public final class ConnectionClass
{
    //can make this class singleton 
	public ConnectionClass()
	{
		
	}
	
	public static Statement getConnection(String username, String passwod) throws ClassNotFoundException, SQLException
	{
		final String url="jdbc:mysql://localhost:3306/iacsd";	

		final String mysql_Driver="com.mysql.jdbc.Driver";	
		
		Class.forName(mysql_Driver);
		
		Connection con = DriverManager.getConnection(url, username, passwod);
		
		Statement statement = con.createStatement();
		
		return statement;
	}

}
