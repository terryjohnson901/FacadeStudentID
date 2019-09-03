package com.coding4all.facade;

public class TestStudentID {

	public static void main(String[] args) {
		LibraryAccount gettingID = new LibraryAccount(900123456, 0001);
		
		gettingID.checkOut(2);
		
		gettingID.checkIn(3);

	}

}
