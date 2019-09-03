package com.coding4all.facade;

public class PinCheck {

private int pin = 0001;
	
	public int getPin() {return pin;}
	
	public boolean pinActive(int pinToCheck) {
		
		if(pinToCheck == getPin()) {
			return true;
		}
		else {
			return false;
		}
	}

}

