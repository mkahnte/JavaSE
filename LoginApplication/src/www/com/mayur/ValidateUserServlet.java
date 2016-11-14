package www.com.mayur;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ValidateUserServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	public ValidateUserServlet()
	{
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		String username = request.getParameter("txtUsername_LoginServlet");
		String password = request.getParameter("txtPassword_LoginServlet");
		

		boolean flag = false;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/iacsd","root","root");
			
			 Statement stat = con.createStatement();
			 
			 ResultSet res = stat.executeQuery("Select * from user");
			 
			 while(res.next())
			 {
				 if(res.getString(1).equals(username) && res.getString(2).equals(password))
				 {
					 
					 response.getWriter().print(" Login Successful ");
					 
					 // Session 
					 HttpSession session = request.getSession();
					 session.setAttribute("username", username);
					 session.setAttribute("password", password);
					 
					 //Cookie
					 Cookie cookie_username = new Cookie("username", username);
					 Cookie cookie_password = new Cookie("password", password);
					 
					 response.addCookie(cookie_username);
					 response.addCookie(cookie_password);
					 
					 flag=true;
					 break;
		
				 
				 }
			 }
			 
			 if(flag==false)
			 {
				 // POST Call
				 request.getRequestDispatcher("LoginServlet").forward(request, response);
			 }
			 else
			 {
				 // POST Call
				 request.getRequestDispatcher("ChoiceServlet").forward(request, response);
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
