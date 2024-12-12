// 15. Write a Program to Find the minimum of two numbers.

// Using conditional operator
// Call the method to find the minimum

package mastering.java.basicsandcontrolflow.programs;

import java.util.Scanner;

public class MinimumOf2Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter two numbers: ");
		int num1 = sc.nextInt(); // Input from User
		int num2 = sc.nextInt();

		// Using conditional operator
		int min = (num1 < num2) ? num1 : num2;

		System.out.println("The minimum of (Using conditional operator) " + num1 + " and " + num2 + " is : " + min);
//-------------------------------------------------------------------------------
		int num3 = 10; // Manually Input
		int num4 = 20;

		// Call the method to find the minimum
		int minimum = findMinimum(num3, num4);

		System.out.println("The minimum of (Using Call by Methods) " + num3 + " and " + num4 + " is : " + minimum);
	}

	// Method to find the minimum
	public static int findMinimum(int a, int b) {
		if (a < b) {
			return a;
		} else {
			return b;
		}
	}
}