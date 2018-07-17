package com.revature.beans;

public class Wall implements WallInterface{
	
	private String material = "Wood";

	public Wall() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Wall(String material) {
		super();
		this.material = material;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "Wall [material=" + material + "]";
	}

}
