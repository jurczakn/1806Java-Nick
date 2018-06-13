package com.revature;

public class Bird {
	
	public String name;
	
	public Bird(String name) {
		super();
		this.name = name;
	}
	
	@Override
	protected void finalize() throws Throwable {
		
		super.finalize();
		System.out.println(name + " is dead");
		
	}

}
