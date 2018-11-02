package com.revature.servlets;

import java.io.IOException;

import javax.net.ssl.SSLEngineResult.Status;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PageNotFoundServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().write("404 page not found");
		resp.setStatus(404);
	}
	
	

}
