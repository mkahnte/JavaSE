package com.org.mayur;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Concurrency
{

	public static void main(String[] args)
	{

		try
		{
			Class.forName("com.mysql.jdbc.Driver");

			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/iacsd","root","root");
			
			Statement stat = connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
			
			ResultSet res = stat.executeQuery(" Select * from emp ");

			// Using Concurrent update one can avoid multiple insert statements
			
			Scanner sc = new Scanner(System.in);
			int empID;
			String empName;
			int dep;
			for (int i = 0; i < 3; i++)
			{
				
				res.moveToInsertRow();
				System.out.println(" Enter Emp ID : ");
				empID = sc.nextInt();
				
				res.updateInt(1,empID);
		
				System.out.println(" Enter Emp Name : ");
				empName = sc.next();
				
				sc.next(); // CLEAR BUFFER (ENTER KEY)

				res.updateString(2, empName);

				System.out.println(" Enter Dep ID : ");
				dep = sc.nextInt();

				res.updateInt(3,dep);
				res.insertRow();
				
				System.out.println(" ONE ROW ADDED \n\n");

			}
			
			System.out.println(res.getRow());
		
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		
		
	}

}
