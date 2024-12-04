// 7. Write a Program to Find the factorial of a number using a loop.

package JavaBasicsandControlFlowProblems;

import java.util.Scanner;

public class FactoriallNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int fact = 1;

		// Loop to calculate factorial
		for (int i = 1; i <= num; i++) {
			fact *= i; // Multiply each number to the result
		}

		System.out.println("Factorial of " + num + " is " + fact);
	}
}
