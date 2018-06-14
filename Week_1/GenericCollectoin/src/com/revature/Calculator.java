package com.revature;

public class Calculator <T extends Number>{
	
	public T add(T t1, T t2){
		
		Number ret = t1.doubleValue() + t2.doubleValue();
		
		return (T) ret;
		
	}

}
