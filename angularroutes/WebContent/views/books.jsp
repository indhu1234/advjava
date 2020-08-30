<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script>
var app=angular.module("myapp",[]);
app.controller("mycontroller",function($scope)
{
$scope.books=[{BookName:"Complete Java",Edition:"Third Edn",Cost:"1000"},
                         {BookName:"Spring Framework","Edition:"Second Edn",Cost:"1200"},
                         {BookName:"Hibernate Framework","Edition:"First Edn",Cost:"1300"},

});
</script>
</head>
<body ng-app="myapp" ng-controller="mycontroller">
<table>
<tr>
<th>Book Name</th>
<th>Edition </th>
<th>Cost </th>
</tr>
<tr ng-repeat=book in books>
<td>{{book.BookName}}</td>
<td>{{book.Edition}}</td>
<td>{{book.Cost}}</td>
</tr>
</table>
</body>

</html>