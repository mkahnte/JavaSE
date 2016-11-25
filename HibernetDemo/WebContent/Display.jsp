<%@page import="com.org.mayur.Employee"%>
<%@page import="com.org.mayur.StoreData"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<%@ taglib uri="/struts-tags" prefix="s" %>  
    Employee Id : <s:property value="id"/><br/>  
	Employee First Name : <s:property value="firstName"/><br/>  
	Employee Last Name : <s:property value="lastName"/><br/>  

	<%
			
		new com.org.mayur.StoreData
		( 
				Integer.parseInt(request.getParameter("id")),
				request.getParameter("firstName"),
				request.getParameter("lastName")
		).store();
		
	%>
	
</body>
</html>