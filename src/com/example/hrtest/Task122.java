package com.example.hrtest;

import java.util.ArrayList;

public class Task122 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//first way to store heteregenous data
		ArrayList<String>al = new ArrayList();
		ArrayList al1 = new ArrayList();
		
		
		al.add("Java");
		al.add("Dharani");
		al.add("babu");

		System.out.println("default Arraylist values-->"+ al);
		//adding a string inbetween 
		
		al.add(2, "learning");
		System.out.println("Arraylist values after adding at index 2-->"+al);
		
		al.add(2,"babu");
		System.out.println("values after removing at index 2--->"+ al);
		
		al1.size();
		System.out.println(al1);
		
	}

}
