package com.revature.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PrintWriterExample extends HttpServlet{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
		PrintWriter writer = resp.getWriter();
		writer.write("<h1>Hello, world</h1>");
		writer.write("<h1>Using RESTful Pokemans API</h1>" +
    "<input type=\"number\" id=\"pokemansid\" placeholder=\"enter pokemans id here\"/>" +
    "<inpu type=\"submit\" value=\"Get Pokemans Info\" id=\"pokemansSubmit\"/>" +
    "<h3 id=\"pokemansName\"></h3>");
		//writer.flush();
		
		
	}

}
