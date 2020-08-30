<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<body>
<jsp:forward page="views/Home.jsp"></jsp:forward>
</body>
</html>



<!-- <!DOCTYPE html>
<html>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular-route.js"></script>

<body ng-app="myApp">

<p><a href="#/!">Main</a></p>

<a href="#!Home">Home</a>
<a href="#!Login">Login</a>
<a href="#!Register">Register</a>

<div ng-view></div>

<script>
var app = angular.module("myApp", ["ngRoute"]);
app.config(function($routeProvider) {
    $routeProvider
    .when("/", {
        templateUrl : "views/Home.jsp"
    })
    .when("/red", {
        templateUrl : "views/Login.jsp"
    })
    .when("/green", {
        templateUrl : "views/Register.jsp"
    })
    
    });
});
</script>


</body>
</html>
 -->