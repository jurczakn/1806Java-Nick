package com.revature;

public class Driver {
	
	public static void main(String[] args) {
		
		House michealsHouse = new HouseStevan();
		useHouse(michealsHouse);
		Apartment a = (Apartment) michealsHouse;
		useApt(a);
		HouseMicheal michealsRealHouse = new HouseMicheal();
		
		michealsRealHouse.open();
		
		michealsRealHouse.hasPool();
		
	}

	public static void useHouse(House h){
		
		System.out.println("This house is " + h.getClass().getName());
		System.out.println("Has Rooms? " + h.hasRooms());
		System.out.println("Has Electricity? " + h.hasElectricity());
		System.out.println("Has Pool? " + h.hasPool());
		System.out.println("Vacant? " + h.vacant());
		
	}
	
	public static void useApt(Apartment a){
		
		System.out.println("Floor #: " + a.getFloor());
		System.out.println("Apt #: " + a.getAptNumber());
		
	}
}
