// 1)	Write a program to arrange the elements of an array in ascending order. 
package codingchallenge.solutions.java8;

import java.util.Arrays;

public class SortArrayJava8 {

	public static void main(String[] args) {
		
		// Initialize the array with unsorted elements
		int[] arr = { 15, 2, 8, 17, 3 };


        // Using Arrays.stream() and sorted() method from Streams API to sort the array
        arr = Arrays.stream(arr)
                    .sorted()           // Sort the stream in ascending order
                    .toArray();         // Convert the stream back to an array

        // Print the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    
	}

}
