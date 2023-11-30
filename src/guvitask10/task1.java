package guvitask10;

class person {
	String name;
	int age;
//created constructor below
	
	person() {
		int age=15;
		System.out.println(age);
		
	}


	public String getName(String name) {
		System.out.println(name);
		return name;
	}

//parameterised
	public int getAge(int age) {
		System.out.println(age);
		return age;
		
	}

}

public class task1 {
	
	public static void main (String[]args) {
		
		person bb = new person();
		bb.getAge(20);
		bb.getName("dharani");
	}
}