// 5) Write a program to identify the missing number in an array of size N-1.
package codingchallenge.solutions.java8;

import java.util.Arrays;

public class MissingNumberJava8 {
    public static void main(String[] args) {
        int[] arr = {50, 51, 52, 53, 54, 55, 56, 58, 59, 60}; // Array with one missing number
        int start = 50; // Start of the range
        int end = 60;   // End of the range
        
        // Calculate the sum of numbers from start to end (inclusive)
        int expectedSum = (end - start + 1) * (start + end) / 2;
        
        // Calculate the sum of elements in the array using streams
        int actualSum = Arrays.stream(arr).sum();
        
        // The missing number is the difference between expected and actual sum
        int missingNumber = expectedSum - actualSum;
        
        System.out.println("Missing Number: " + missingNumber);
    }
}
