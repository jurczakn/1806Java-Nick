package com.revature;

public class MyThread extends Thread{
	
	
	
	@Override
	public void run(){
		
		for(int i = 0; i < 100; i++){
			Thread t = Thread.currentThread();
			System.out.println("Inside myThread " + t.getName()
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
