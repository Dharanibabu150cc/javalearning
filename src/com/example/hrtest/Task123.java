package com.example.hrtest;

import java.util.TreeMap;

public class Task123 {
	
	public static void main (String[] args) {
		// tree map is an natural ascending order basis of keys, also wont allow duplicates
		TreeMap <Integer,String>ts = new TreeMap<Integer,String>();
		ts.put(10,"dharani");
		ts.put(12,"dhuruv");
		ts.put(11,"divya");
		ts.put(8,"satheesh");
		ts.put(8,"addithi");
		
		System.out.println("print all the above values--->" + ts);
		
		//to removeth items we have more methods
		ts.remove(10);
		System.out.println("print the value after removing "+ ts);
		//to print the values alone
		System.out.println(ts.values());
		//System.out.println(ts);
		
		
		
		
	}

}
