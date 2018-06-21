package com.revature;

public class Driver {

	public static void main(String[] args) {
	
		MyThread t = new MyThread();
		t.start();
		//t.run();  not how you run a thread
		MyRunnable r = new MyRunnable();
		Thread t2JudgementDay = new Thread(r);
		
		t2JudgementDay.start();
		
	}

}
