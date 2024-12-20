// 3) Write a program to determine the second largest element in an array.
package codingchallenge.solutions.java8;

import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {5,7, 2, 8, 1, 3};

        // Use Java 8 Streams to find the second largest element
        int secondLargest = Arrays.stream(arr)
                                  .distinct()          // Remove duplicates
                                  .sorted()            // Sort in ascending order
                                  .skip(arr.length - 2)  // Skip all but the last two elements
                                  .findFirst()         // Get the second largest element
                                  .orElseThrow();      // Throw an exception if there's no second largest

        // Print the second largest element
        System.out.println("Second Largest Element: " + secondLargest);
    }
}
