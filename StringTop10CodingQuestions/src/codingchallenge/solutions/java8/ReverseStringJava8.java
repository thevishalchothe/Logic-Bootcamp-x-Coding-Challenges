// 1)	Write a program to reverse a given string using ava 8.
package codingchallenge.solutions.java8;

import java.util.Collections;
import java.util.stream.Collectors;

public class ReverseStringJava8 {
	
	public static void main(String[] args) {
		
		String beforeReversed = "Vishal Chothe";

		// Reverse the string using Java 8 streams (Using Java 8)
        String afterReversed = 
            beforeReversed.chars() // Convert the string into an IntStream
            .mapToObj(c -> (char) c) // Convert each int to a character
            .collect(Collectors.toList()) // Collect characters into a list
            .stream() // Convert the list back into a stream
            .collect(Collectors.collectingAndThen(
                Collectors.toList(), 
                list -> {
                    Collections.reverse(list); // Reverse the list
                    return list.stream().map(String::valueOf).collect(Collectors.joining()); // Join characters back into a string
                }
            ));
        
		System.out.println("Reversed String using Java 8: " + afterReversed);
		
	}
}
