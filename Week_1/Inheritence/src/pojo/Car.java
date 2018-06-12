package pojo;

import java.io.Serializable;

public class Car implements Serializable{
	
	public static final int WHEELS = 4;
	
	public static final int HEADLIGHTS = 2;
	
	public double gas = 0;
	
	public double tankSize = 15;
	
	private int gears;
	
	private double speed;
	
	private int doors;
	
	private String color;

	public void openDoors(){
		
		System.out.println("I am opening the doors, it is very boring to watch");
		
	}
	
	Car doOverride(){
		System.out.println("This method is to be overriden");
		return this;
	}
	
	public Car(){
		super();
	}

	public void setGears(int gears)
	{
		this.gears = gears;
	}
	
	public void setDoors(int doors)
	{
		this.doors = doors;
	}
	
	public void setSpeed(double speed)
	{
		this.speed = speed;
	}

	public void setColor(String color)
	{
		this.color = color;
	}

	public int getGears()
	{
		return gears;
	}
	
	public int getDoors()
	{
		return doors;
	}

	public double getSpeed()
	{
		return speed;
	}
	
	public String getColor()
	{
		return color;
	}
}


