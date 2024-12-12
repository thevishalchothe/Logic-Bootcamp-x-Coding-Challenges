// 3. Write a Program to Find the frequency of an element in an array using a Map

package mastering.java.collections.programs;

import java.util.HashMap;
import java.util.Map;

public class FrequencyofElementInArrayUsingMap {
	
	public static void main(String[] args) {
		
		int[] array = { 1, 2, 3, 2, 4, 1, 1 };
		
		Map<Integer, Integer> frequencyMap = new HashMap<>();

		for (int num : array) {
			frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
		}

		System.out.println("Frequency of each element: " + frequencyMap);
	}
}
