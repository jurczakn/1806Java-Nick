package com.revature;

public class Driver {
	

	
	public static void main(String[] args) {
		
		Character c1 = new Character('z');
		
		char c2 = 'a';
		
		Character c3 = 'p';
		
		char c4 = new Character('l');
		
		System.out.println(c1 + c4);
		
		System.out.println((char)(c2-c3));
		
		takeChar(c1);
		takeChar(c2);
		takeCharacter(c2);
		takeCharacter(c1);
		
	}
	
	public static void takeChar(char... c){
		
		System.out.println("now I take int");
		
	}
	
	public static void takeCharacter(Character c){
		
		System.out.println("it thinks this is a character");
		
	}
	
	public static void takeCharacter(char c){
		
		System.out.println("I am really confused now");
		
	}
	
	public static void takeChar(Character... c){
		
		System.out.println("Which gets called?");
		
	}

}
