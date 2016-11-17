<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Controller</title>
</head>
<body>

	
	<jsp:useBean id="act" class="com.java.mayur.Account">
		
	<!-- 				       class					     HTML -->
	<jsp:setProperty property="amount" name="act" param="txtAmount"/>
 	
	</jsp:useBean>
	
	<%
		request.getSession().setAttribute("amount", act.getAmount());
	%>
		
	<jsp:forward page="DisplayFinalOutput.jsp"></jsp:forward>

</body>
</html>