package driver;

//import static pojo.Car.WHEELS;
//import static pojo.Car.HEADLIGHTS;
import static pojo.Car.*;

import pojo.Car;
//import pojo.Car;
import pojo.Gallons;
import pojo.Liters;
import pojo.MoreSpecificTypeOfCar;

public class Driver {
	
	public static void main(String[] args) {
		
/*		Car myCar = new MoreSpecificTypeOfCar();
		
		System.out.println(myCar.getColor());
		
		System.out.println(myCar.getDoors());
		
		System.out.println(((MoreSpecificTypeOfCar)myCar).nox());*/
		
/*		MoreSpecificTypeOfCar myCar = new MoreSpecificTypeOfCar();
		myCar.openDoors();
		System.out.println(myCar.gas);
		myCar.fillGas();
		System.out.println(myCar.gas);
		Gallons g = new Gallons();
		g.amount = 1;
		myCar.fillGas(g);
		System.out.println(myCar.gas);
		Liters l = new Liters();
		l.amount = 1;
		myCar.fillGas(l);
		System.out.println(myCar.gas);*/
		
/*		String s1 = "new";
		String s2 = "new";
		System.out.println(s1==s2);
		String s3 = new String("new");
		System.out.println(s1==s3);*/
		
		pojo.Car myCar = new pojo.Car();
		
		System.out.println(WHEELS);
		
		System.out.println(HEADLIGHTS);
		
		//int[] intArr = new int[5];
		int[]intArr = {5, 3, 2, 33, 9};
		System.out.println(intArr.getClass().getName());
		
		System.out.println(intArr.toString());
		
		System.out.println(intArr[1]);
		
		intArr[3] = 22000;
		
		System.out.println(intArr[3]);
	}

}
