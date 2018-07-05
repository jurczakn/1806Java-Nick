package com.revature.util;

import javax.servlet.http.HttpServlet;

import com.revature.servlets.HomeServlet;
import com.revature.servlets.LoginServlet;
import com.revature.servlets.PageNotFoundServlet;

public class RequestHelper {
	
	private static HttpServlet loginServlet = new LoginServlet();
	private static HttpServlet homeServlet = new HomeServlet();
	private static PageNotFoundServlet pnfServlet = new PageNotFoundServlet();
	
	public HttpServlet dispatchRequest(String path){
		
		HttpServlet nextServlet = null;
		
		switch (path){
		
		case "/FrontController/login":
			nextServlet = loginServlet;
			break;
		case "/FrontController/home":
			nextServlet = homeServlet;
			break;
		default :
			nextServlet = pnfServlet;
			break;
		
		}
		
		return nextServlet;
		
	}

}
