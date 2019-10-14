package JavaBasics;

public class StringConcatination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//+: concatination operator. concatination will happen from left to right always.
	// println: used to print console in new line
	//print: used to print console in same line.
		int a = 10;
		int b= 30;
		String x = "Hello";
		String y = "World";
		double c = 12.5;
		double d = 36.5;
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		System.out.println(a+b+(x+y));
		System.out.println(c+d);
		System.out.println(c+d+x+a+y+b);
		System.out.println("Hi this is me");
		System.out.println(a);
		System.out.println("the value of a is:"+a);
		System.out.println("the value of b is:"+b);
		System.out.println("the addition of a and b is:"+(a+b));
		

	}

}
