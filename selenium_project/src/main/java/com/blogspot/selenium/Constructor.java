package com.blogspot.selenium;

public class Constructor {
	int x;

	 Constructor(int y) {
		x = y;

	}

	public static void main(String[] args) {
		Constructor c = new Constructor(5);
		System.out.println(c.x);

	}

}
