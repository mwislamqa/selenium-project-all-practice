package com.blogspot.selenium;

import java.util.*;
import java.util.Map.Entry;

import com.blogspot.selenium.Map1.entry;

public class Map2 {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		// key, value
		map.put(1, "john");
		map.put(2, "steav");
		map.put(3, "michel");
		map.put(4, "jackson");
		map.put(4, "islam");
		map.put(4, "noor");
		map.remove(4);
		map.replace(1, "ratan");
		map.replace(2, "steav", "md");

		// get value
		System.out.println(map.get(1));
		System.out.println(map.get(4));
		for (Entry<Integer, String> e : map.entrySet()) {
			System.out.println(e.getKey() + "  " + e.getValue());
		}
		System.out.println("-----------------------------");
		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();

		/*Employee e1 = new Employee(101, "islam", 5000);
		Employee e2 = new Employee(102, "yousuf", 6000);
		Employee e3 = new Employee(103, "alam", 7000);*/

		emp.put(1, new Employee(101, "islam", 5000));
		emp.put(2, new Employee(102, "yousuf", 6000));
		emp.put(3, new Employee(103, "alam", 7000));
		
		for (Entry<Integer, Employee> e : emp.entrySet()) {
			int key = e.getKey();
			Employee q = e.getValue();
			System.out.println("employee " + key + "   info:  ");

			System.out.println(q.id + "   " + q.name + "  " + q.salary);

		}

	}

}
