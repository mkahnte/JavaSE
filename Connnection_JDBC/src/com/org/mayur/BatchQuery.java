package com.org.mayur;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchQuery
{
	Connection connect;
	
	public BatchQuery()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/iacsd","root","root");
			
			Statement stat =  connect.createStatement();
	
			connect.setAutoCommit(false);
			
			/* Select Query can't be performed in batch
				because it returns ResultSet 
				where other DML commands return zero or one 
			*/
			stat.addBatch("INSERT INTO emp (idemp,name,deptno) VALUES (106,'EMP F', 2) ");
			stat.addBatch("INSERT INTO emp (idemp,name,deptno) VALUES (107,'EMP G', 1) ");
			stat.addBatch("INSERT INTO emp (idemp,name,deptno) VALUES (108,'EMP H', 2) ");
			stat.addBatch("INSERT INTO emp (idemp,name,deptno) VALUES (109,'EMP I', 1) ");
			stat.addBatch("INSERT INTO emp (idemp,name,deptno) VALUES (110,'EMP J', 1) ");
			stat.addBatch("INSERT INTO emp (idemp,name,deptno) VALUES (111,'EMP K', 2) ");
			
			stat.addBatch("INSERT INTO emp (idemp,name,deptno) VALUES (112,'EMP X', 2) ");
			stat.addBatch("INSERT INTO emp (idemp,name,deptno) VALUES (113,'EMP Y', 1) ");

			
			int [] result = stat.executeBatch();
			
			for (int i = 0; i < result.length; i++)
			{
				System.out.println("Query ["+i+"] : "+result[i]);

			}
			
			connect.commit();
			System.out.println(" commit the changes ...");

					
		}
		catch (Exception e)
		{
			try
			{
				connect.rollback();
				System.out.println(" rolling back changes ...");
			}
			catch (SQLException e1)
			{
				e1.printStackTrace();
			}
			
			e.printStackTrace();
		}

	}
	
	public static void main(String[] args)
	{
		new BatchQuery();
		
	}

}
