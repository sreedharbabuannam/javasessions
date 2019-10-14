package Keywords;

// Finally is a block
public class FinallyConcept {
	
	//Finally--->>>  whether catch block throws exception or not with out depend on that finally will execute must.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
		test2();
		division();
		divisionhandlewrongexception();
		
	}

	
		public static void test1(){                  // Finally with exception in catch block[but not handling type of exception]
			try{
				System.out.println("inside test1 method");
				throw new RuntimeException("tests");
			}catch(Exception e){
				System.out.println("inside catch block");
			}finally {
				System.out.println("inside finally method");
			}
		}
		
	
		public static void test2() {                    // Finally without exception in catch block
			try {
				System.out.println("inside test2 method");
			}
			finally {
				System.out.println("Finally method in test2");
			}
		}
		
		public static void division(){                // Finally with exception in catch block[ handling type of exception in catch block]
			int i=10;
			
			try{
				System.out.println("inside division method");
				int k=i/0;
			}catch(ArithmeticException e){
				System.out.println("inside catch block");
				System.out.println("divide by zero error");
			}finally {
				System.out.println("Execute finally after exception also");
			}
		}
		
		public static void divisionhandlewrongexception(){                // Finally with Handling wrong exception in catch block
			int i=10;
			
			try{
				System.out.println("inside division method");
				int k=i/0;
			}catch(NullPointerException e){                  // as we know it is arithemetic exception , but we gave as null pointer exception, even though it will throghs exception but no body can catch, so it will execute finally block.        
				System.out.println("inside catch block");
				System.out.println("divide by zero error");
			}finally {
				System.out.println("Execute finally after exception also");
			}
		}
		
}
