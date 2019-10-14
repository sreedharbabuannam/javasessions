package Keywords;

public class ConstructorWithThisKeyword {
	
	//class variables/global
	String name;
	int age;
	

	public ConstructorWithThisKeyword(String name, int age) {
		this.name=name;
		this.age=age;
		System.out.println(name);
		System.out.println(age);
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorWithThisKeyword obj= new ConstructorWithThisKeyword("Tom",30);

	}

}


// this key word is used to intialize globalvariables/class variables into a constructor.
// is it possible to intialize global variables into constructor with out this key word? yes like below
// in that case we have to intialize global and local variables with different names

/*
 * String name; //globalvars int age; public ConstructorWithThisKeyword(String
 * name1, int age1) { //localvars name=name1; age=age1; }
 */