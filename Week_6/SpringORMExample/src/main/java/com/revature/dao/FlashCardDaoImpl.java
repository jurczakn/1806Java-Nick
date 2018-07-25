package com.revature.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.revature.pojos.FlashCard;

@Component
@Transactional(readOnly=false, propagation=Propagation.REQUIRED)
public class FlashCardDaoImpl implements FlashCardDao {

	@Autowired
	private SessionFactory sf;
	
	@Override
	public FlashCard getFlashCard(int id) {
		Session sess = sf.getCurrentSession();
		return (FlashCard) sess.get(FlashCard.class, id);
	}

	@Override
	public List<FlashCard> getAllFlashCards() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveFlashCard(FlashCard fc) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateFlashCard(FlashCard fc) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeFlashCard(FlashCard fc) {
		// TODO Auto-generated method stub

	}

}
