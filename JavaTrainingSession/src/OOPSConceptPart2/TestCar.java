package OOPSConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Static polymorphism/ compile time polymorphism  : because here compiler will decide while running time which method to execute[like start method in two places, so it will give priority for overriden method.i.e. child class]
		
		BMW b= new BMW();
		b.start();
		b.stop();      // stop method is in car class but we are extending child to parent , so we can use parent properties as well.
		b.theftsafe();
		b.refuel();
	
	System.out.println("**************");
	
	Car c= new Car();
	c.start();
	c.stop();
	c.refuel();
//	c.theftsafe();     Not possible because parent can not have access of child class methods.
	
	System.out.println("**************");
	
	//Top casting
	Car c1 = new BMW();   // Child class object can be refered by parent class reference variable is called --->>>Dynamicpolymorphism/Runtime Polymorphism
	c1.start();          // as per priority child class start method will run here
	c1.stop();
	c1.refuel();
	//c1.theftsafe();    Not possible because you are creating object of child class, but refering to parent class reference variable
	
	// Downcasting
	
	//BMW b1= new Car();  downcasting is not possible directly, but we can do in following way[we can convert  car object to bmw object]
	
	BMW b1= (BMW)new Car(); // downcasting is possible like this which is not show any error in compile time, but in runtime it will through ClassCastException due to this we can not prefer downcasting.
	
	
	}

}
