package driver;

import pojo.Car;
import pojo.MoreSpecificTypeOfCar;

public class Driver {
	
	public static void main(String[] args) {
		
		Car myCar = new MoreSpecificTypeOfCar();
		
		System.out.println(myCar.getColor());
		
		System.out.println(myCar.getDoors());
		
		System.out.println(((MoreSpecificTypeOfCar)myCar).nox());
		
	}

}
