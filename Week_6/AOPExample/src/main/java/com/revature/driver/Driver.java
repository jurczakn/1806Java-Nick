package com.revature.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.sports.Football;

public class Driver {
	
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		
		Football ftb = (Football) ac.getBean("football");
		
		ftb.toss(79, 36);
		
		ftb.grab("Darell Revis");
		
		ftb.grab();
		
	}

}
