package Keywords;

// final is a keyword
public class FinalConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 final int i=30; //constant, once we declare variable as final we can not change it
		//int i=10;
		// i=20;
	}

	public  final void start() {               // once we declare method as final, we can not override it.
		System.out.println("start");           // in same way if we declare class as final we can not inherit it with child class.[not possible to extends]
	}
	
	/*
	 * public void start() {
	 * 
	 * }
	 */
	// to prevent inheritence
	//to prevent method overriding
	
}
