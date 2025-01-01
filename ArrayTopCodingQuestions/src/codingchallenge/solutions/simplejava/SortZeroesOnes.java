// 7) Write a program to rearrange an array such that all 0s come before all 1s.
package codingchallenge.solutions.simplejava;

import java.util.Arrays;

public class SortZeroesOnes {
	public static void main(String[] args) {
		int[] arr = { 0, 1, 1, 0, 1, 0, 0, 1 };

		// Count the number of 0s
		int countZeroes = 0;
		for (int num : arr) {
			if (num == 0) {
				countZeroes++;
			}
		}

		// Fill the array with 0s and 1s based on the count of zeroes
		for (int i = 0; i < arr.length; i++) {
			if (i < countZeroes) {
				arr[i] = 0;
			} else {
				arr[i] = 1;
			}
		}

		// Print the sorted array
		System.out.println("Sorted Array: " + Arrays.toString(arr));
	}
}
