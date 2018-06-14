package com.revature;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CollectionDriver {
	
	public static void main(String[] args) {
		List<Integer> intList = new LinkedList<>();
		
		intList.add(11);
		int[] intArr = {4, 5, 6, 2, 11, 7676};
		intList.add(11);
		intList.add(4);
		intList.add(5);
		intList.add(6);
		intList.add(7);
		intList.add(8);
		
		for(Integer i : intList){
			
			System.out.println("The next int it " + i);
			
		}
		
		Iterator<Integer> intIter = intList.iterator();
		
		while(intIter.hasNext()){
			
			System.out.println(intIter.next());
			
		}
		
	}

}
