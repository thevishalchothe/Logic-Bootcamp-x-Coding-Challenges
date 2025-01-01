// 4. Write a program to find the first non-repeated character in a string using Java 8.

package codingchallenge.solutions.java8;

import java.util.Optional;

public class FirstNonRepeatedCharJava8 {
    public static void main(String[] args) {
        String str = "nonsense";
        
        // Use Streams to find the first non-repeated character
        Optional<Character> nonRepeated = str.chars()
            .mapToObj(c -> (char) c)
            .filter(ch -> str.indexOf(ch) == str.lastIndexOf(ch))
            .findFirst();
        
        // Print the first non-repeated character if found
        nonRepeated.ifPresent(ch -> System.out.println("First non-repeated character: " + ch));
    }
}
