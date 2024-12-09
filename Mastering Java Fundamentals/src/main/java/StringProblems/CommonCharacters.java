// 16.	Write a program to find the common characters between two strings.

package StringProblems;

import java.util.HashSet;

public class CommonCharacters {
    public static void main(String[] args) {
    	
        String str1 = "Vishal";         // Define two input strings
        String str2 = "Chothe Patil";
        
        // Create a HashSet to store characters from the first string
        HashSet<Character> set1 = new HashSet<>();
        // Create another HashSet to store common characters
        HashSet<Character> common = new HashSet<>();
        
        // Add all characters of the first string to the HashSet
        for (char c : str1.toCharArray()) {
            set1.add(c);
        }
        
        // Iterate through the characters of the second string
        for (char c : str2.toCharArray()) {
            // Check if the character is present in the HashSet of the first string
            if (set1.contains(c)) {
                // If present, add it to the HashSet for common characters
                common.add(c);
            }
        }

        System.out.println("Common Characters: " + common);
    }
}
