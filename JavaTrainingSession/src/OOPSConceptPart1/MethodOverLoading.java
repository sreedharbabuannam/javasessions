package OOPSConceptPart1;

public class MethodOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverLoading obj =new MethodOverLoading();
					obj.sum();
					obj.sum(10);
					obj.sum(15.5);
					obj.sum(10, 20);
					//obj.main();
					//obj.main(10);
		

	}
	
	/*
	 * public static void main() {      // Main method also can overload with different parameters
	 * 
	 * System.out.println("Main method overloaded");
	 *  }
	 * 
	 * public static void main(int i) {
	 * System.out.println("Main method overloaded with 1 parameter"); 
	 * }
	 */
	// Method OverLOading: when the method name is same with different arguments or input parameters with in the same  class.
	//we can overload main method also
	// you can not create a method inside a method(always we can create different methods inside class)
	// duplicate methods...>>>same method name with same number of arguments not allowed. but same method method name , same number of arguments with different data types are allowed.
	
	public void sum() {
		
		System.out.println("SUM Methos....>>>0 parameters");
	}
	
public void sum(int i) {
		
		System.out.println("SUM Methos....>>>1 parameters");
		System.out.println(i);
	}

public void sum(double i) {
	
	System.out.println("SUM Methos....>>>1 parameters with different data type");
	System.out.println(i);
}
	
public void sum(int i, int k) {
	
	System.out.println("SUM Methos....>>>2 parameters");
	System.out.println(i+k);
	}
}
