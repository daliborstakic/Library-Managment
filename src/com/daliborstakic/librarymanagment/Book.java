package com.daliborstakic.librarymanagment;

import java.lang.String; // Importing String

public class Book {
	public String author, name; // Book author and name fields
	private int numOfPages; // Private attribute
	
	public Book(String author, String name, int numOfPages) throws Exception {
		this.author = author;
		this.name = name;
		
		if (numOfPages >= 0) {
			this.numOfPages = numOfPages;
		} else {
			throw new Exception("Number of pages can't be less than 0!"); // Throws exception if value less than 0
		}
	}
	
	public int getNumOfPages() { // Number of pages getter
		return this.numOfPages;
	}
	
	public void setNumOfPages(int numOfPages) throws Exception { // Number of pages setter
		if (numOfPages >= 0) {
			this.numOfPages = numOfPages;
		} else {
			throw new Exception("Number of pages can't be less than 0!"); // Throws exception if value less than 0
		}
	}
	
	// Overriding toString method
	@Override public String toString() {
		return String.format("Book: %s - %s", this.author, this.name); // Format Book: %s - %s
	}
}
