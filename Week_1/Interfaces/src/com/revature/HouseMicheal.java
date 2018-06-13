package com.revature;

public class HouseMicheal extends Garage implements House{
	
	public boolean hasRooms(){
		
		return true;
		
	}

	public boolean hasElectricity(){
		
		return true;
		
	}
	
	public boolean hasPool(){
		
		return false;
		
	}
	
	public boolean vacant(){
		
		return false;
		
	}

	@Override
	public void parkCar() {
		System.out.println("this is a tight fit");
		
	}

	@Override
	public int getDoors() {
		return 2;
	}

	@Override
	public double getOpenerSpeed() {
		return 90.0;
	}
	
	public HouseMicheal(){
		
		super(9);
		
	}
}
