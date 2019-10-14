package OOPSConceptPart1;

public class LocalVsGlobalVariables {
	
	// Global variables --->>>class variables
	
	String name="Tom";                // Scope of Global variables should be through out the program.
	int age =25;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i =10;      // Local variable of main method  --->>>Scope of local variables should be with in method.
		
		System.out.println(i);
		
		LocalVsGlobalVariables obj = new LocalVsGlobalVariables();
		System.out.println(obj.name);           // when ever you want to access Global variable under method we should access through object.
		System.out.println(obj.age);
	}
		
	public void sum() {
		int i =20;    // Local variables of sum method
		int j=30;
	}
		

	

}
