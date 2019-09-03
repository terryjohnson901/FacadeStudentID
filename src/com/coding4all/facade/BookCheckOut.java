package com.coding4all.facade;

public class BookCheckOut {
	private int booksInAccount = 5;
	
	public int getBooksInAccount() {return booksInAccount;}
	
	public void decreaseBooksInAccount(int bookCheckedOut) {
		booksInAccount-= bookCheckedOut;
	}

	public void increaseBooksInAccount(int bookCheckedIn) {
		booksInAccount += bookCheckedIn;
	}
	
	public boolean sufficientBalance(int booksToCheckout){
		
		if(booksToCheckout >= getBooksInAccount()) {
		System.out.println("You still have not returned a previous book.");
		
		System.out.println("This how many books you currently have: " +getBooksInAccount());
		
		return false;
	}
		else {
			decreaseBooksInAccount(booksToCheckout);
			
			System.out.println("Your good to go! The amount of books you have is: " +getBooksInAccount());
			
			return true;
		}
}
	public void returnBook(int booksToReturn) {
		
		increaseBooksInAccount(booksToReturn);
		
		System.out.println("Check in complete." +getBooksInAccount());
	}
}
