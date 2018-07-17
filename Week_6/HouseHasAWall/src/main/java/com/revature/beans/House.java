package com.revature.beans;

public class House {

	private String name;
	
	private WallInterface wall;

	public House() {
		super();
		// TODO Auto-generated constructor stub
	}

	public House(String name, Wall wall) {
		super();
		this.name = name;
		this.wall = wall;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WallInterface getWall() {
		return wall;
	}

	public void setWall(WallInterface wall) {
		this.wall = wall;
	}

	@Override
	public String toString() {
		return "House [name=" + name + ", wall=" + wall + "]";
	}

	
}
