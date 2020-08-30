package travels;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class user
 */
//@WebServlet("/user")
public class user extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public user() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		out.println("Welcome");
		String name=request.getParameter("t1");
		String email=request.getParameter("e1");
		out.println("Your name is : "+name+
				"\n  Your E-mail is : "+email);
		out.println("<html><body bgcolor='green'>"
+ "<form><input type='text' value="+name+">"
		+ "</form></body></html>");
		//out.println("<html>");
		//out.println("<body><form action='login' method='get'>User name : <input type='text'name='n1'><br>password : <input type='password' name='n2'><input type='submit' value='Login'></form>");
		//out.println("</body></html>");
		RequestDispatcher dis=request.getRequestDispatcher
				("loginview.html");
		//dis.include(request, response);
		dis.forward(request, response);
		//doGet(request, response);
	}

}
