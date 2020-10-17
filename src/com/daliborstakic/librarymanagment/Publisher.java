package com.daliborstakic.librarymanagment;

import java.lang.String; // Import String object

/**
 * Publisher class
 * @author daliborstakic
 */
public class Publisher {
	public String name;
	
	/**
	 * Publisher constructor
	 * @param name Publisher name
	 */
	public Publisher(String name) {
		this.name = name;
	}
	
	/**
	 * Overrides current toString method
	 */
	@Override public String toString() {
		return String.format("%s", this.name);
	}
}
