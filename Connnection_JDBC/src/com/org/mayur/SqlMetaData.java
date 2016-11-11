package com.org.mayur;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlMetaData
{

	public static void main(String[] args)
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/iacsd", "root", "root");
			
			String query = "select * from emp";
			
			Statement stat = connect.createStatement();
			
			
			System.out.println("--------------------------------------------");
			// Meatadata of connection
			
			DatabaseMetaData metaDataDB = connect.getMetaData();
		
			System.out.println(" getCatalogTerm : "+metaDataDB.getCatalogTerm());
			System.out.println(" getCatalogSeparator : "+metaDataDB.getCatalogSeparator());
			System.out.println(" getDatabaseProductName : "+metaDataDB.getDatabaseProductName());
			System.out.println(" getDriverName : "+metaDataDB.getDriverName());
			System.out.println(" getIdentifierQuoteString : "+metaDataDB.getIdentifierQuoteString());

			
			ResultSet result = stat.executeQuery(query);
			
			
			System.out.println("--------------------------------------------");
			
			ResultSetMetaData metaData= result.getMetaData();
			//Metadata of Database

			int num = 2;
			
			System.out.println(" getTableName : "+metaData.getTableName(num));
			System.out.println(" getColumnCount : "+metaData.getColumnCount());
			System.out.println(" getColumnName : "+metaData.getColumnName(num));
			System.out.println(" getColumnLabel : "+metaData.getColumnLabel(num));
			System.out.println(" getColumnType : "+metaData.getColumnType(num));
			System.out.println(" getCatalogName : "+metaData.getCatalogName(num));
			System.out.println(" getColumnTypeName : "+metaData.getColumnTypeName(num));
			System.out.println(" isNullable : "+metaData.isNullable(num));

			
			System.out.println("--------------------------------------------");
			System.out.println("\t"+metaData.getColumnLabel(1)+"\t"+metaData.getColumnLabel(2)+"\t"+metaData.getColumnLabel(3));

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
