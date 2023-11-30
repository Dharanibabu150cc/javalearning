package guvitask10;

class task5{
	String basicTea = "hotwaterand tea leaves";

	public void prepareTea() {
		
		//String basictea;
		
		//String	basictea = "hotwater and tea leaves";
				
				System.out.println(this.basicTea);
		
	}
	
	public  void addmilk() {
		
	//	String addingmilk = "adding milk which contains";
	//	prepareTea();
		System.out.println(this.basicTea +"and milk" );
		
	
		
	}
	
	public void  addsugar() {
		//prepareTea();
	//	addmilk();
		System.out.println(this.basicTea +  " and sugar");
	}
	




	public static void main(String[] args) {
		task5 bb = new task5();
		bb.prepareTea();
		bb.addmilk();
		bb.addsugar();
		
		

		
	}

}
