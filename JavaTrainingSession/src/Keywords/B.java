package Keywords;

public class B extends A {

	public B() {

		super();

		System.out.println("child class constructor");
	}

	public B(int i) {

		super(10);

	}

	public B(int i, int j) {

		super(10, 20);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B();
		B obj1 = new B(10);
		B obj2 = new B(10, 20);

	}

}

// super keyword should be the first statement of any constructor
//superkeyword  will always used to  call parent class constructor