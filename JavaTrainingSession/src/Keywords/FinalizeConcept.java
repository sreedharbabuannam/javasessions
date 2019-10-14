package Keywords;

// Finalize is a method
public class FinalizeConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FinalizeConcept f1=new FinalizeConcept();
		FinalizeConcept f2=new FinalizeConcept();
		
			f1=null;
			f2=null;
			System.gc();     //garbage collector calling manually
	}

	// finalize method will call just to clean up process, before garbage  collector calls.
	//finalize will call automatically.
	public void finalize() {
		
		System.out.println("finalize method");
		
	}
}
