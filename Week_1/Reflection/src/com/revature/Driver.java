package com.revature;

import java.lang.reflect.Field;

public class Driver {

	public static void main(String[] args) {
		String s = "Class String";
		
		System.out.println("Old value: " + s);
		
		Class<String> stringClass = String.class;
		
		try {
			Field value = stringClass.getDeclaredField("value");
			value.setAccessible(true);
			value.set(s, "new value".toCharArray());
			System.out.println("New Value: " + s);
			System.out.println("Class String");
			String s2 = new String("Class String");
			System.out.println(s2);
		} catch (NoSuchFieldException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
