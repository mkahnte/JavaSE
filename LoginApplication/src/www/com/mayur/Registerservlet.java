package www.com.mayur;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Registerservlet extends HttpServlet
{
	String page_html =

	"<html>"
			+ "<head>"
			+ "<title> Login Page </title>"
			+ "</head>"
			+ "<body>"
			+ "<h1> Registration Page </h1>"
			+ "<form action='Registerservlet' method='post'>"
			+ "<br/>"
			+ "<span> Username </span><input type='text' name='txtUsername_Registerservlet' value=''/>"
			+ "<br/><br/>"
			+ "<span> Password </span><input type='text' name='txtPassword_Registerservlet' value=''/>"
			+ "<br/><br/>"
			+ "<input type='submit' name='subRegister' value=' Register ' />"
			+ "</form>" +

			"</body>" + "</html>";

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
	{
		resp.getWriter().print(page_html);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
	{

		String username = req.getParameter("txtUsername_Registerservlet");
		String password = req.getParameter("txtPassword_Registerservlet");

		//resp.getWriter().println(" username " + username);
		//resp.getWriter().println(" password " + password);

		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/iacsd", "root", "root");

			Statement stat = con.createStatement();

			int result = stat.executeUpdate("INSERT INTO user VALUES ('"+username+"','"+password+"')");

			//resp.getWriter().println(result);
			
			if(result==1)
			{
				req.getRequestDispatcher("LoginServlet").forward(req, resp);;
			}
			else
			{
				req.getRequestDispatcher("Registerservlet").forward(req, resp);;

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
