// 2. Write a Program to Check if a number is even or odd.

//1. Using if Condition if the number is even or odd
//2. Using a ternary operator 
//3. Using while loop

package mastering.java.basicsandcontrolflow.programs;

import java.util.Scanner;

public class EvenorOddCheck {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
//-----------------------------------------------------------------------
		// 1. (Using if Condition) if the number is even or odd
		if (number % 2 == 0) {
			System.out.println(number + " (Using a if Condition) number is => even.");
		} else {
			System.out.println(number + " (Using a if Condition) number is => odd.");
		}
//------------------------------------------------------------------------       
		// 2. (Using a ternary operator) to determine if the number is even or odd
		String result = (number % 2 == 0) ? "even" : "odd";

		// Print the result
		System.out.println(number + " (Using a ternary operator) number is => " + result + ".");

//-------------------------------------------------------------------------
		// 3. (Using while loop) to determine if the number is even or odd

		// Subtract 2 repeatedly until the number is less than 2
		int temp = number;
		while (temp >= 2) {
			temp -= 2;
		}
		
		// Print the result
		if (temp == 0) { 	
			System.out.println(number + " (Using while loop) number is => even.");
		} else {
			System.out.println(number + " (Using while loop) number is => odd.");
		}
	}
}
