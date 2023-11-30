package Guvitask11;
import java.io.File;
//import java.io.FileNotFoundException;
import java.util.Scanner;

public class task8 {
	
public static void main (String[] args) {
	try {
	File f = new File("C:\\Users\\DELL\\eclipse-workspace\\Guvi\\src\\Guvitask11\\samplefile");
	
	Scanner sc= new Scanner(f);

		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
	} catch (Exception e) {
	System.out.println(e);
		e.printStackTrace();
	}
}
}
   