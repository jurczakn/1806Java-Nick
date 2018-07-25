package com.revature.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.service.FlashCardService;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		FlashCardService fc = (FlashCardService) ac.getBean("flashCardService");
		System.out.println(fc.findAllFlashCards());
		System.out.println(fc.findFlashCard(2));
		System.out.println(fc.findByAnswer("It better"));

	}

}
