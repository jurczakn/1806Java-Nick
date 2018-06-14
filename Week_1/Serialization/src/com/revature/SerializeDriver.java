package com.revature;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.revature.pojo.Book;

public class SerializeDriver {
	
	public static void main(String[] args) {
		Book bible = new Book("true story", "real raw", "There were a lot", "The Bible", 15000);
		Book javaTextBook = new Book("java is pass by reference", 
				"java is a functional language", "1608Java-Nick", "Welcome to The Java", 5);
		Book dictionary = new Book("words", "all the words", 
				"The English Language", "Dictionary Pt: 1, return of the phrases", 2);
		writeBook(bible, "src/com/revature/bible.dat");
		
		System.out.println(readBook("src/com/revature/bible.dat"));
		
				
	}
	
	public static void writeBook(Book b, String filename){
		
		try(ObjectOutputStream oos = 
				new ObjectOutputStream(new FileOutputStream(filename))){
			oos.writeObject(b);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static Book readBook(String filename){
		Book b = null;
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))){
			b = (Book) ois.readObject();
		}catch(IOException e){
			e.printStackTrace();
		} catch(ClassNotFoundException e){
			e.getMessage();
		};
		
		
		return b;
		
	}

}
