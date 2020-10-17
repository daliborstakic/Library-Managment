package com.daliborstakic.librarymanagment;

import java.lang.String; // Import String object
import java.util.ArrayList; // Import ArrayList object

/**
 * Publisher class
 * @author daliborstakic
 */
public class Publisher {
	public String name;
	private ArrayList<Book> books;
	
	/**
	 * Publisher constructor
	 * @param name Publisher name
	 * @param books List of books with that publisher
	 * @throws Exception if books are null
	 */
	public Publisher(String name, ArrayList<Book> books) throws Exception {
		this.name = name;
	}
	
	/**
	 * Overrides current toString method
	 */
	@Override public String toString() {
		return String.format("%s", this.name);
	}
}
