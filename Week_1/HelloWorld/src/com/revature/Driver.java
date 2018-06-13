package com.revature;

import java.util.Scanner;

import com.revature.flow.FlowControl;

public class Driver {
	
	static public void main(String pirateSounds[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hello, what is your name?");
		
		String name = sc.nextLine();
		
		System.out.println("Nice to meet you " + name);
		
		System.out.println("How old are you?");
		
		Integer age = sc.nextInt();
		
		System.out.println("Wow, you were born in " + (2018 - age));
		
		/*System.out.println(pirateSounds[0]);
		System.out.println(pirateSounds[1]);
		System.out.print("Hello World!");
		
		FlowControl fc = new FlowControl(5);
		fc.ifMethod(true, 3);
		System.out.println("------------");
		fc.ifMethod(false, 8);
		System.out.println("------------");
		fc.switchMethod("fallthrough");
		System.out.println("------------");
		fc.loopMethod(12, "hi");
		System.out.println("------------");
		fc.whileMethod("hi");*/
		
	}

}
