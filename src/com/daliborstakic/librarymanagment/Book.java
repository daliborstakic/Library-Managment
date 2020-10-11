package com.daliborstakic.librarymanagment;

import java.lang.String; // Importing String

/**
 * Book class
 * @author Dalibor
 */
public class Book {
	public String author, name; // Book author and name fields
	private int numOfPages; // Private attribute
	
	/**
	 * Book constructor
	 * @param author is the name of the author
	 * @param name is the name of the book
	 * @param numOfPages represents number of pages
	 * @throws Exception if the number of pages is less than 0
	 */
	public Book(String author, String name, int numOfPages) throws Exception {
		this.author = author; // Will change the Author to a separate class
		this.name = name;
		
		if (numOfPages >= 0) {
			this.numOfPages = numOfPages;
		} else {
			throw new Exception("Number of pages can't be less than 0!");
		}
	}
	
	/**
	 * numOfPages getter
	 * @return the number of pages
	 */
	public int getNumOfPages() {
		return this.numOfPages;
	}
	
	/**
	 * numOfPages setter
	 * @param numOfPages new value for number of pages
	 * @throws Exception if the number of pages is less than 0
	 */
	public void setNumOfPages(int numOfPages) throws Exception {
		if (numOfPages >= 0) {
			this.numOfPages = numOfPages;
		} else {
			throw new Exception("Number of pages can't be less than 0!");
		}
	}
	
	/**
	 * Overrides the toString() method
	 */
	@Override public String toString() {
		return String.format("Book: %s - %s", this.author, this.name);
	}
}
