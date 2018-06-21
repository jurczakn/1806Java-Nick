package com.revature;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LambdaTestDriver {

	public static void useAdder(Adder a){
		
		System.out.println("using adder with 4 and 5");
		System.out.println(a.add(10, 5));
		
	}
	
	public static void main(String[] args) {
		
		useAdder((Integer x, Integer y)->x + y);
		useAdder((x, l) -> x + l + 19);
		Adder a = (x, y) -> {if (x > y) return (int) Math.random()*100; return y - x;};
		
		System.out.println(a.add(4, 7));
		
		List<Integer> intList = new LinkedList<Integer>();
		intList.add(3);
		intList.add(15);
		intList.add(73);
		intList.add(30);
		System.out.println("Initial List: " + intList);
		Collections.sort(intList);
		System.out.println("After natural ordering" + intList);
		Collections.sort(intList, (i, j)->{return j - i;});
		System.out.println("after my ordering: " + intList);

	}

}
