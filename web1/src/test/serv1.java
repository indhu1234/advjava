package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class serv1
 */
/*@WebServlet("/serv1")*/
public class serv1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public serv1() {
        super();
        // TODO Auto-generated constructor stub
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
		PrintWriter pw=response.getWriter();
		pw.println("First Servlet");
		String name=request.getParameter("t1");
		String address=request.getParameter("a1");
		String user=request.getParameter("t2");
		String pwd=request.getParameter("p1");
		pw.println("<html><body bgcolor='green'>"
				+ "<input type='text' value="+name+"></body></html>");
		pw.println("Name is : "+name+" Address : "+address+
				"User Name = "+user+" Password : "+pwd);
		RequestDispatcher dis=request.getRequestDispatcher("/serv2");
		dis.forward(request, response);
		
		//doGet(request, response);
	}

}
