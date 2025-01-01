// 6) Write a program to find the common elements between two arrays.
package codingchallenge.solutions.simplejava;

import java.util.HashSet;
import java.util.Set;

public class CommonElements {
	public static void main(String[] args) {
		int[] arr1 = { 11, 21, 31, 41, 51 };
		int[] arr2 = { 41, 51, 61, 71, 81 };

		// Use a HashSet to store elements of arr1
		Set<Integer> set = new HashSet<>();
		for (int num : arr1) {
			set.add(num);
		}

		// Find common elements in arr2
		System.out.print("Common Elements: ");
		for (int num : arr2) {
			if (set.contains(num)) { // Check if element exists in the set
				System.out.print(num + " ");
			}
		}
	}
}
