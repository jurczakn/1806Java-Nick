package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.dao.FlashCardRepository;
import com.revature.pojos.FlashCard;

@Service
@Transactional
public class FlashCardService {
	
	@Autowired
	private FlashCardRepository fcRepo;
	
	public List<FlashCard> findAllFlashCards(){
		
		return fcRepo.findAll();
		
	}
	
	public FlashCard findFlashCard(int id){
		return fcRepo.findOne(id);
	}
	
	public List<FlashCard> findByAnswer(String answer){
		return fcRepo.findFlashCardsByAnswer(answer);
	}

}
