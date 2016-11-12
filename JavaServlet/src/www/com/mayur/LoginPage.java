package www.com.mayur;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginPage extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	String page_HTML = "<!DOCTYPE html>"+
			"<html>"+
			"<head>"+
			    "<title> Servlet Page </title>"+
			"</head>"+
			"<body>"+

			    "<form action='Login' method='post'>"+
			    "<span> Username </span> <input type='text' name='txtUsername'/>"+
			    "<span> Password </span> <input type='text' name='txtPassword'/>"+
			    "<input type='submit' name ='btnSubmit' value=' SUBMIT ' />"+
			    "</form>"+

			"</body>"+
			"</html>";
	
	public LoginPage()
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
		PrintWriter out = response.getWriter();

		if( username==null || username.equals("") )
		{
			out.write(page_HTML);
		}
		else
		{
			out.write(" Working On it");
			
			//connection code//
			
		}
		
		
	}


	
}
