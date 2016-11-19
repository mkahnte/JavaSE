package com.org.mayur;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		request.getRequestDispatcher("Login.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
			response.getWriter().print(" ValidateUser </br>");
			
		/*	if( ValidateUserClass.isUserValid(username, password) )
			{
				// Menu service 
			}
			else
			{
				request.getRequestDispatcher("Login.jsp").forward(request, response);
			}*/
			

	}

}
