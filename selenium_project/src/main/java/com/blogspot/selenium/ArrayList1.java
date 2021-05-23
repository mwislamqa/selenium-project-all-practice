package com.blogspot.selenium;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {

	public static <E> void main(String[] args) {
		// dynamic array -------->ArryList
		// it can store duplicate value
		// it is non synchronized
		// maintain insertion order
		// allows random access to fetch the elements bcoz its store the values on the
		// basis of index.

		// before jdk1.5 define arrayList was as a generic thats mean we
		// we have to declare which type of data we will be going to store.but after
		// jdk1.5 version we can add any kind of data

		// example:
		// Non generic ArrayList
		ArrayList number1 = new ArrayList();
		number1.add(222);
		number1.add("selenium");
		number1.add(22.33);
		number1.add(false);
		number1.add("java");  
		
		for (int i = 0; i < number1.size(); i++) {
			System.out.println(number1.get(i));

		}
		System.out.println("========================");
		// generic arrayList
		ArrayList<Integer> number = new ArrayList<Integer>();
		number.add(20);
		number.add(2);
		number.add(25);
		number.add(10);
		number.add(15);
		number.add(20);
		number.add(30);
		number.remove(2);
		System.out.println("size of arraylist    " + number.size());
		for (int i : number) {
			System.out.println(i);
		}
		System.out.println("=============================");
		// sometime we dont know what type of data we going to store then we can do like
		// is
		ArrayList<E> number2 = new ArrayList<E>();
		System.out.println("=============================");
		// create employee class object // user define arrayList comes from other class
		EmployeeforArrayList emp1 = new EmployeeforArrayList("md islam", 39, "qa");
		EmployeeforArrayList emp2 = new EmployeeforArrayList("radiya", 7, "qm");
		//EmployeeforArrayList emp3 = new EmployeeforArrayList("waliya", 2, "admin");

		ArrayList<EmployeeforArrayList> alist = new ArrayList<EmployeeforArrayList>();
		
		alist.add(emp1);
		alist.add(emp2);
		alist.add(new EmployeeforArrayList("waliya", 2, "admin"));
		for (EmployeeforArrayList list : alist) {
			System.out.print(list.name);
			System.out.print(list.age);
			System.out.print(list.dept);
			System.out.println();
		}
		System.out.println("==============================");

		// addAll method
		ArrayList<String> st1 = new ArrayList<String>();

		st1.add("java1");
		st1.add("selenium");
		st1.add("qtp");
		st1.add("phython");

		ArrayList<String> st2 = new ArrayList<String>();

		st2.add("java2");
		st2.add("cumbumber");
		st2.add("github");
		st2.add("testNg");

		st1.addAll(st2);
		for (int i = 0; i < st1.size(); i++) {
			System.out.println(st1.get(i));
		}
		System.out.println("==============================");
		// removeAll
		st1.removeAll(st2);
		for (int i = 0; i < st1.size(); i++) {
			System.out.println(st1.get(i));
		}
		System.out.println("+++++++++++++++++++++++++++++++++");
		
		//similer data return
		ArrayList<String> st3 = new ArrayList<String>();

		st3.add("java");
		st3.add("selenium");
		st3.add("qtp");
		st3.add("phython");

		ArrayList<String> st4 = new ArrayList<String>();

		st4.add("java");
		st4.add("cumbumber");
		st4.add("github");
		st4.add("qtp");
		st3.retainAll(st4);
		for (int i = 0; i < st3.size(); i++) {
			System.out.println(st3.get(i));
		}

	}

}
