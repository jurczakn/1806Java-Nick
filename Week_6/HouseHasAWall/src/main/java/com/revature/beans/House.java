package com.revature.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value="myHouse")
@Scope("prototype")
public class House {

	private String name;
	
	@Autowired
	@Qualifier("myWall")
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
