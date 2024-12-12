// 4.	Write a program to find the sum of elements at even indices in an array.

package mastering.java.arrays.programs;

public class SumOfEvenIndices {

	public static void main(String[] args) {

		// Initialize an array with some values
		int[] array = { 10, 20, 30, 40, 50 };

		// Variable to store the sum of elements at even indices
		int sum = 0;

		// Loop through the array, starting from index 0 and incrementing by 2 (to cover even indices only)
		for (int i = 0; i < array.length; i += 2) {
			// Add the value at the current index (even index) to the sum
			sum += array[i];
		}

		// Print the sum of elements at even indices
		System.out.println("Sum at even indices: " + sum);
	}
}
