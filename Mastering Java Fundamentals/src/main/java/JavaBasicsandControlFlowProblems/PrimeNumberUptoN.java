//	16. Write a program to print all prime numbers up to N.

package JavaBasicsandControlFlowProblems;

import java.util.Scanner;

public class PrimeNumberUptoN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();

		System.out.println("Prime numbers up to " + number + ":");

		// 1. The outer loop now iterates over all numbers from 2 to N (the user input).
		// 2. Inside this loop, the program checks whether each number is prime.
		// 3. If a number is prime, it gets printed out.

		// Loop through all numbers from 2 to 'number' to check if they are prime
		for (int i = 2; i <= number; i++) {
			boolean isPrime = true;

			// Check if the current number is prime
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false; // Number is divisible by j, so it's not prime
					break;
				}
			}

			if (isPrime) {
				System.out.print(i + " "); // Print the prime number
			}
		}
	}
}
