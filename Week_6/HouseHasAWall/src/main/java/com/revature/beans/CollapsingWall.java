package com.revature.beans;

import org.springframework.stereotype.Component;

@Component
public class CollapsingWall implements WallInterface {

	@Override
	public String getMaterial() {
		// TODO Auto-generated method stub
		return "This house is not safe to live in";
	}

	@Override
	public void setMaterial(String material) {
		// TODO Auto-generated method stub

	}

}
