package sampleweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation {@link corbanameURLContextFactory}lass registration
 */
@WebServlet(name="registration", value="/registration")
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
		/*String addr=request.getParameter("a1");*/
		String contact=request.getParameter("t2");
		String email=request.getParameter("t3");
		pw.println("name : "+name);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*
		PrintWriter pw=response.getWriter();
		String name=request.getParameter("t1");
		String addr=request.getParameter("a1");
		String contact=request.getParameter("t2");
		String email=request.getParameter("t3");
		pw.println("name : "+name);*/
		//doGet(request, response);
	}

}
