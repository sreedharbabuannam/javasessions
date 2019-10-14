package OOPSConceptPart1;

public class FunctionsInJava {              // Functions and methods both are same.

	// main method is starting point of Execution. main method is void because it will never return any value.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FunctionsInJava obj = new FunctionsInJava();
       // one object will be created, obj is the  reference variable , referring to this object
	   // after creating the object, the copy of all non static methods will be given to thede object
	   // when ever you want to call non static methods, we should create object must.
		
		obj.test();
	int M=	obj.dev();
	   System.out.println(M);
	String s1= obj.qa();                    // here we are storing values into variables to print return values
		System.out.println(s1);
	int div=obj.division(30, 10);
		System.out.println(div);

	}

// non static methods
// void --->>>does not return any value
//return type - void
	
	
	public void test() {                       //1. no input..no output
		System.out.println("test method");
	}
	
	//return type int                          //2. no input ...some output
	public int dev() {
		System.out.println("Dev Method");     
		int a=10;
		int b=20;
		int c=a+b;
		return c;                             //void will not return any value, but here we are returning int value(i.e. c) so we have to change return type as int instead of void.
	}
	
	//return type String                      //3. no input ...some output[same as type2]
	public String qa() {
		System.out.println("qa Method");
		String s ="Selenium";
		return s;                          //void will not return any value, but here we are returning String value(i.e. s) so we have to change return type as string instead of void.
	
     }
	
	//return type int  
	public int division(int x, int y) {        //4. some input and some output
		System.out.println("division method");
		int d=x/y;
		return d;
	}
}

