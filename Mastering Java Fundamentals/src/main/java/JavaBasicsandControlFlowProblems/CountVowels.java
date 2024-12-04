// 17. Write a Program to Count the number of vowels in a string.

package JavaBasicsandControlFlowProblems;

import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String str = sc.nextLine();

		// Initialize a counter variable to keep track of vowels
		int count = 0;

		// Loop through each character in the string (converted to lowercase)
		// This ensures that the vowels are counted regardless of case
		System.out.print("Vowels found in String is : ");
		for (char c : str.toLowerCase().toCharArray()) {

			// Check if the character is a vowel by looking if it exists in the string
			// "aeiou"
			// indexOf returns -1 if the character is not found
			if ("aeiou".indexOf(c) != -1) {

				// Increment the vowel count if a vowel is found
				count++;

				// Print the vowel
				System.out.print(c + " ");
			}
		}

		System.out.println();

		// Print the total number of vowels found in the string
		System.out.println("Total Number of vowels is : " + count);
	}
}