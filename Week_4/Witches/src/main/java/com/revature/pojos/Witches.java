package com.revature.pojos;

public class Witches {

	private String name;
	
	private String gender;
	
	private boolean canFloat;
	
	private boolean canHex;
	
	private int witchLevel;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public boolean isCanFloat() {
		return canFloat;
	}

	public void setCanFloat(boolean canFloat) {
		this.canFloat = canFloat;
	}

	public boolean isCanHex() {
		return canHex;
	}

	public void setCanHex(boolean canHex) {
		this.canHex = canHex;
	}

	public int getWitchLevel() {
		return witchLevel;
	}

	public void setWitchLevel(int witchLevel) {
		this.witchLevel = witchLevel;
	}

	public Witches() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Witches(String name, String gender, boolean canFloat, boolean canHex, int witchLevel) {
		super();
		this.name = name;
		this.gender = gender;
		this.canFloat = canFloat;
		this.canHex = canHex;
		this.witchLevel = witchLevel;
	}

	@Override
	public String toString() {
		return "Witches [name=" + name + ", gender=" + gender + ", canFloat=" + canFloat + ", canHex=" + canHex
				+ ", witchLevel=" + witchLevel + "]";
	}
	
	
}
