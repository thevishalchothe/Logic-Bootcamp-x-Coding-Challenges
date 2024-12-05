// 1.  Write a program to reverse an array of integers.

package ArrayAndStringPrograms;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {

		int[] arr = { 11, 12, 13, 14, 15 }; // Initialize an array with some integer values
		System.out.println("Before Reverse Array1 (Using a While Loop) is : " + Arrays.toString(arr));

		// Logic: Swap elements from start to end until the middle of the array is reached.
		// Initialize pointers for the start and end of the array
		int start = 0; // Start pointer at the beginning of the array
		int end = arr.length - 1; // End pointer at the last element of the array

		// Using a while loop to reverse the array
		// The loop continues until start index is less than end index
		while (start < end) {
			// Swap the elements at start and end indices
			int temp = arr[start]; // Temporarily store the start element
			arr[start] = arr[end]; // Assign the end element to the start position
			arr[end] = temp; // Assign the temporarily stored value to the end position

			// Move the pointers towards the center
			start++; // Increment start pointer
			end--; // Decrement end pointer
		}
		
		// Print reversed array
		System.out.print("After Reversed array1 is : ");
		for (int num : arr)
			System.out.print(num + " ");

//---------------------------------------------------------------------------------------------

		int[] array = { 1, 2, 3, 4, 5 }; // Initialize an array with some integer values
		System.out.println("\n\nBefore Reverse Array2 (Using For Loop) is : " + Arrays.toString(array));

		// Use two pointers: one starting from the beginning (i) and one from the end
		// (j)
		// The loop will run until i and j meet in the middle
		for (int i = 0, j = array.length - 1; i < j; i++, j--) {
			// Swap the elements at positions i and j
			int temp = array[i]; // Store the value at position i temporarily
			array[i] = array[j]; // Assign the value at position j to position i
			array[j] = temp; // Assign the stored value (temp) to position j
		}

		// Convert the array to a string representation and store it
		String arrayAsString = Arrays.toString(array);

		// Print the stored string representation of the array
		System.out.println("After Reverse Array2 is : " + arrayAsString);

	}
}
