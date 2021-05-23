package com.blogspot.selenium;

import java.util.ArrayList;
import java.util.LinkedHashSet;

import java.util.Set;

public class ArrayListDoublicate {

 public static void main(String[] args) {
		 ArrayList<Object> l = new ArrayList<Object>();  
	        l.add("Mango");  
	        l.add("Banana");  
	        l.add("Mango");  
	        l.add("Apple"); 
	        l.add(111);
	        System.out.println(l);  
	        Set<Object> s = new LinkedHashSet<Object>(l);  
	        System.out.println(s);  
	    }  
	}


