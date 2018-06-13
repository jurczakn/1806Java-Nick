package com.revature;

public interface House {
	
	int x = 5;  // all variables in interfaces are implicitly public static final
	
	public int y = 7;
	
	final int z = 9;
	
	static int g = 12;
	
	public static final int variable = 99;
	
	 boolean hasElectricity(); //public implicity
	
	public boolean hasRooms();
	
	public boolean vacant();
	
	public boolean hasPool();

}
