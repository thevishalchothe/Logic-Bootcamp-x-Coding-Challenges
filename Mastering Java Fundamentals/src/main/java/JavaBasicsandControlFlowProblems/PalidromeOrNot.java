// 18. Write a Program to Check if a string is a palindrome.

package JavaBasicsandControlFlowProblems;

import java.util.Scanner;

public class PalidromeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		
		String str = sc.nextLine().toLowerCase().replaceAll("[^a-z0-9]", ""); // Normalize input: convert to lowercase
																				// and remove non-alphanumeric
																				// characters

		// Initialize a boolean variable to track if the string is a palindrome
		boolean isPalindrome = true;

		// Get the length of the string
		int length = str.length();

		// Compare characters from both ends towards the middle
		for (int i = 0; i < length / 2; i++) {
			// If characters at the current position and its mirror position don't match,
			// it's not a palindrome
			if (str.charAt(i) != str.charAt(length - 1 - i)) {
				isPalindrome = false; // Set flag to false
				break; // Exit the loop as we already know it's not a palindrome
			}
		}

		if (isPalindrome) {
			System.out.println(str + " is a palindrome.");
		} else {
			System.out.println(str + " is not a palindrome.");
		}

	}
}
