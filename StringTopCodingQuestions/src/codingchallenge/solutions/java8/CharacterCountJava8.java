// 7. Write a program to count the occurrences of a specific character in a string using Java 8.
package codingchallenge.solutions.java8;

public class CharacterCountJava8 {
    public static void main(String[] args) {
        String str = "Hello World! Sheth";
        char ch = 'o';
        
        // Use Streams to count the occurrences of the character
        long count = str.chars().filter(c -> c == ch).count();
        
        // Print the result
        System.out.println("Occurrences of '" + ch + "': " + count);
    }
}
