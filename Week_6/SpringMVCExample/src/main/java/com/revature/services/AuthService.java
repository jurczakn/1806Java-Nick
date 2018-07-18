package com.revature.services;

import org.springframework.stereotype.Service;

import com.revature.beans.User;

@Service
public class AuthService {
	
	public User auth(User user){
		
		User authUser = null;
		
		System.out.println("Username: " + user.getUsername());
		System.out.println("Password: " + user.getPassword());
		
		if("JohnMclane".equals(user.getUsername()) &&
				"yipiekaiyah".equals(user.getPassword())){
			
			authUser = user;
			
		}
		
		return authUser;
		
	}

	public AuthService() {
		super();
	}
	
	

}
