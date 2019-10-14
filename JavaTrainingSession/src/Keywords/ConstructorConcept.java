package Keywords;

public class ConstructorConcept {
	
	public ConstructorConcept() {
		
		System.out.println("Default constructor");
		
	}

public ConstructorConcept(int i) {                            //constructor overloading
		
		System.out.println("Single Parameter constructor");
		System.out.println("the value of i" +i);
		
	}

public ConstructorConcept(int i, int j) {              //constructor overloading
	
	System.out.println("Two Parameter constructor");
	System.out.println("the value of i" +i);
	System.out.println("the value of j" +j);
	
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorConcept obj = new ConstructorConcept();
		ConstructorConcept obj1 = new ConstructorConcept(10);
		ConstructorConcept obj2 = new ConstructorConcept(10,20);
		
		
	}

}

//constructor name should be same as class name.
//constructor will not return any value.
//can we overload constructor? yes we can
// constructor will immediately when you create object of that.[no need to write again like obj.method name...]
// if you not create any constructor also for every class there will be a hidden constructor, which we can call as default construcor. when we create object immediately it will call.
