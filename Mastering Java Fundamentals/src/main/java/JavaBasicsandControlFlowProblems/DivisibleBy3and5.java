package JavaBasicsandControlFlowProblems;

import java.util.Scanner;

public class DivisibleBy3and5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		// Check divisibility by 3 and 5
		if (num % 3 == 0 && num % 5 == 0) {
			System.out.println(num + " is divisible by both 3 and 5.");
		} else {
			System.out.println(num + " is not divisible by both 3 and 5.");
		}

	}

}
