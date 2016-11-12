package www.com.mayur;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.Connection;

public class LoginApplication extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	
	public LoginApplication()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{

		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		String username = request.getParameter("txtUsername");
		String password = request.getParameter("txtPassword");
		
		PrintWriter out = response.getWriter();
		
		try
		{
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/iacsd", "root", "root");
			

			Statement stat = con.createStatement();
			
			ResultSet result = stat.executeQuery("Select * from user");
			 
			boolean flag = false;

			while(result.next())
			{
				 if(
						 result.getString(1).equals(username) &&
						 result.getString(2).equals(password)
				   )
				 {
					 flag = true;
						//out.write(result.getString(1));
						//out.write(result.getString(2));

				 }
			 }
			
			if(flag)
			{
				out.write(" Welcome "+username);
			}
			else
			{
				out.write(" Invalid Username / Password ");
			}

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
