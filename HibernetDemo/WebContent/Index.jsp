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
	<s:form action="employee">  
	<s:textfield name="id" label="Employee Id"></s:textfield>  
	<s:textfield name="firstName" label="First Name"></s:textfield> 
	<s:textfield name="lastName" label="Last Name"></s:textfield>  
	<s:submit value="save"></s:submit>  
	</s:form>  
</body>
</html>