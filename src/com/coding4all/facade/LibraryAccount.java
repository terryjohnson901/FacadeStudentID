package com.coding4all.facade;

public class LibraryAccount {
	private int id;
	
	private int pin;
	
	IDCheck idChecker;
	PinCheck pinChecker;
	BookCheckOut bookChecker;
	
	public LibraryAccount(int newIdNum, int newPinCode) {
		
		id = newIdNum;
		pin = newPinCode;
		
		idChecker = new IDCheck();
		pinChecker = new PinCheck();
		bookChecker = new BookCheckOut();
	}
	
	public int getId() {return id;}
	
	public int getPin() {return pin;}
	
	public void checkOut(int booksToGet) {
		if(idChecker.accountActive(getId()) && 
			pinChecker.pinActive(getPin()) &&
			bookChecker.sufficientBalance(booksToGet)){
			
			System.out.println("Checkout complete!");
	} 
		else {
			System.out.println("You have too many books still.");
		}

}
	public void checkIn(int booksToReturn) {
		
		if(idChecker.accountActive(getId()) && 
				pinChecker.pinActive(getPin()) &&
				bookChecker.sufficientBalance(booksToReturn)){
				
				System.out.println("Checkout complete!");
		} 
		else {
			System.out.println("You have too many books still.");
		}
	}
}