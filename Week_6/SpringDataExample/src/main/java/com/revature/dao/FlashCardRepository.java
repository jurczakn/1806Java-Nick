package com.revature.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.pojos.FlashCard;

@Repository
public interface FlashCardRepository extends JpaRepository<FlashCard, Integer>{
	
	public List<FlashCard> findFlashCardsByAnswer(String answer);

}
