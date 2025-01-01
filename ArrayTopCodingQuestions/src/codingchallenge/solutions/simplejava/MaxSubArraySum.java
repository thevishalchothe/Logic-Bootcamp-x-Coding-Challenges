// 8) Write a program to find the subarray with the highest sum.
package codingchallenge.solutions.simplejava;

public class MaxSubArraySum {
	public static void main(String[] args) {
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

		int maxSum = arr[0];
		int currentSum = arr[0];

		// Traverse the array starting from the second element
		for (int i = 1; i < arr.length; i++) {
			currentSum = Math.max(arr[i], currentSum + arr[i]); // Current sum is either the element itself or the sum
																// of current element and previous sum
			maxSum = Math.max(maxSum, currentSum); // Update maxSum if needed
		}

		System.out.println("Maximum Subarray Sum: " + maxSum);
	}
}
