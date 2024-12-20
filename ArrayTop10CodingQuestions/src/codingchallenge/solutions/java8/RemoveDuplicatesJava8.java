// 4) Write a program to eliminate duplicate elements from an array.
package codingchallenge.solutions.java8;

import java.util.Arrays;

public class RemoveDuplicatesJava8 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 30, 40, 40, 50};
        
        // Using Streams to remove duplicates and print the result directly
        System.out.println("Array without duplicates: " + 
            Arrays.toString(Arrays.stream(arr)  // Convert array to stream
                .distinct()                     // Remove duplicates
                .toArray()                       // Convert the stream back to an array
            )
        );
    }
}
