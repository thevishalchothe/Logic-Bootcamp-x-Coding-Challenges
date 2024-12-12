// 4.	Write a program to find the sum of elements at odd indices in an array.

package mastering.java.arrays.programs;

public class SumOfOddIndices {

	public static void main(String[] args) {

		// Initialize an array with some values
		int[] array = { 10, 20, 30, 40, 50 };

		// Variable to store the sum of elements at odd indices
		int sum = 0;

		// Loop through the array, starting from index 1 and incrementing by 2 (to cover odd indices only)
		for (int i = 1; i < array.length; i += 2) {
			// Add the value at the current index (odd index) to the sum
			sum += array[i];
		}

		// Print the sum of elements at odd indices
		System.out.println("Sum at odd indices: " + sum);
	}
}
