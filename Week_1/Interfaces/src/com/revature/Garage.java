package com.revature;

public abstract class Garage {
	
	private int x;
	
	public Garage(int x){
		
		this.x = x;
		
	}
	
	public Garage(){
		
		this(7);
		
	}
	
	public static void main(String args[]){}
	
	public void open(){
		
		System.out.println("the garage door is now open");
		
	}
	
	public void close(){
		
		System.out.println("The garage door is now closed");
		
	}
	
	abstract void parkCar();
	
	public abstract int getDoors();
	
	public abstract double getOpenerSpeed();

}
