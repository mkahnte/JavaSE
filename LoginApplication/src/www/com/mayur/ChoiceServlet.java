package www.com.mayur;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ChoiceServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	public ChoiceServlet()
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
		
			 HttpSession session = request.getSession();
			 String username = (String) session.getAttribute("username");
			 String password = (String) session.getAttribute("password");

			 PrintWriter out = response.getWriter();
			 
			 out.println(" Session ");
			 out.println(" Username : "+username);
			 out.println(" Password : "+password);
			 
			 Cookie[] cookies = request.getCookies();
			 
			for (Cookie cookie : cookies)
			{
				if(cookie.getName().equals("username"))
				{
					 out.println(" Cookie Username : "+cookie.getValue());
				}
				if(cookie.getName().equals("password"))
				{
					 out.println(" Cookie Password : "+cookie.getValue());
				}
			}
	
		
	}

}
