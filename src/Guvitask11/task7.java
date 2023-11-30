package Guvitask11;

import java.util.Scanner;


public class task7 extends Exception{
	
	static void check (){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age");
		int age = sc.nextInt();
	
		if (age<18) {
			throw new ArithmeticException ("invalid age");
		}
		else {
			System.out.println("valid age");
		}
		
	}

	public static void main (String[]args) {
		try {
			check();
		}
		catch(Exception E) {
			System.out.println(E.getMessage());
			
		}
}}















