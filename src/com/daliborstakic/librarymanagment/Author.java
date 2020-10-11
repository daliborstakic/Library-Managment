package com.daliborstakic.librarymanagment;

import java.lang.String; // Importing String

public class Author {
	public String fName; // First name
	public String lName; // Last name
	private int age;
	
	/**
	 * Author constructor
	 * @param fName Author first name
	 * @param lName Author last name
	 * @param age Author age
	 * @throws Exception if the age is less than or equal to 0
	 */
	public Author(String fName, String lName, int age) throws Exception {
		this.fName = fName;
		this.lName = lName;
		
		if(age <= 0) {
			throw new Exception("Age cannot be less than or equal to 0!");
		} else {
			this.age = age;
		}
	}
	
	/**
	 * Age getter
	 * @return Author age
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * Overrides the toString() method
	 */
	@Override public String toString() {
		return String.format("%s %s;%d", this.fName, this.lName, this.age);
	}
}
