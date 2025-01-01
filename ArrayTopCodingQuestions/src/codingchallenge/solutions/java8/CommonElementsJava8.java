// 6) Write a program to find the common elements between two arrays.
package codingchallenge.solutions.java8;

import java.util.*;
import java.util.stream.*;

public class CommonElementsJava8 {
	public static void main(String[] args) {
		int[] arr1 = { 11, 21, 31, 41, 51 };
		int[] arr2 = { 41, 51, 61, 71, 81 };

		// Use Java 8 Streams to find common elements
		Set<Integer> set1 = Arrays.stream(arr1).boxed().collect(Collectors.toSet());
		Arrays.stream(arr2).filter(set1::contains) // Filter elements of arr2 that are in set1
				.forEach(num -> System.out.print(num + " ")); // Print common elements
	}
}
