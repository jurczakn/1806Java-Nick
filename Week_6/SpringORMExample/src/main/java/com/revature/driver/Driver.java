package com.revature.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.dao.FlashCardDao;

public class Driver {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		FlashCardDao fcDao = (FlashCardDao) ac.getBean("flashCardDaoImpl");
		System.out.println(fcDao.getFlashCard(1));

	}

}
