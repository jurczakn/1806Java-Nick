package com.revature.dao;

import java.util.List;

import com.revature.pojos.FlashCard;

public interface FlashCardDao {
	
	public FlashCard getFlashCard(int id);
	
	public List<FlashCard> getAllFlashCards();
	
	public void saveFlashCard(FlashCard fc);
	
	public void updateFlashCard(FlashCard fc);
	
	public void removeFlashCard(FlashCard fc);

}
