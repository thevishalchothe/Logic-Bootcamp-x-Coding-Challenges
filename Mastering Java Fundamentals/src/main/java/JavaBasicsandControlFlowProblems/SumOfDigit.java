//10. Write a program to find the sum of digits of a number (e.g., 123 -> 6).

package JavaBasicsandControlFlowProblems;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int sum = 0;

		// Loop to extract and add digits
		while (num != 0) {
			sum += num % 10; // Add last digit to sum
			num /= 10; // Remove last digit
		}

		System.out.println("Sum of digits is: " + sum);
	}
}
