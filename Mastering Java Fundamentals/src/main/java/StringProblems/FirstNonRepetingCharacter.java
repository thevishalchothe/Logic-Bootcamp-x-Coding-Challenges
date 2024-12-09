// 21. Write A program to Find the First Non-repeating Character in a String

package StringProblems;

import java.util.HashMap;

public class FirstNonRepetingCharacter {

	public static void main(String[] args) {

		String str = "Moon";

		// Create a HashMap to store the frequency of each character
		HashMap<Character, Integer> frequencyMap = new HashMap<>();

		// Traverse through the string and count the frequency of each character
		for (char c : str.toCharArray()) {
			// If character exists, increment its count; if not, initialize it with 1
			frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
		}

		// Traverse through the string again to find the first character with a
		// frequency of 1
		for (char c : str.toCharArray()) {
			// If the frequency of the character is 1, it's the first non-repeating
			// character
			if (frequencyMap.get(c) == 1) {
				// Print the first non-repeating character
				System.out.println("First non-repeating character: " + c);
				// Exit the loop once the first non-repeating character is found
				break;
			}
		}
	}
}
