// 2)	Write a program to combine two arrays into a single array.
package codingchallenge.solutions.simplejava;

import java.util.Arrays;

public class MergeArrays {
	public static void main(String[] args) {
		int[] arr1 = { 11, 12, 13 }; // First array
		int[] arr2 = { 14, 15, 16, 17 }; // Second array

		// Create a new array to store merged elements
		int[] merged = new int[arr1.length + arr2.length];

		// Copy elements of arr1 into the merged array
		for (int i = 0; i < arr1.length; i++) {
			merged[i] = arr1[i];
		}

		// Copy elements of arr2 into the merged array after arr1's elements
		for (int i = 0; i < arr2.length; i++) {
			merged[arr1.length + i] = arr2[i];
		}

		// Print the merged array
		System.out.println("Merged Array: " + Arrays.toString(merged));
	}
}
