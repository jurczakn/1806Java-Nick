package pojo;

import java.io.Serializable;

public class Car implements Serializable{
	
	private int gears;
	
	private double speed;
	
	private int doors;
	
	private String color;
	
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


