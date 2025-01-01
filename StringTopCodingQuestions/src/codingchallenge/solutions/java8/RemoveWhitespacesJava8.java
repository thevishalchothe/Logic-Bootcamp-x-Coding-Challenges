// 6. Write a program to remove all whitespace characters from a string using Java8.
package codingchallenge.solutions.java8;

import java.util.stream.Collectors;

public class RemoveWhitespacesJava8 {
    public static void main(String[] args) {
        String str = "Hello World! This is Vishal.";
        
        // Use Java 8 Streams to remove all whitespaces
        String result = str.chars()
                           .filter(c -> !Character.isWhitespace(c)) // Filter out whitespace characters
                           .mapToObj(c -> String.valueOf((char) c)) // Convert each character back to String
                           .collect(Collectors.joining()); // Join characters to form the final string
        
        // Print the result
        System.out.println("String without whitespaces: " + result);
    }
}
