package guvitask10;


class employee{
	int id = 100;
	String name = "dharani";
	int Salary =  50000;
	int raisesalary;
	
	
	public void raisesalary() {
		
		if (Salary >=50000 ) {
			raisesalary =Salary * 12 / 100;	
			
			System.out.println(raisesalary);
		}
		else
			System.out.println("no hike");
		
	}
}



public class task2 {

	public static void main(String[] args) {
		
		employee emp = new employee();
		emp.raisesalary();
	

	}

}
