// 19. Write a Program to Print the reverse of a string.

package mastering.java.basicsandcontrolflow.programs;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String str = sc.nextLine();

		// Initialize an empty string to store the reversed string
		String reversed = "";

		// Loop through the original string from the last character to the first
		for (int i = str.length() - 1; i >= 0; i--) {
			// Append each character to the 'reversed' string
			reversed += str.charAt(i);
		}

		// Print the reversed string
		System.out.println("Reversed string: " + reversed);
	}
}
