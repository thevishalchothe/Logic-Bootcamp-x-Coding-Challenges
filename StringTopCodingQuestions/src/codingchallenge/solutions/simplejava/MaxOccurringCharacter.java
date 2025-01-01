// 9. Write a program to find the character that occurs most frequently in a string.
package codingchallenge.solutions.simplejava;

import java.util.HashMap;
import java.util.Map;

public class MaxOccurringCharacter {
	public static void main(String[] args) {
		String str = "abbccc";
		Map<Character, Integer> freqMap = new HashMap<>();

		// Build the frequency map
		for (char ch : str.toCharArray()) {
			freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
		}

		// Find the character with the maximum frequency
		char maxChar = 0;
		int maxCount = 0;
		for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
			if (entry.getValue() > maxCount) {
				maxCount = entry.getValue();
				maxChar = entry.getKey();
			}
		}

		// Print the result
		System.out.println("Max occurring character: " + maxChar);
	}
}
