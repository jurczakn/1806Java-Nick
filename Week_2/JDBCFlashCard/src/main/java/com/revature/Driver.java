package com.revature;

import java.util.Scanner;

import com.revature.dao.FlashCardDao;
import com.revature.dao.FlashCardDaoImpl;
import com.revature.pojos.FlashCard;

public class Driver {
	
	private static FlashCardDao fcDao = new FlashCardDaoImpl();

	public static void main(String[] args) {
/*		ConnectionUtil cu = ConnectionUtil.getInstance();
		try {
			Connection conn = cu.getConnection();
	
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("could not make connection to DB");
		}*/
		
		System.out.println("ok");
		System.out.println("Input question for flash card");
		Scanner sc = new Scanner(System.in);
		String question = sc.nextLine();
		System.out.println("Input answer");
		String answer = sc.nextLine();
		fcDao.createFlashCardPreparedStmt(new FlashCard(1, question, answer));
		


	}

}
