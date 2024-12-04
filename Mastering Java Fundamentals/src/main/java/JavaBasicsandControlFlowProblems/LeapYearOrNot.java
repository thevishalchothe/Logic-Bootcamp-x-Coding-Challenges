// 13. Write a program to check if a year is a leap year.

package JavaBasicsandControlFlowProblems;

import java.util.Scanner;

public class LeapYearOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = sc.nextInt();

		// Check leap year condition
        // A year is a leap year if:
        // 1. It is divisible by 4 but not divisible by 100
        //    OR
        // 2. It is divisible by 400
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(year + " is a leap year.");
		} else {
			System.out.println(year + " is not a leap year.");
		}
	}
}