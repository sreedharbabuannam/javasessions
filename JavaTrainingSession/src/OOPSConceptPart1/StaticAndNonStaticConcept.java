package OOPSConceptPart1;

public class StaticAndNonStaticConcept {
	
	//global variable: scope of global variable should be across all functions/methods with some conditions
	
	String name="Tom";    // Non static global variable
	static int age=25;   // static global variable

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//Q.	//how to call static variables and methods?
		
		//1. direct calling
		sum();                                   //method direct call
		//2. calling by  using class name
		StaticAndNonStaticConcept.sum();         // method calling using class name
		
		System.out.println(age);                 // variable direct call
		System.out.println(StaticAndNonStaticConcept.age);  // variable calling using class name
		
    //Q.  // how to call non static methods and variables?
		
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		obj.sendmail();                       
		System.out.println(obj.name);        // Non static method and variable call using object     
		
	 //Q.	// is it possible to call static methods using object? yes we can
		
		obj.sum();  // warning will be given like access static method in static way
	
	
	}
	
	
	
		
	
	public void sendmail() {        // Non static method
		
		System.out.println("Send Mail Method");
	}
	
	public  static void sum() {     //static method
		
		System.out.println("Sum Method");
	}

}
