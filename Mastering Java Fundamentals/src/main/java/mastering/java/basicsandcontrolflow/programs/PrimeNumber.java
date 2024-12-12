// 11. Write a program to check if a number is Prime Number or not.

// Definition of a Prime Number: A prime number is a number greater than 1 that has no positive divisors other than 1 and itself.

package mastering.java.basicsandcontrolflow.programs;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();

		// Check if the number is prime
		boolean isPrime = true;

		if (number <= 1) {
			isPrime = false; // Numbers less than or equal to 1 are not prime
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false; // Number is divisible by i, so it's not prime
				break;
			}
		}

		if (isPrime) {
			System.out.println(number + " is a prime number.");
		} else {
			System.out.println(number + " is not a prime number.");
		}

	}
}
