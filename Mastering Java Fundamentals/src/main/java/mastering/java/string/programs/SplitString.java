// 22. Write a Program to Split a String into Words Based on Spaces

package mastering.java.string.programs;

public class SplitString {

	public static void main(String[] args) {

		String str = "This is a sentence";

		// Use the split method with regular expression "\\s+" to split the string based on one or more spaces.
		String[] words = str.split("\\s+");

		// Iterate through the array of words and print each word on a new line
		for (String word : words) {
			System.out.println(word);
		}
	}
}