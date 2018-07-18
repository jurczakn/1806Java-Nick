package com.revature.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping("/help")
public class HelpController {
	
	@RequestMapping(value="/help", method=RequestMethod.GET)
	public String getHelp(HttpSession session, ModelMap mm){
		Object count = session.getAttribute("count");
		Integer helpCounts = 0;
		if(count != null) helpCounts = helpCounts + (Integer) count;


		session.setAttribute("count", ++helpCounts);
		System.out.println("help count: " + helpCounts);
		return "forward:resources/help.html";
		
	}

}
