package com.daliborstakic.librarymanagment;

import java.lang.String; // Importing String
import java.util.ArrayList; // Importing the ArrayList

/**
 * Library class
 * @author daliborstakic
 */
public class Library {
	public String name;
	private ArrayList<Book> books;
	
	/**
	 * Library constructor
	 * @param name is the libraries names
	 * @param books represents an ArrayList of "Book" objects
	 */
	public Library(String name, ArrayList<Book> books) {
		this.name = name;
		this.setBooks(books);
	}

	/**
	 * Books getter
	 * @return an ArrayList of "Book" objects
	 */
	public ArrayList<Book> getBooks() {
		return books;
	}

	/**
	 * Books setter
	 * @param books represents an ArrayList of "Book" objects
	 */
	public void setBooks(ArrayList<Book> books) { // books Setter
		this.books = books;
	}
	
	/**
	 * Adds a book to the ArrayList
	 * @param book the book which needs to be added
	 * @throws Exception if the book parameter is null
	 */
	public void addBook(Book book) throws Exception {
		if (book != null) {
			throw new Exception("Book cannot be null!");
		} else {
			this.books.add(book);
		}
	}
}
