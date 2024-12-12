//24. Write a ProgramCount the number of characters in a string.

package mastering.java.basicsandcontrolflow.programs;

import java.util.Scanner;

public class CountTheCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");

		String str = sc.nextLine();

		// Count the number of characters
		System.out.println("Number of characters: " + str.length());
	}
}