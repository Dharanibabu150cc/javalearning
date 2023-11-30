package Guvitask11;

import java.util.Scanner;

class login{
	
	public void loginpage(){
Scanner sc = new Scanner(System.in);
System.out.println("enter the user name");
String user = sc.nextLine();
System.out.println("enter the password");
String pass = sc.nextLine();

if (user.equals("dharani.r94@gmail.com") && pass.equals("123456")) {
	System.out.println("valid credentials");
}
else {
	System.out.println("invalid credentials");
}

	}
}







public class task6 {
	
	public static void main (String [] args) {
		
		login credentials = new login();
		credentials.loginpage();
		
		
		
		
		
		
		
	}
	

	
	

}
