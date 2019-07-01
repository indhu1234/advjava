<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String un=request.getParameter("uname");
String pw=request.getParameter("pass");
%>
<h1>Registration form Page 2</h1>
<h2>View source code of this page to see hidden values</h2>


<form action="RegisterController" method="post">
		<input type="hidden" name="uname" value="<%=un%>">
		<input type="hidden" name="pass" value="<%=pw%>">
	Age: <input type="text" name="age"> <br>
	Email: <input type="text" name="email"> <br>
	<input type="submit" value="Register">
</form>
</body>
</html>