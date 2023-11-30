package Guvitask11;

import java.util.Scanner;




class array{
	public void array1(){
		
		try {
int array2[]= {1,2,3,4};
System.out.println(array2[5]);}
		catch(Exception e) {
			System.out.println("print arrayindexoutofbound exception");
		}

}
	
	public void string(){
String d = "dharani";
try {
	int a= d.length();
	char c = d.charAt(10);
	System.out.println(c);
} catch (Exception e) {
	// TODO Auto-generated catch block
	//e.printStackTrace();
	System.out.println("String index out of bound exceptionexception");
}



}
	


}

public class task5 {
	
public static void main (String[]args) {
	
		
	array ar = new array();
	
	ar.array1();
	ar.string();
	
	
		
		

}
}