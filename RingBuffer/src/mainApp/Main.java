package mainApp;

import java.util.Scanner;

import mainApp.Buffer;


/***************
@author Ava Shaw
***************/

public class Main{
	
	
	public static void main(String[] args) {
		
			int test1[]={1,2,3};
			int test2[]={4,5,6,7,8,9,10,11,12};
			int test3[]={13,14,15};
			
	    	Scanner reader = new Scanner(System.in);  // Reading from System.in
	    	System.out.println("Enter size of buffer: ");
	    	int n = reader.nextInt(); // Scans the next token of the input as an int.
	    	Buffer.initialize(n);
	    	
	    	
			
/*****************Test Case 1*****************/
			
System.out.println("Take in 3 elements and print them back out");
			
		    System.out.println("Num Elements Read In: "+Buffer.write(test1));
		    System.out.println(Buffer.read());
		    System.out.println(Buffer.read());
		    System.out.println(Buffer.read());
		    
/*****************Test Case 2*****************/	
		  
		    System.out.println("Try to read empty buffer");
		    System.out.println(Buffer.read());
		    
/*****************Test Case 3*****************/	
		    
		    System.out.println("Try to read in 9 Elements and print out 4");
		    System.out.println("Num Elements Read In: "+Buffer.write(test2));
		    
		    System.out.println(Buffer.read());
		    System.out.println(Buffer.read());
		    System.out.println(Buffer.read());
		    System.out.println(Buffer.read());
		    
/*****************Test Case 4*****************/
		    
		    System.out.println("Add 3 Elements to non-empty buffer");
		    System.out.println("Num Elements Read In: "+Buffer.write(test3));
			
		    System.out.println(Buffer.read());
		    System.out.println(Buffer.read());
		    System.out.println(Buffer.read());
		    System.out.println(Buffer.read());
		    System.out.println(Buffer.read());
		    System.out.println(Buffer.read());
		    System.out.println(Buffer.read());
		    System.out.println(Buffer.read());
		    System.out.println(Buffer.read());
		    
		    System.exit(0);
		    
		
		
			
		   }

}
