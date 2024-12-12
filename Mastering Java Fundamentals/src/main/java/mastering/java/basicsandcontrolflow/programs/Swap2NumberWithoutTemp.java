// 21. Write a program to Swap Two Numbers without using a temporary variable.

package mastering.java.basicsandcontrolflow.programs;

import java.util.Scanner;

public class Swap2NumberWithoutTemp {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter two numbers: ");
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	      
	        System.out.println("Before swapping: a = " + a + ", b = " + b);  // Before swapping values of 'a' and 'b'

	        // Swap using arithmetic without a temporary variable
	        a = a + b;  // Step 1: Add both numbers and store the result in 'a'
	        b = a - b;  // Step 2: Subtract 'b' from 'a' (which now holds the sum), 
	                    // so 'b' becomes the original value of 'a'
	        a = a - b;  // Step 3: Subtract the new 'b' (which is the original 'a') 
	                    // from 'a' (which holds the sum), so 'a' becomes the original value of 'b'
	        
	        System.out.println("After swapping: a = " + a + ", b = " + b);  // Print the swapped values of 'a' and 'b'
	    }
	}