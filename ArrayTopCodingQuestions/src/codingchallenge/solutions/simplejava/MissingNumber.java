// 5) Write a program to identify the missing number in an array of size N-1.
// 5) Write a program to identify the missing number in an array of size N-1.
package codingchallenge.solutions.simplejava;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {17, 18, 19, 21, 22}; // Array with one missing number
        int start = 17;  // The first number in the range
        int end = 22;    // The last number in the range

        // Calculate the expected sum of numbers from start to end
        int expectedSum = (end - start + 1) * (start + end) / 2;

        // Calculate the sum of elements in the array
        int actualSum = Arrays.stream(arr).sum();

        // The missing number is the difference between the expected and actual sums
        int missingNumber = expectedSum - actualSum;

        System.out.println("Missing Number: " + missingNumber);
    }
}
