// 7. Write a program to count the occurrences of a specific character in a string.
package codingchallenge.solutions.simplejava;

public class CharacterCount {
    public static void main(String[] args) {
        String str = "Hello World! Patil";
        char ch = 'l';
        int count = 0;
        
        // Loop through the string and count occurrences of the character
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        
        // Print the result
        System.out.println("Occurrences of '" + ch + "': " + count);
    }
}
