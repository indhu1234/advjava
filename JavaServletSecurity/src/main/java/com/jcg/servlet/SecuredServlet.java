package com.jcg.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.HttpConstraint;
import javax.servlet.annotation.HttpMethodConstraint;
import javax.servlet.annotation.ServletSecurity;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/secured")
@ServletSecurity(
		value = @HttpConstraint(
				rolesAllowed = {
						"secured"
				}),
				httpMethodConstraints = {
			@HttpMethodConstraint(value = "GET", rolesAllowed = {
					"secured"
			})
		})
public class SecuredServlet extends HttpServlet{

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
		String title = "Secured Page";		
		String docType = "<!DOCTYPE html>\n";
		out.println(docType 
				+ "<html>\n" + ""
						+ "<head><meta http-equiv=\"Content-Type\" "
						+ "content=\"text/html; charset=UTF-8\">"
						+ "<title>" + title + "</title></head>\n" + "<body>");

		out.println("<h2>Servlet Security Example</h2>" + 
				"<div>&nbsp;"
				+ "Servlet Basic Authentication Annotation Configuration : "
				+ "<span>Secured Servlet</span></div><div><ul>" + 
				"<li>User Name Is : <span>" + 
				request.getUserPrincipal().getName() + "</span></li>" +
				"<li>Authentication Type Is : <span>" + 
				request.getAuthType() + "</span></li>" +
				"</ul></div></body>\n</html>");
		out.close();
	}
}