package Guvitask11;

import java.util.Scanner;

public class task4 {
	public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number ");
		System.out.println();
		int no1= sc.nextInt();
		System.out.println("enter the second number ");
		System.out.println();
		int no2= sc.nextInt();
		
		int a =no1;
		int b=no2;
		try {
		int c= a/b;
		
		System.out.println(c);
		
		}
		catch(Exception e) {
			System.out.println("infinity");
		}
	}

}
