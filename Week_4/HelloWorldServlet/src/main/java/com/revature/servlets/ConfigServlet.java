package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ConfigServlet
 */
public class ConfigServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ConfigServlet() {
		super();

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ServletConfig config = getServletConfig();
		ServletContext context = getServletContext();

		String numberOfTheDay = context.getInitParameter("numberOfTheDay");
		String colorOfTheDay = config.getInitParameter("colorOfTheDay");
		String wordOfTheDay = config.getInitParameter("wordOfTheDay");
		String html = "<h1>The Word of the Day is " + wordOfTheDay + "</h1><br>" + "<h1>The Color of the Day is "
				+ colorOfTheDay + 
				"<br></h1>" + "<h1>The Number of the Day is " + numberOfTheDay + "</h1>";

		response.getWriter().append(html).append(request.getContextPath());
	}

}
