package JavaBasics;

public class Singleton {
	
// in OOP, Singleton class is a class that can  have only once object(instance of the class) at a time.
// How to design singleton class?
//Ans: 1. Make a constructor as a private
//2.Write a public static method(getinstance)that has return type of object of this singleton class(Lazy initialization)

	private static Singleton singleton_instance=null;
	public String str;
	  
	private Singleton() {
		str="hey am using singleton class pattern";
	}
	
	public static Singleton getInstance() {              
		if(singleton_instance==null)
			singleton_instance=new Singleton();
			return singleton_instance;
			
		
	}
	// when you run firsttime singleton_instance=null , will refer to x value and it will create object and it will return singleton_instance value.
	// when you run for y object, singleton_instance will be not null.because null value is already indicated to x reference. so it will not go in side to create object, it will return same singleton_instance value. same for z also.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Singleton x= Singleton.getInstance();            //getinstance() method is static method, so we are calling using class name and storing into variables(x,y,z...)
		Singleton y= Singleton.getInstance();
		Singleton z= Singleton.getInstance();
		
		x.str= (x.str).toUpperCase();                   //here we changed only x value to uppercase, but when you print all 3 values(x,y,z) will conver to upper case. because all will refer to single object.
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);                      
		
		z.str= (z.str).toLowerCase();                   // converting z value to lower case 
		
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);                       //here we changed only z value to Lowercase, but when you print all 3 values(x,y,z) will conver to Lowercase. because all will refer to single object.(one and only object refer)
		
		

	}

}

// What is Difference between Normal Class and Singleton class?
//Ans. difference is the way if instantiation. in normal class we use constructor to create object. but in single ton class we use getinstance()method to create object.
