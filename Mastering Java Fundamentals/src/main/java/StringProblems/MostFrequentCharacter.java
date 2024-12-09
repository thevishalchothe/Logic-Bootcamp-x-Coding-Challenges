// 19. Write a Program to Find the Character that Appears Most Frequently in a String.

package StringProblems;

import java.util.HashMap;

public class MostFrequentCharacter {

	public static void main(String[] args) {

		String str = "Visshaaal Chothe";
		
		// HashMap to store the frequency of each character
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        
        // Variables to track the most frequent character and its count
        char mostFrequent = ' ';  // Start with a default character
        int maxCount = 0;         // Start with 0 count

        // Loop through each character in the string
        for (char c : str.toCharArray()) {
            // Update frequency count of the character
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);

            // If this character's count is higher than the previous max, update it
            if (frequencyMap.get(c) > maxCount) {
                mostFrequent = c;
                maxCount = frequencyMap.get(c);
			}
		}

		System.out.println("Most frequent character: " + mostFrequent);
	}
}
