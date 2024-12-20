// 1)	Write a program to arrange the elements of an array in ascending order.

package codingchallenge.solutions.simplejava;

public class SortArray {

	public static void main(String[] args) {

		// Initialize the array with unsorted elements
		int[] arr = { 15, 2, 8, 17, 3 };

		// Outer loop: Iterate through the array
		for (int i = 0; i < arr.length; i++) {
			// Inner loop: Compare the current element with all elements after it
			for (int j = i + 1; j < arr.length; j++) {
				// If the current element is greater than the next element, swap them
				if (arr[i] > arr[j]) {
					// Swap the two elements
					int temp = arr[i]; // Store the current element in a temporary variable
					arr[i] = arr[j]; // Replace the current element with the smaller element
					arr[j] = temp; // Place the larger element in the next position
				}
			}
		}

		// Print the sorted array
		System.out.print("Sorted Array: ");
		for (int num : arr) {
			// Print each element of the array
			System.out.print(num + " ");

		}
	}
}
