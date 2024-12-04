// 	20. Write a Program to Print all even numbers from 1 to N.

package JavaBasicsandControlFlowProblems;

import java.util.Scanner;

public class EvenNumberUptoN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int N = sc.nextInt();

		// Loop to print even numbers from 2 to N
		// Start from 2, and increment by 2 to ensure only even numbers are printed
		for (int i = 2; i <= N; i += 2) {
			// Print the even number followed by a space
			System.out.print(i + " ");
		}
	}
}