package com.revature.daos;

import java.util.ArrayList;
import java.util.List;

import com.revature.pojos.Witches;

public class WitchesDao {
	
	private static List<Witches> witchList = new ArrayList<Witches>();
	
	public WitchesDao(){
		
		witchList.add(new Witches("Linh", "female", true, true, 100));
		witchList.add(new Witches("Stevan", "male", false, true, 101));
		
	}
	
	public Witches getWitch(String name){
		
		Witches returnWitch = null;
		
		for(Witches w : witchList){
			
			if (w.getName().equals(name)){
				
				returnWitch = w;
				
			}
			
		}
		
		return returnWitch;
		
	}

}
