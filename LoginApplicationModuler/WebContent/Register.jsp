<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Page</title>
</head>
<body>

	<h2> Register </h2>
	

    <form action="RegisterServlet" method="post">
    <br/>
    <span> Username </span><input type="text" name="txtUsername" value=""/>
    <br/><br/>
    <span> Password </span><input type="text" name="txtPassword" value=""/>
    <br/><br/>
    <input type="submit" name="subRegister" value=" Register " />
    </form>
    
</body>
</html>