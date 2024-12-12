//6. Write a program to reverse a number (e.g., 123 -> 321).

package mastering.java.basicsandcontrolflow.programs;

import java.util.Scanner;

public class ReversedNumber {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a number: ");
	        int num = scanner.nextInt();
	        
	        int reversedNum = 0;
	        
	        // Reversing the number
	        while (num != 0) {
	            int digit = num % 10;       // Extract the last digit
	            reversedNum = reversedNum * 10 + digit;  // Add it to the reversed number
	            num /= 10;                   // Remove the last digit from num
	        }
	        
	        // Output the reversed number
	        System.out.println("Reversed number: " + reversedNum);
	}
}
