//	13. Find the Length of the Longest Substring Without Repeating Characters

package mastering.java.string.programs;

import java.util.HashSet;

public class LongestUnqueSubstring {

	    public static void main(String[] args) {
	    	// Input string to find the longest substring without repeating characters
	    	String str = "abcabcbb";

	        // Set to store unique characters in the current substring
	        HashSet<Character> set = new HashSet<>();

	        // Two pointers for the sliding window
	        int left = 0; 
	        int maxLength = 0; // To store the length of the longest substring

	        // Loop through the string with the right pointer
	        for (int right = 0; right < str.length(); right++) {
	            // If the character is already in the set, move the left pointer and remove characters
	            while (set.contains(str.charAt(right))) {
	                set.remove(str.charAt(left)); // Remove the character at 'left'
	                left++; // Move the left pointer
	            }

	            // Add the current character to the set
	            set.add(str.charAt(right));

	            // Update the maximum length
	            maxLength = Math.max(maxLength, right - left + 1);
	        }

	        System.out.println("Length of longest substring: " + maxLength);
	    }
	}