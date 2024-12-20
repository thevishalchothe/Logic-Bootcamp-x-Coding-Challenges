// 2)	Write a program to combine two arrays into a single array.
package codingchallenge.solutions.java8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeArraysJava8 {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30}; // First array
        int[] arr2 = {70, 50, 60}; // Second array
        
        // Merge arrays using IntStream.concat() to combine two streams
        int[] merged = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
                                .toArray(); // Convert the result to an array
        
        // Print the merged array
        System.out.println("Merged Array: " + Arrays.toString(merged));
    }
}
