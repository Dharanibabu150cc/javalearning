package guvitask9;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		
	String a = sc.next();
	System.out.println("enter the text");
	String word="";
	//int i=0;
	for(int i = word.length()-1; i>=0;i--) {
		word= word+a.charAt(i);
		System.out.println(word);
		
	}
	

	}

}
