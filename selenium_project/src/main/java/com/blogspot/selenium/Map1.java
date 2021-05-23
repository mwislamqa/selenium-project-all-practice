package com.blogspot.selenium;

import java.util.*;
import java.util.Map.Entry;


public class Map1 {

	public class entry {

	}

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer, String>();
		
		map.put(33, "ratan");
		map.put(34, "kamal");
		map.put(37, "harun");
		map.put(39, "john");
		/*
		 * Set set= map.entrySet(); Iterator iterator= set.iterator();
		 * while(iterator.hasNext()) { Entry me=(Entry)iterator.next();
		 * //System.out.println("key is:"+me.getKey()+"& value:::" +me.getValue());
		 * //System.out.println("---------------------");
		 * //System.out.println(map.containsKey(22));
		 * //System.out.println(map.isEmpty()); //System.out.println(map.get(33));
		 * //System.out.println(map.clone()); }
		 */
		System.out.println(map.get(33));
		for(Entry<Integer, String> e :map.entrySet()) {
			System.out.println(e.getKey()+"   "+e.getValue());
			
		}
		System.out.println(map.clone());
	}

}
