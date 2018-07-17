package com.revature.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.beans.House;

public class Driver {
	
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		
		House h = (House) ac.getBean("house");
		
		House h2 = (House) ac.getBean("house");
		
		h2.setName("My House");
		
		System.out.println(h2);
		
		h.setName("Matt's House");
		h.getWall().setMaterial("Bronze");
		
		System.out.println(h);
		
		System.out.println(h2);
		
		((AbstractApplicationContext)ac).close();

	}

}
