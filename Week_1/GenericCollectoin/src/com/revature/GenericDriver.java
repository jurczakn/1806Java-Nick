package com.revature;

public class GenericDriver {

	public static void main(String[] args) {

		Calculator<Integer> calcI = new Calculator<Integer>();
		
		System.out.println(calcI.add(5, 7));
		
		Calculator<Float> calcF = new Calculator<Float>();
		
		System.out.println(calcF.add(5.5f, 9.8f));

	}

}
