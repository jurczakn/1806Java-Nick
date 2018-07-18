package com.revature.sports;

import org.springframework.stereotype.Component;

@Component
public class Football {
	
	public void toss(double distance, double speed){
		
		System.out.println("We just threw a football " + distance +
				"yards. It was going " + speed + " mph");
		
	}
	
	public boolean grab(String reciever){
		
		System.out.println(reciever + " is trying to catch the football");
		
		if(Math.random()>.3){
			
			return true;
			
		}
		
		return false;
		
	}
	
	public String grab(){
		
		System.out.println("A reciever is trying to catch the football");
		
		if(Math.random()>.3){
			
			return "It was caught";
			
		}
		
		return "It was not caught";
		
	}

}
