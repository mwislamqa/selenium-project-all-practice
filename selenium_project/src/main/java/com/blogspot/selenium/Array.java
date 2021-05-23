package com.blogspot.selenium;

public class Array {

	public static void main(String[] args) {
		// array to store similar data type values in a array variable
		// lowest bound index=0
		// upper bound index=n-1(n  means number of array)
		// size is fixed/array is static- -To overcome this problem we use--collections
		// arraylist, hashmap --use dynamic array
		// store only similar data type -- To overcome this problem we use Object(is a
		// super class) array.

		String[] arr1 = { "honda", "bmw", "volvo", "toyta", "mazda" };

		for (int i = 0; i < arr1.length; i++) {
			if (i == 3) {
			break;
			// continue;
			}

			System.out.println(arr1[i]);
		}
		System.out.println("_____________________________________________________________");
		int[] a = new int[4];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		System.out.println(a.length);
		System.out.println(a[2]);
		System.out.println("_____________________________________________________________");

		// Oject array in store different data type
		Object obj[] = new Object[4];
		obj[0] = 10;
		obj[1] = "md islam";
		obj[2] = 20.50;
		obj[3] = "new york";
		System.out.println(obj[2]);

		for (int j = 0; j < obj.length; j++) {
			System.out.println(obj[j]);
		}

		System.out.println("_____________________________________________________________");

		// The array x is declared as final, but the elements of array are changed
		// without any problem.
		final int x[] = { 1, 2, 3, 4, 5 };
		for (int k = 0; k < x.length; k++) {
			x[k] = x[k] + 10;
			System.out.println(x[k]);
		}

	}

}
