// 5. Write a program to check if two strings are anagrams of each other.
package codingchallenge.solutions.simplejava;

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "listen"; 
        String str2 = "silent"; 
        
        // Sort the characters of both strings
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        // Compare the sorted strings
        if (Arrays.equals(arr1, arr2)) {
            System.out.println(str1 +" & "+str2+" > This strings are anagrams.");
        } else {
            System.out.println("This strings are not anagrams.");
        }
    }
}
