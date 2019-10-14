package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Array:to store similar data type values in a  array variable.
		
		//lowest bound/index =0
		//upper bound/index=n-1[ where n is size of array]
		//one dimensional array
		
		//disadvantages of array: 
		//1. size is fixed --->we can call as static array --> to overcome this problem we can use collections[like Array list, hash table..etc--->>these are called as dynamic array also]
		//2. stores only similar data types --->>> to overcome this problem we can use Object array.[Refer type 6 below]
		
		
		//1. int array
		int i[]=new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
		System.out.println(i[0]);
		System.out.println(i[3]);
		//System.out.println(i[4]);  ArrayIndexOutOfBoundException
		
			System.out.println(i.length);	//size/length of array
			
			// Print all the values of array : use for loop
			
			for(int j=0;j<i.length;j++) {
				System.out.println(i[j]);
			}

			
		//2. double array
			double d[]=new double[3];
			d[0]=12.2;
			d[1]=15.5;
			d[2]=18.8;
			
			System.out.println(d[2]);
			
		//3. char array
			char c[]=new char[3];
			c[0]='a';
			c[1]=5;
			c[2]='$';
			System.out.println(c[2]);
			
		//4.boolean array
			boolean b[]=new boolean[2];
			b[0]=true;
			b[1]=false;
			System.out.println(b[0]);
			
		//5.String array
			String s[]=new String[3];
			s[0]="test";
			s[1]="hello";
			s[2]="world";
			System.out.println(s.length);
			System.out.println(s[1]);
			
		//6.Object array [Object is a class] --->>>used to store different data type variables.
			Object ob[]= new Object[6];	
			ob[0]="Tom";
			ob[1]=12.2;
			ob[2]="1/1/2019";
			ob[3]=5;
			ob[4]='a';
			ob[5]="london";
			System.out.println(ob[5]);
			System.out.println(ob.length);
			
			
	}

}
