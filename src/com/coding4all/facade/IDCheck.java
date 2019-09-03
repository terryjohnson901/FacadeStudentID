package com.coding4all.facade;

public class IDCheck {
	
	private int id = 900123456;
	
	public int getID() {return id;}
	
	public boolean accountActive(int idToCheck) {
		
		if(idToCheck == getID()) {
			return true;
		}
		else {
			return false;
		}
	}

}
