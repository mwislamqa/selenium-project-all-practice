package com.blogspot.selenium;

public class Exception {
	
	
	public static void checkage(int age) {
		if (age < 18) {
			System.out.println("age is not old enough");
			// throw new ArithmeticException("Access denied - You must be at least 18 years
			// old.");
		}

		else {
			System.out.println("age is old enough");

		}

	}

	public static void main(String[] args) {
		checkage(17);

	}

}
