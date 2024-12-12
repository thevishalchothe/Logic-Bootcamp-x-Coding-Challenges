// 8.	Write a program to rotate an array by K positions.

package mastering.java.arrays.programs;

import java.util.Arrays;

public class RotateArrayByKPosition {

	public static void main(String[] args) {

         int[] array = { 1, 2, 3, 4, 5 };

        // Define the number of positions to rotate the array by
        int k = 2;

        // To handle cases where k is greater than the array length,
        // take modulo with the array length
        k %= array.length;

        // Step 1: Reverse the entire array
        reverse(array, 0, array.length - 1);

        // Step 2: Reverse the first k elements
        reverse(array, 0, k - 1);

        // Step 3: Reverse the remaining elements after k positions
        reverse(array, k, array.length - 1);

        // Print the rotated array
        System.out.println("Rotated Array: " + Arrays.toString(array));
    }

    // Helper function to reverse a portion of the array
    private static void reverse(int[] array, int start, int end) {
        // Loop until start index is less than end index
        while (start < end) {
            // Swap the elements at start and end
            int temp = array[start];
            array[start++] = array[end];
            array[end--] = temp;
		}
	}
}
