//12. Write a program to find the sum of numbers from 1 to N.

package JavaBasicsandControlFlowProblems;

import java.util.Scanner;

public class SumOfNumber1toN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int N = sc.nextInt();
		int sum = 0;

		// Loop to calculate the sum of numbers from 1 to N
		for (int i = 1; i <= N; i++) {
			sum += i; // Add each number to sum
		}

		System.out.println("Sum of numbers from 1 to " + N + " is: " + sum);
	}
}