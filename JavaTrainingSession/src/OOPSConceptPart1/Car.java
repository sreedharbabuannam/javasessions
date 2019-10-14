package OOPSConceptPart1;

public class Car {
	
	//Concept of Class and Object
	
	int model;
	int wheels;                   //  model and wheels are class variables or global variables

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//new car() --->>> this is the object of car class.
		//new() key word is used to create object
		//a,b,c are  object reference variables

		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		
		a.model=2018;
		a.wheels=4;
		
		b.model=2019;
		b.wheels=4;
		
		c.model=2020;
		c.wheels=4;
		
		
		System.out.println("before assigning the references");
		
		System.out.println(a.model);
		System.out.println(a.wheels);
		
		System.out.println(b.model);
		System.out.println(b.wheels);
		
		System.out.println(c.model);
		System.out.println(c.wheels);
		
		
		System.out.println("**************");
		
		System.out.println("After shifting the references");
		a=b;
		b=c;
		c=a;
		
		a.model=10;
		System.out.println(a.model);    // here a.model will be 10
		c.model=20;                     //here c.model will be 20, but when we say c=a[after shifting]
		
		System.out.println(a.model);     //here a.model will print 20 instead of 10[because c=a]
		System.out.println(c.model);     // 20
		
		
		
		
		
		
	}

}
