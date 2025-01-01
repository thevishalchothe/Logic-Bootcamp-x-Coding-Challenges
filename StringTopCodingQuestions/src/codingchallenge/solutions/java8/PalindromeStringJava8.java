// 2. Write a program to determine if a string is a palindrome using Java 8.

package codingchallenge.solutions.java8;

public class PalindromeStringJava8 {
	
	public static void main(String[] args) {
		
		String str = "Sir";

		// Reverse the string using Java 8 Stream API
		String reversed = new StringBuilder(str).reverse().toString();

		// Check if the string is equal to its reverse using Java 8 Stream
		if (str.equals(reversed)) {
			System.out.println(str + " -> This string is a palindrome.");
		} else {
			System.out.println(str + " -> This string is not a palindrome.");
		}
	}
}
