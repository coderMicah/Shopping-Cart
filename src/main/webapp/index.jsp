<%@ page language="java"  contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page import="com.micah.connection.DBConnection" %>
<!DOCTYPE html>
<html>
<head>
<title>Home</title>
<%@ include file="includes/head.jsp"%>
</head>
<body>

	
    <%@ include file="includes/navbar.jsp" %>
    
    <% 
    	out.print(DBConnection.getConnection());
    %>
	<%@ include file="includes/footer.jsp"%>
</body>
</html>