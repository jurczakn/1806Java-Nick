package com.revature;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		
		for(int i = 0; i < 100; i++){
			
			Thread t = Thread.currentThread();
			System.out.println("Inside myRunnable " + t.getName()
					+ ": " + i);
			
			try {
				t.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
