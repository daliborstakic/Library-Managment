package com.daliborstakic.librarymanagment;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		// List of Publishers
		Publisher publishers[] = {new Publisher("Vulkan"), new Publisher("Laguna"), new Publisher("Kontrast")};
		
		// Adding books
		try {
			Author authors[] = {new Author("Albert", "Camus", 45), new Author("Ivo", "Andric", 70), new Author("Franc", "Kafka", 42)};
			
			// Creating an ArrayList of books
			ArrayList<Book> books = new ArrayList<Book>();
			
			books.add(new Book(authors[0], "Kuga", 200, publishers[2]));
			books.add(new Book(authors[1], "Prokleta avlija", 150, publishers[1]));
			books.add(new Book(authors[2], "Amerika", 250, publishers[0]));
			
			// Creating an Library object
			Library library = new Library("Nova biblioteka", books);
			
			// Printing the Library object
			System.out.println(library.toString());
		} catch (Exception e) {
			return;
		}
	}
}
