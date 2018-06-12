package com.revature;

public class Driver {

	static public void main(String... arguments) {
		// TODO Auto-generated method stub

		System.out.println(add(5, 7));

		System.out.println(add(3, 7, 15));

		int[] intArr = { 3, 5, 6, 2, 4, 6 };

		System.out.println(add(2, 3, intArr));

		int a = 1, b = 2, c = 3, d = 4;
		
		System.out.println(add(a, b, c, d));
		
		System.out.println(add(1, 2));

	}

	public static int add(int a, int b) {

		return a + b;

	}

	public static int add(int a, int b, int c) {

		return a + b + c;

	}

	/*
	 * public static int add(int[] i){
	 * 
	 * int ret = 0;
	 * 
	 * for(int x : i){
	 * 
	 * ret += x;
	 * 
	 * }
	 * 
	 * return ret;
	 * 
	 * }
	 */
	public static int add(int a, int b, int... i) {

		int ret = a + b;

		for (int x : i) {

			ret += x;

		}
		System.out.println(i.length);
		System.out.println(i[0]);

		return ret;

	}
}
