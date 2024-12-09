// 12.	Write a program to count how many times a specific character appears in a string.

package StringProblems;

public class CharacterCount {

	public static void main(String[] args) {

		// Define the string in which to count the character occurrences
		String str = "hello world";

		// Define the target character to search for
		char target = 'o';

		// Initialize a counter variable to track occurrences of the target character
		int count = 0;

		// Convert the string to a character array and iterate over each character
		for (char c : str.toCharArray()) {
			// Check if the current character matches the target
			if (c == target)
				count++; // If it matches, increment the counter
		}

		// Print the result showing how many times the target character appeared
		System.out.println("Character '" + target + "' appears " + count + " times.");
	}
}
