package OOPSConceptPart2;

public class BMW extends Car{       // has-a relationship
	
	// when same method name present in parent class as well as child class with same name, same number of arguments
	// is called method over riding [ here start method is present in both car and bmw classes]
	// we will create object for child class and we can call start method, if the method is there in both parent and child class 
	//priority will be for child class[overriden method] for execution[Refer Testcar.java class]
	
	public void start() {   //overriden method
		System.out.println("BMW start method");
	}
	
	public void theftsafe() {
		
		System.out.println("BMW theftsafe method");
	}
}
