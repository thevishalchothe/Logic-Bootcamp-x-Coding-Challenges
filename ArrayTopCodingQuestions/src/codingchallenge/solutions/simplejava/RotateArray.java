// 9) Write a program to rotate an array by K positions.
package codingchallenge.solutions.simplejava;

import java.util.Arrays;

public class RotateArray {
	public static void main(String[] args) {
		int[] arr = { 10, 12, 13, 14, 15 };
		int k = 3; // Number of positions to rotate

		// Rotate the array by shifting elements
		int[] rotated = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			rotated[(i + k) % arr.length] = arr[i]; // Calculate new index
		}

		// Print the rotated array
		System.out.println("Rotated Array: " + Arrays.toString(rotated));
	}
}
