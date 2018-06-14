package com.revature.pojo;

import java.io.Serializable;

public class Book implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8868466771008817877L;

	private String story;
	
	private transient String rawText;
	
	private String Author;
	
	private String Title;
	
	private int pageCount;

	public String getStory() {
		return story;
	}

	public void setStory(String story) {
		this.story = story;
	}

	public String getRawText() {
		return rawText;
	}

	public void setRawText(String rawText) {
		this.rawText = rawText;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String story, String rawText, String author, String title, int pageCount) {
		super();
		this.story = story;
		this.rawText = rawText;
		Author = author;
		Title = title;
		this.pageCount = pageCount;
	}

	@Override
	public String toString() {
		return "Book [story=" + story + ", rawText=" + rawText + ", Author=" + Author + ", Title=" + Title
				+ ", pageCount=" + pageCount + "]";
	}
	

}
