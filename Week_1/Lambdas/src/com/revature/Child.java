package com.revature;

public class Child extends Parent {
	
	public int a;

	@Override
	public int getA() {
		return super.getA();
	}

	@Override
	public void setA(int a) {
		super.setA(a);
	}
	
	public int getChildA() {
		
		return this.a;
		
	}
	
	public void setChildA(int a){
		
		this.a = a;
		
	}

}
