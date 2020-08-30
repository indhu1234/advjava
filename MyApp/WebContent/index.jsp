<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
  <h1>Employee Login Form</h1>
  <form action="LoginServlet" method="post"  action="j_security_check">
   <table style="with: 100%">
    <tr>
     <td>UserName</td>
     <td><input type="text" name="j_username" /></td>
    </tr>
    <tr>
     <td>Password</td>
     <td><input type="password" name="j_password" /></td>
    </tr>

   </table>
   <input type="submit" value="Submit" />
   <input type="reset" value="Reset"/>
  </form>
  </div>
</body>
</html>