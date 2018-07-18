package com.revature.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.revature.beans.User;
import com.revature.services.AuthService;

@Controller
public class LoginCtrl {

	@Autowired
	private AuthService authService;
	
	@RequestMapping("/Login")
	public String loginGet(ModelMap modelMap){
		
		System.out.println("inside get method of login");
		User user = new User();
		modelMap.addAttribute(user);
		return "Login";
		
	}
	
	@RequestMapping(value="/Login", method=RequestMethod.POST)
	public String loginPost(User user, ModelMap modelMap){
		
		User authUser = authService.auth(user);
		
		if (!user.equals(authUser)){
			
			modelMap.addAttribute("errorMessage", "Username/Password incorrect");
			return "Login";
			
		}
		
		return "Home";
		
	}

	public LoginCtrl() {
		super();
		// TODO Auto-generated constructor stub
	}

	//@Autowired
	public LoginCtrl(AuthService authService) {
		super();
		this.authService = authService;
	}
	
	
	
}
