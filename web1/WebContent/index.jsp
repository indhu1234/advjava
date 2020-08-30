<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="register.jsp" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>My First Page</h1>

<form action="serv1" method="POST">
Name : <input type="text" name="t1" ><br>
Address : <textarea rows="5" cols="20" name="a1">
</textarea><br>
User name : <input type="text" name="t2"><br>
Password : <input type="password" name="p1"><br>
<input type="submit" value="Register"><br>
</form>

</body>
</html>