package com.revature.dao;

import java.util.List;

import com.revature.pojos.FlashCard;

/*Dao is a design patter used to manage all of your
CRUD operation for you pojos inside your application.
We will use this DAO to connect to our external Database*/
public interface FlashCardDao {
	
	public FlashCard getFlashCard(int id);
	
	public void createFlashCard(FlashCard fc);
	
	public void createFlashCardPreparedStmt(FlashCard fc);
	
	public void deleteFlashCard(FlashCard fc);
	
	public List<FlashCard> getAllFlashCards();
	
	public void updateFlashCard(FlashCard fc);
	
}
