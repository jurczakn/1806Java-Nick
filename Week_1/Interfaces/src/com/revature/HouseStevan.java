package com.revature;

public class HouseStevan implements House, Apartment {

	@Override
	public boolean hasElectricity() {
		return false;
	}

	@Override
	public boolean hasRooms() {
		return false;
	}

	@Override
	public boolean vacant() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasPool() {
		return true;
	}

	@Override
	public int getFloor() {

		return 7;
	}

	@Override
	public int getAptNumber() {
		// TODO Auto-generated method stub
		return 701;
	}

}
