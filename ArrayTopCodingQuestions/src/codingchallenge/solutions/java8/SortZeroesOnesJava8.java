// 7) Write a program to rearrange an array such that all 0s come before all 1s.
package codingchallenge.solutions.java8;

import java.util.Arrays;

public class SortZeroesOnesJava8 {
	public static void main(String[] args) {
		int[] arr = { 0, 1, 1, 0, 1, 0, 0, 1 };

		// Use Java 8 Streams to sort 0s and 1s
		int countZeroes = (int) Arrays.stream(arr).filter(x -> x == 0).count(); // Count 0s
		Arrays.fill(arr, 0, countZeroes, 0); // Fill 0s
		Arrays.fill(arr, countZeroes, arr.length, 1); // Fill 1s

		// Print the sorted array
		System.out.println("Sorted Array: " + Arrays.toString(arr));
	}
}
