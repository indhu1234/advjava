package sampleweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation {@link corbanameURLContextFactory}lass registration
 */

public class registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter pw=response.getWriter();
		String name=request.getParameter("t1");
		String addr=request.getParameter("a1");
		String contact=request.getParameter("t2");
		String email=request.getParameter("t3");
		pw.println("name : "+name);
		pw.println("<html><body bgcolor=yellow><form>"
				+ "<input type=text value="+name+"><br>"
				+ "<input type=text value="+addr+"><br>"
				+ "</body></html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter pw=response.getWriter();
		String user =request.getParameter("user");
		String pass=request.getParameter("pwd");
		if(user.equals("niit") && pass.equals("niit@123"))
		{
		     pw.println("Valid user");
		     //RequestDispatcher dis=getServletContext().getRequestDispatcher("/welcome");
		     //dis.include(request, response);
		}
		else
		{
			pw.println("Invalid User");
			//RequestDispatcher dd=getServletContext().getRequestDispatcher("/error");
			//dd.include(request, response);
		}
		doGet(request, response);
	}

}
