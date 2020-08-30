package com.jcg.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/public")
public class PublicServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/***** This Method Is Called By The Servlet Container To Process A 'GET' Request *****/
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		handleRequest(request, response);
	}

	public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		/***** Set Response Content Type *****/
		response.setContentType("text/html");

		/***** Print The Response *****/
		PrintWriter out = response.getWriter();
		String title = "Public Page";		
		String docType = "<!DOCTYPE html>\n";
		out.println(docType 
				+ "<html>\n" + "<head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"><title>" + title + "</title></head>\n" + "<body>");

		out.println("<h2>Servlet Security Example</h2>" + 
				"<div>&nbsp;Servlet Basic Authentication Annotation Configuration : <span>Public Servlet</span></div>" +
				"</body>\n</html>");
		out.close();
	}
}