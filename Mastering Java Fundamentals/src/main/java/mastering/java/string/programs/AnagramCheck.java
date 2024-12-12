// 15.	Write a program to check if a string is an anagram of another string.

// Defination Anagram : An anagram is a word, phrase, or name formed by rearranging the letters of another, typically using all the original letters exactly once.
// Examples : "a gentleman" and "elegant man" are anagrams (ignoring spaces).

package mastering.java.string.programs;

import java.util.Arrays;

public class AnagramCheck {
	
    public static void main(String[] args) {
    	
    	 // Define two strings to check if they are anagrams
        String str1 = "listen"; // First string
        String str2 = "silent"; // Second string

        // Convert the strings to character arrays
        // This is necessary for sorting the characters
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // Sort both character arrays
        // Sorting ensures that anagrams have the same order of characters
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare the sorted arrays
        // If the sorted arrays are equal, the strings are anagrams
        boolean isAnagram = Arrays.equals(arr1, arr2);
        
        System.out.println("Strings are anagrams: " + isAnagram);
    }
}
