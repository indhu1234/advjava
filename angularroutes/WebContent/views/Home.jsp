<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular-route.js"></script>
 <script src="js/MyRouteConfig.js"></script>
<!-- <script>
var App=angular.module("myApp",["ngRoute"]);

 App.config(function($routeProvider){
     console.log("I'm in route provider");
     $routeProvider.when("/Home",{template:"<strong>Testing Home </strong>",
    	                           })
     .when("/Register",{template:"<strong>Register process</strong>"})
     .when("/Login",{template:"<strong>Login process</strong>"})
    });
 	   
 });


</script>	
 -->	

</head>
<body ng-app="myApp">
<h1>Hello</h1>
{{10+3}}
<br>
<div ng-controller="appctrl">
{{msg}}
</div>
<ul>
<li><a href="#/">Home</a></li>
<li><a href="#/Login">Login</a></li>
<li><a href="#/Register">Register</a></li>
<li><a href="#/Books">List of Books</a>

</ul>


<div ng-view>

</div>

<h1><font color="cyan"> Copyright since 2017 </font></h1>



</body>
</html>
