// 	25. Write a program to Check if a String Contains Only Digits.

package StringProblems;

public class IsDigitString {

	public static void main(String[] args) {

		String str = "12345";

		// The regex "\\d+" checks if the string contains only digits (0-9)
		// The "+" symbol indicates one or more digits
		boolean isDigit = str.matches("\\d+");

		System.out.println("String contains only digits: " + isDigit);
	}
}