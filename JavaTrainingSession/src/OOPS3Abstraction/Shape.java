package OOPS3Abstraction;

public abstract class Shape {
	
	/*
	 * // Can we create Constructor for Abstract Class? yes
	 * 
	 * Shape(){ System.out.println("Constructor--->>>shape");
	 * 
	 * }
	 */
	 
	
	int colour;
	
	abstract void drawing();    // Abstract Method
	
	public void fill() {        // NonAbstract Method with body
		
		System.out.println("Shape--->>>fill");
	}
	
	public  final void design() {        // NonAbstract Method with body and final
		
		System.out.println("Shape--->>>design");
	}
	
	// Abstraction is the process of hiding the implementation details and showing functionality.
	// can not create object of interface/Abstract
    // abstract class can have both abstract and non abstract methods.
	// we can declare abstract class with out abstract methods also [with only non abstract methods] is 0% abstraction.
	//For Non abstract methods we are not hiding implementation we are declaring body here it self. so because of this we can say using abstract class
	// we can not achieve 100% abstraction.[only partial abstraction is possible between 0 to 100%]
    // we can declare Non abstract method as final also under abstract class, but we can not implent that method in child class, as it is final.
    //Abstractclass having No abstract methods---achieving 0% abstraction
	//Abstractclass having both abstract and Non Abstract methods---achieving 0to100% abstraction[Partial]
	//Abstractclass having only abstract methods---achieving 100% abstraction[means all methods are abstract by nature i.e. having only method declaration ,not body]
	
}
