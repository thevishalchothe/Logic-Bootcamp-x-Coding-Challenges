// 9.	Count the frequency of each element in an array.

package mastering.java.arrays.programs;

import java.util.HashMap;

public class FrequencyCount {

	public static void main(String[] args) {
		// Initialize the array with some sample integers
		int[] array = { 1, 2, 2, 3, 3, 3, 4 };

		// Create a HashMap to store the frequency of each element (key = element, value = frequency)
		HashMap<Integer, Integer> frequencyMap = new HashMap<>();

		// Iterate through each element in the array
		for (int num : array) {
			// Put the element into the map with its current frequency (increment if it already exists)
			// The getOrDefault method returns the current frequency of the element or 0 if not found
			frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
		}

		// Print the frequency map, which shows the count of each element in the array
		System.out.println("Frequency Count: " + frequencyMap);
	}
}
