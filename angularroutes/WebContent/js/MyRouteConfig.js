var myApp=angular.module("myApp",["ngRoute"]);

myApp.config(function($routeProvider,$locationProvider){
     console.log("I'm in route provider");
     $locationProvider.hashPrefix('');
     $routeProvider
         .when("/",{templateUrl:"views/Home.jsp"})
         .when("/Register",{templateUrl:"views/Register.jsp"})
         .when("/Login",{templateUrl:"views/Login.jsp"})
         .when("/Books",{templateUrl:"views/books.jsp"})
    });
 myApp.controller('appctrl',function($scope){
	 $scope.msg="Angular controller";
 });