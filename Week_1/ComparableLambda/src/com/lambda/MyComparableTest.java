package com.lambda;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyComparableTest {

	public MyComparableTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		
		Comparable myComparable = (x) -> x.hashCode() - 10000;
		
		Class myComparableClass = myComparable.getClass();
		
		System.out.println(myComparableClass.getName());
		
		List<Comparable> myList = new ArrayList<>();
		
		Constructor[] constructors = myComparableClass.getDeclaredConstructors();
		
		System.out.println("Is instance of comparable: " + myComparable instanceof Comparable);
		
        for (Constructor constructor : constructors) 
        {
            constructor.setAccessible(true);
            for(int i = 0; i < 10; i++){
            	
            	myList.add((Comparable) constructor.newInstance());
            	
            }
        }
		
		myList.add(myComparable);

		System.out.println("List Unsorted");
		
		myList.forEach((x) -> {System.out.println(x);});
		
		Collections.sort(myList);
		
		System.out.println("List Sorted");
		
		myList.forEach((x) -> {System.out.println(x);});

	}

}
