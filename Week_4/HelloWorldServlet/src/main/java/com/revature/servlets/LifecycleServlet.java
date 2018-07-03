package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LifecycleServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
		System.out.println("inside doGet");
		
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service called");
		super.service(req, resp);
	}

	@Override
	public void destroy() {
		System.out.println("destroy");
		super.destroy();
	}

	@Override
	public void init() throws ServletException {
		System.out.println("init");
		super.init();
	}
	
	

}
