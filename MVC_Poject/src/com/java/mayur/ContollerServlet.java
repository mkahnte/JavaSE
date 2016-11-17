package com.java.mayur;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ContollerServlet")
public class ContollerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public ContollerServlet() 
    {
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		Enumeration<String> array = request.getParameterNames();
		
		HttpSession session = request.getSession(true);
		
		while (array.hasMoreElements())
		{
			String string = (String) array.nextElement();
			
			//response.getWriter().print("</br> Parameter : "+string);
			
			session.setAttribute(string, request.getParameter(string).toString());
			
		}

		Enumeration<String> sessionParametesrs = session.getAttributeNames();
		
		while (sessionParametesrs.hasMoreElements())
		{
			String string = (String) sessionParametesrs.nextElement();
			
			response.getWriter().print("</br> Parameter : "+string+" value : "+ (String) session.getAttribute(string));

		}
		
		Account ac = new Account();
		
		int ammount = Integer.parseInt(((String)request.getParameter("ammount")));
		
		ac.depositAmmount(ammount);
		
		session.setAttribute("ammount", ac.getBalence());
		
		request.getRequestDispatcher("DisplayFinalOutput.jsp").forward(request, response);;
	}

}
