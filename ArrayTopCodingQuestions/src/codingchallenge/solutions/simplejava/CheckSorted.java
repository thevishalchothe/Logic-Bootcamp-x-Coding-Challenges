// 10)	Write a program to verify if an array is sorted in ascending order.
package codingchallenge.solutions.simplejava;

public class CheckSorted {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		// Assume array is sorted
		boolean isSorted = true;

		// Check if each element is smaller than the next one
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				isSorted = false; // Set to false if array is not sorted
				break;
			}
		}

		System.out.println("Array is sorted: " + isSorted);
	}
}
