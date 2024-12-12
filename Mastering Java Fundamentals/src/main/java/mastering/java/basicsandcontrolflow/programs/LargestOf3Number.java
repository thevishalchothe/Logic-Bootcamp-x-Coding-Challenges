//5. Write a Program to	Find the largest of three numbers.

//1. By Comparing with if Condition, the numbers and find the largest
//2. Using Math.max() 
//3. Using the ternary operator 

package mastering.java.basicsandcontrolflow.programs;

import java.util.Scanner;

public class LargestOf3Number {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter three numbers
		System.out.print("Enter the first number: ");
		int num1 = scanner.nextInt();
		System.out.print("Enter the second number: ");
		int num2 = scanner.nextInt();
		System.out.print("Enter the third number: ");
		int num3 = scanner.nextInt();
//-----------------------------------------------------------------------
		// 1. By Comparing with if Condition, the numbers and find the largest
		int largest = num1; // Assume num1 is the largest initially

		if (num2 > largest) {
			largest = num2; // Update largest if num2 is greater
		}
		if (num3 > largest) {
			largest = num3; // Update largest if num3 is greater
		}

		// Output the largest number
		System.out.println("By Comparing with if Condition : The largest number is: " + largest);

//------------------------------------------------------------------------
		// 2. Using Math.max() to find the largest of the three numbers
		int largestmm = Math.max(num1, Math.max(num2, num3));

		// Output the largest number
		System.out.println("Using Math.max() Fuction : The largest number is: " + largestmm);

//-------------------------------------------------------------------------
		// 3. Using the ternary operator to find the largest number
		int largestto = (num1 >= num2 && num1 >= num3) ? num1 : (num2 >= num1 && num2 >= num3) ? num2 : num3;

		// Output the largest number
		System.out.println("Using the ternary operator : The largest number is: " + largestto);

	}
}
