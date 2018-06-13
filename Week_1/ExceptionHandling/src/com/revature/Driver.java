package com.revature;

import java.io.FileNotFoundException;

public class Driver {
	// VVV---for propogating the exception
	public static void main(String[] args) {//throws Exception {
		unchecked();
		try {
			if (Math.random() < 0.5) {
				// System.out.println("File not found thrown");
				throw new FileNotFoundException();
			} else if (Math.random() < 0.5) {
				// System.out.println("My exception thrown");
				throw new MyException();
			}
		} catch (FileNotFoundException e) {
			System.out.println("Caught file not found.. the file probably does not exist");
			try {
				throw new Exception();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} catch (MyException e) {
			System.out.println("My exception catch block");
		} catch (Exception e) {
			System.out.println("This is my exception");
			e.printStackTrace();
		} finally {
			System.out.println("this will always run");
		}

		try {
			//throw new Exception();
		} finally {
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void doThis() throws MyException{
		
		new DriverII().throwsException();
		
	}
	
	public void throwsException() throws MyException{
		
		return;
		
	}
	
	public static void unchecked(){
		
		Object o = null;
		System.out.println("before");
		o.getClass();
		System.out.println("after");
		
		throw new RuntimeException();
		
	}

}
