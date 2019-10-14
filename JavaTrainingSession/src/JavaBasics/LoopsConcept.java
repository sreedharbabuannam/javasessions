package JavaBasics;

public class LoopsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// instead of writing repetitive code again and again we can use looping concept.
//1. while loop
		
		int i =1;                  //initialization
		while(i<=10) {             //conditional
			System.out.println(i);
			i=i+1;                 //incremental/decremental[ i= i++ means i = i+1]
		}

		System.out.println("****************");
//Disadvantage of while loop: it will generate infinite loop , if you don't give incremental/decrement part.
	
//2. For Loop
	//print:1 to 10
		for(int j=1;j<=10;j++) {         //initialization;condition;increment
			System.out.println(j);
		}
		System.out.println("****************");
		
	//print:10 to 1	
		for(int k=10;k>=1;k--) {         //initialization;condition;decrement
			System.out.println(k);
			
		}
		System.out.println("****************");
		//print:10 to 0, 0 to -10
				for(int k=10;k>=-10;k--) {         //initialization;condition;decrement/increment
					System.out.println(k);
					
				}
				System.out.println("****************");
	}

}
