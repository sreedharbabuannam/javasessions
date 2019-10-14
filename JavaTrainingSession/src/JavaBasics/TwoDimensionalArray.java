package JavaBasics;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String x[][]=new String[3][5];
		System.out.println(x.length);     //3 --->>>total no.of rows =3
		System.out.println(x[0].length);  //5 --->>>total no.of columns =5[here rows are x[0],x[1],x[2] each row have equal number of columns so we can use x[0].length to fing number of columns.
        
		
		//1st row
	    x[0][0]="A";
	    x[0][1]="B";
	    x[0][2]="C";            // Storing values in 1st row[0th row]  and 5 coloumns
	    x[0][3]="D";
	    x[0][4]="E";
	    
	    //2nd row
	    x[1][0]="A1";
	    x[1][1]="B1";
	    x[1][2]="C1";            // Storing values in 2 row and 5 columns
	    x[1][3]="D1";
	    x[4][4]="E1";
	    
	    //3rd row
	    x[2][0]="A2";
	    x[2][1]="B2";
	    x[2][2]="C2";            // Storing values in 3 row and 5 columns
	    x[2][3]="D2";
	    x[2][4]="E2";
	    
	    System.out.println(x[0][2]);
	    System.out.println(x[1][2]);
	    System.out.println(x[2][2]);
	    
	  //print all the values in 2d array: use for loop
	  //row =0 col= 0 to 4
	  //row =1 col= 0 to 4
	  //row =2 col= 0 to 4
	    
	    for(int row=0;row<x.length;row++){
	    	for(int col=0;col<x[0].length;col++) {
	    		System.out.println(x[row][col]);
	    	}
	    }
	    
	
	}

}
