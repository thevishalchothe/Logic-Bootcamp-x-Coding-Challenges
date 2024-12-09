package ArrayAndStringPrograms;

import java.util.Arrays;

public class AreArrayEquals {
	
	public static void main(String[] args) {
		
		// Declare and initialize two integer arrays
		int[] array1 = { 1, 2, 3, 4 }; // First array
		int[] array2 = { 1, 2, 3, 4 }; // Second array

		// Use Arrays.equals() to check if the two arrays are equal and print the result
		// Arrays.equals() compares the content of the arrays, not just their references
		System.out.println("Arrays are equal: " + Arrays.equals(array1, array2));
	}
}
