package com.revature;

public class Driver {
	
	public static void main(String[] args) {
		Bird canadaGoose = new Bird("canadaGoose");
		Bird mexicoGoose = new Bird("mexicoGoose");
		
		canadaGoose = null;
		System.gc();
		mexicoGoose = null;
		
		for (int i = 0; i < 1000000; i++){
			
			new Bird("Tweety #"+i);
			System.out.println(i);
			//System.gc();
			
		}
		System.gc();
		
	}

}
