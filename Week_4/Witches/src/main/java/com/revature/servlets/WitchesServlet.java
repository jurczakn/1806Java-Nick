package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.daos.WitchesDao;
import com.revature.pojos.Witches;

/**
 * Servlet implementation class WitchesServlet
 */
public class WitchesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static WitchesDao wd = new WitchesDao();
	
    /**
     * Default constructor. 
     */
    public WitchesServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		Witches w = wd.getWitch(name);
		ObjectMapper mapper = new ObjectMapper();
		String witchString = mapper.writeValueAsString(w);
		response.getWriter().write(witchString);
		//response.getWriter().write(w.toString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		Witches w = mapper.readValue(request.getReader().readLine(), Witches.class);
		System.out.println(w);
	}

}
