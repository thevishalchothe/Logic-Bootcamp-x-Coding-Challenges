// 14. Write a Program to Print the Fibonacci series up to N numbers. 

// Defination of The Fibonacci series : a sequence of numbers in which each number is the sum of the two preceding ones, usually starting with 0 and 1.

package mastering.java.basicsandcontrolflow.programs;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of terms: ");
		int N = sc.nextInt();

		// Check if the user entered a valid positive number
		if (N <= 0) {
			System.out.println("Please enter a positive number.");
		} else {
			int a = 0, b = 1; // Initialize the first two Fibonacci numbers
			System.out.print("Fibonacci Series: ");

			// Print Fibonacci series up to N terms
			for (int i = 1; i <= N; i++) {
				System.out.print(a + " ");

				// Calculate the next Fibonacci number
				int next = a + b; // Sum the previous two numbers
				a = b; // Update 'a' to the value of 'b' (shift to the next number in the series)
				b = next; // Update 'b' to the calculated 'next' value
			}
		}
	}
}