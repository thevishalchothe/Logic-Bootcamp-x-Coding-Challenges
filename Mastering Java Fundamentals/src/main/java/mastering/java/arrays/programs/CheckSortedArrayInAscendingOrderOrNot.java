// 	3. Write a Program to Check if Array is Sorted in Ascending Order

package mastering.java.arrays.programs;

public class CheckSortedArrayInAscendingOrderOrNot {

	public static void main(String[] args) {
		
		int[] array = {6, 2, 3, 4, 5}; 		// Initializing an array of integers
	        
	        // Initialize a boolean flag to assume the array is sorted initially
	        boolean isSorted = true;
	        
	        // Loop through the array starting from the second element
	        for (int i = 1; i < array.length; i++) {
	            // Compare the current element with the previous one
	            if (array[i] < array[i - 1]) {
	                // If any element is smaller than the previous one, the array is not sorted
	                isSorted = false;
	                // Break the loop as no further checking is necessary
	                break;
	            }
	        }
	        
	        // Output the result: whether the array is sorted or not
	        System.out.println("Array is sorted : " + isSorted);
	    }
}