package JavaBasics;

public class IfElseConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =10;
		int b= 20;
		if(a>b) {
			System.out.println("a is greater than b");
		}
		else {
			System.out.println("b is greater than a");
		}
	//comparison operators
	//< > <= >= == !=
		int c =40;
		int d =50;
		if(c==d) {
			System.out.println("c and d are equal");
		}
		else {
			System.out.println("c and d are not equal");
		}
	
	//write a logic to fing highest number
	// nested if else
		
		int a1 = 300;
		int b1 =400;
		int c1 = 200;
		if(a1>b1 & a1>c1) {
			System.out.println("a1 is greatest number");
		}else if(b1>c1) {
				System.out.println("b1 is greatest number");
		}	else {
					System.out.println("c1 is greatest number");
				}
				
				
			}
		
	
	}


