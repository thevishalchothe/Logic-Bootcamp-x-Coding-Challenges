// 10)	Write a program to verify if an array is sorted in ascending order.
package codingchallenge.solutions.java8;

import java.util.stream.IntStream;

public class CheckSortedJava8 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        
        // Check if the array is sorted by comparing adjacent elements using streams
        boolean isSorted = IntStream.range(0, arr.length - 1)
                                    .allMatch(i -> arr[i] <= arr[i + 1]);
        
        System.out.println("Array is sorted: " + isSorted);
    }
}
