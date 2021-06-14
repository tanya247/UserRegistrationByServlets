<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" language = "java" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Success Page</title>
</head>
<body>
<h3> Hello <%= request.getAttribute("user") %> Successful Login</h3>
<a href = "login.html">Login Page</a>
</body>
</html>