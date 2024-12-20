// 9) Write a program to rotate an array by K positions.
package codingchallenge.solutions.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RotateArrayJava8 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 3; // Number of positions to rotate
        
        // Convert array to a list, rotate using Collections.rotate, and convert back to array
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        Collections.rotate(list, k);
        
        // Print the rotated array
        System.out.println("Rotated Array: " + list);
    }
}
