package www.com.mayur;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet
{
	String page_html = 

	"<html>"+
	"<head>"+
	    "<title> Login Page </title>"+
	"</head>"+
	"<body>"+
		"<h1> Login Page </h1>"+
	    "<form action='ValidateUserServlet' method='post'>"+
	    "<br/>"+
	    "<span> Username </span><input type='text' name='txtUsername_LoginServlet' value=''/>"+
	    "<br/><br/>"+
	    "<span> Password </span><input type='text' name='txtPassword_LoginServlet' value=''/>"+
	    "<br/><br/>"+
	    "<input type='submit' name='subLogin' value=' Login ' />"+
	    "</form>"+

	"</body>"+
	"</html>" ;
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
	{
			
			doPost(req,resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
	{
		resp.getWriter().print(page_html);

	}

	
	
	
}
