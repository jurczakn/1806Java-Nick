package com.revature;

public class VaribleShadowing {
	
	public static void main(String[] args) {
		Child c = new Child();
		
		System.out.println("get a publicly:" +c.a);
		c.setA(5);
		System.out.println("set a to 5");
		c.setChildA(10);
		System.out.println("set child a to 10");
		System.out.println("get a:" + c.getA());
		System.out.println("get child a:" + c.getChildA());
		System.out.println("get a publicly as parent: " + ((Parent)c).a);
	}

}
