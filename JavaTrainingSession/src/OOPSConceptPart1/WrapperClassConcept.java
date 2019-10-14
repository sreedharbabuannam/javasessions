package OOPSConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x="100";
		System.out.println(x+20);
	//data conversion :string to int conversion
		
		int i= Integer.parseInt(x);
		System.out.println(i+20);
		
	// integer, double, boolean,     char[string to char not possible]
		
	//string to double
		String y="200";
		double d= Double.parseDouble(y);
		System.out.println(y+20);
		
	//String to boolean
		String k ="true";
		boolean b=Boolean.parseBoolean(k);
		System.out.println(b);
		
	// int to string conversion
		
		int j=500;
		System.out.println(j+50);
		
		String s =String.valueOf(j);
		System.out.println(s+50);
		
				
		/*
		 * // Non numeric string to int conversion
		 * 
		 * String a="100A"; int m= Integer.parseInt(a); System.out.println(m); // which
		 * is not pure numeric value, it will give NumberFormatException
		 */
		
		// String to int,double,boolean ------>>>>parseInt/parseDouble/parseBoolean method
		// int, double, boolean to string------>>>>String.valueof() method

	}

}
