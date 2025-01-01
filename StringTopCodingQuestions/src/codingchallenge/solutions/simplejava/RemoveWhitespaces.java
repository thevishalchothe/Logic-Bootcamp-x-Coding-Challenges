// 6. Write a program to remove all whitespace characters from a string.
package codingchallenge.solutions.simplejava;

public class RemoveWhitespaces {
	public static void main(String[] args) {
		String str = "Hello World! This is Vishal Chothe Patil.";

		// Remove all whitespaces by replacing them with an empty string
		// String result = str.replaceAll("\\s", ""); //\\s is a regular expression (regex) that matches any whitespace character.

		String result = "";

		// Iterate through the string character by character
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			// Append characters to result if they are not whitespace
			if (!Character.isWhitespace(c)) {
				result += c;
			}
		}

		// Print the result
		System.out.println("String without whitespaces: " + result);
	}
}
