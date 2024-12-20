// 4) Write a program to eliminate duplicate elements from an array.
package codingchallenge.solutions.simplejava;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        
        // Use a LinkedHashSet to maintain insertion order and remove duplicates
        Set<Integer> unique = new LinkedHashSet<>();
        
        for (int num : arr) {
            unique.add(num); // Add each element to the set (duplicates are ignored)
        }
        
        // Print the array without duplicates
        System.out.println("Array without duplicates: " + unique);
    }
}
