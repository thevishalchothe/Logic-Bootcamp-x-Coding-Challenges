// 2. Write a program to determine if a string is a palindrome.

package codingchallenge.solutions.simplejava;

public class PalindromeString {

	public static void main(String[] args) {

		String str = "MadAm";
		String reversed = "";

		// Reverse the string
		for (int i = str.length() - 1; i >= 0; i--) {
			reversed += str.charAt(i);
		}

		// Convert both strings to lowercase to make the comparison case-insensitive
		if (str.toLowerCase().equals(reversed.toLowerCase())) {
			System.out.println(str + " -> This string is a palindrome.");
		} else {
			System.out.println(str + " -> This string is not a palindrome.");
		}
	}
}
