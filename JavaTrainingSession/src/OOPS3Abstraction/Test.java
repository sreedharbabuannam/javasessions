package OOPS3Abstraction;

public class Test extends Shape {
	
	/*
	 * Test(){ System.out.println("Constructor--->>>Test"); }
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  Shape s= new Test();
		  s.drawing(); 
		  s.fill();
		 

		
	//	Test t = new Test();  // when ever we create construcor for abstract class we can create object for childclass only.because first it will execute parent class then comes to child.
	
	}

	@Override
	void drawing() {                            // inplementing abstract method in child class[by overriding]
		// TODO Auto-generated method stub
		System.out.println("Test--->>>drawing");
		
	}

}
