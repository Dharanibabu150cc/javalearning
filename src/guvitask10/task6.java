package guvitask10;

//instead of black tea giving name as task6


class blacktea extends task5{

	public void prepareTea() {
		System.out.println("prepare black tea");

	}
	protected void childMethod() {
		System.out.println("Calling child blacktea method");
	}

}
class lemontea extends task5{
	public void prepareTea() {

		System.out.println("prepare lemon tea");

	}

}

class herbaltea extends task5{
	public void prepareTea() {

		System.out.println("prepare herbal tea");
	}
}

//onstead of tea i have given it as task6

public class task6 {
		public static void main(String[] args) {
		//	task6 child =new task5();
			task5 t = new task5();
			task5 Tea = new blacktea();
			lemontea l = new lemontea();
			//herbaltea h = new herbaltea();
			
			//tea T = new tea();
			//T.prepareTea();
			Tea.prepareTea();
l.prepareTea();
t.prepareTea();
Tea.addmilk();
l.addmilk();
Tea.addmilk();



		}


}