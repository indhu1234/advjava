package com.candidjava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String un=request.getParameter("uname");
		String pw=request.getParameter("pass");
		String age=request.getParameter("age");
		String email=request.getParameter("email");
		 
		 response.setContentType("text/html");
		 PrintWriter out= response.getWriter();
		 out.write("<h1>Hidden form data received successfully</h1> ");
		 
		 out.write("Name :  "+un + "<br>");
		 out.write("Password :  "+pw + "<br>");
		 out.write("Age :  "+age + "<br>");
		 out.write("Email :  "+email + "<br>");
		
	}

}
