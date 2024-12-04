//3. Write a Program to Check if the number is positive, negative, or zero.

//1. Using If-else Condition to Check if the number is positive, negative, or zero		
//2. Determine the type of number using a nested ternary operator
//3. Determine the type of number using a switch statement

package JavaBasicsandControlFlowProblems;

import java.util.Scanner;

public class NumberIsPositiveNegativeorZero {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		double number = scanner.nextDouble();
//--------------------------------------------------------------------		
		// 1. Check if the number is positive, negative, or zero
		if (number > 0) {
			System.out.println("(Using If-else Condition) : The number is positive.");
		} else if (number < 0) {
			System.out.println("(Using If-else Condition) : The number is negative.");
		} else {
			System.out.println("(Using If-else Condition) : The number is zero.");
		}
//--------------------------------------------------------------------	
		// 2. Determine the type of number using a nested ternary operator
		String result = (number > 0) ? "(Using a nested Ternary Operator) : The number is positive."
				: (number < 0) ? "(Using a nested Ternary Operator) :The number is negative."
						: "(Using a nested Ternary Operator) : The number is zero.";

		// Print the result
		System.out.println(result);

//--------------------------------------------------------------------	

		// 3. Determine the type of number using a switch statement
		int resultsw = (number > 0) ? 1 : (number < 0) ? -1 : 0;

		switch (resultsw) {
		case 1:
			System.out.println("(Using a Switch Statement) : The number is positive.");
			break;
		case -1:
			System.out.println("(Using a Switch Statement) : The number is negative.");
			break;
		case 0:
			System.out.println("(Using a Switch Statement) : The number is zero.");
			break;
		}

	}
}
