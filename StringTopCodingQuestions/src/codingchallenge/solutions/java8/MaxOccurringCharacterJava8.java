// 9. Write a program to find the character that occurs most frequently in a string using Java 8.
package codingchallenge.solutions.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaxOccurringCharacterJava8 {
    public static void main(String[] args) {
        String str = "abbccddd";
        
        // Use Java 8 Streams to find the most frequent character
        char maxChar = str.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
            .entrySet()
            .stream() .max(Map.Entry.comparingByValue())
            .get() .getKey();
        
        System.out.println("Max occurring character: " + maxChar);         // Print the result
    }
}