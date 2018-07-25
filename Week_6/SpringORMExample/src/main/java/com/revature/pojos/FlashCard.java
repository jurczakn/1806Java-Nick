package com.revature.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FLASH_CARDS")
public class FlashCard {
	
	@Id
	@Column(name="FC_ID")
	private Integer id;
	
	@Column(name="FC_QUESTION")
	private String question;
	
	@Column(name="FC_ANSWER")
	private String answer;

	public FlashCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FlashCard(Integer id, String question, String answer) {
		super();
		this.id = id;
		this.question = question;
		this.answer = answer;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "FlashCard [id=" + id + ", question=" + question + ", answer=" + answer + "]";
	}
	
	

}
