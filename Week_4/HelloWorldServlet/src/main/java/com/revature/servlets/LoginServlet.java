package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		resp.sendRedirect("login.html");
		
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		System.out.println("username = " + username);
		System.out.println("password = " + password);
		HttpSession sess = req.getSession();
		
		String role = "";
		
		if("nick".equals(username) && "1234".equals(password)){
			
			role = "admin";
			
		}
		
		else if("caleb".equals(username) && "9876".equals(password)){
			
			role = "employee";
			
		}
		
		switch(role){
		
		case "admin": 
			req.getRequestDispatcher("adminHome.html").forward(req, resp);
			break;
		case "employee":
			req.getRequestDispatcher("emphome.html").forward(req, resp);
			break;
		default:
			resp.sendRedirect("login.html");
		}
		
	}

}
