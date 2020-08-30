package main.java.com.niit.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GetUserServlet")
public class GetUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
        
		/*String userName = request.getParameter("userName").trim();
		if(userName == null || "".equals(userName)){
			userName = "Guest";
		}
		
		String greetings = "Hello " + userName;
		
		response.setContentType("text/plain");
		response.getWriter().write(greetings);*/
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
        System.out.println("Testing");
        PrintWriter out=response.getWriter();
		String username = request.getParameter("userName");
		if(username == null || "".equals(username)){
			username = "Guest";
		}
		
		String greetings = "Hello " + username;
		
		response.setContentType("text/plain");
		response.getWriter().write(greetings);
		
		
	}
}
