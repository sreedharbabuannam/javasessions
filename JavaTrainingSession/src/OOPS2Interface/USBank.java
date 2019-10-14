package OOPS2Interface;

public interface USBank {
	
	int Min_bal=100;
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();
	
	// only Method declaration
	//No method body- only method proto type
	//in interface we can declare the variables, variables are by default static in nature
	// variables value will be not changed.--->>> its final/constant in nature.
	// No static method in interface
	// No main method in interface
	// we can not create object of interface
	// interface is abstract in nature.
	//Abstraction--->>>100%[Using interface we can achieve 100% abstraction]
	

}
