//4. Write a Program to Print all numbers from 1 to N using a loop.

package JavaBasicsandControlFlowProblems;

import java.util.Scanner;

public class AllNumber1toN {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number N: ");
		int N = scanner.nextInt();

		// int N = 10; // Set the value of N
		System.out.println("All numbers from 1 to " + N); 
		for (int i = 1; i <= N; i++) {
			System.out.println(i); // Print each number from 1 to N
		}
	}

}
