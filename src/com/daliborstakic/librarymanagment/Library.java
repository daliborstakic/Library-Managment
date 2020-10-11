package com.daliborstakic.librarymanagment;

import java.lang.String; // Importing String
import java.util.ArrayList; // Importing the ArrayList

// Library class
public class Library {
	public String name;
	private ArrayList<Book> books;
	
	public Library(String name, ArrayList<Book> books) {
		this.name = name;
		this.setBooks(books);
	}

	public ArrayList<Book> getBooks() { // books Getter
		return books;
	}

	public void setBooks(ArrayList<Book> books) { // books Setter
		this.books = books;
	}
}
