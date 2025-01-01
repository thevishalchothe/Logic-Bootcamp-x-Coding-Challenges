// 4. Write a program to find the first non-repeated character in a string.
package codingchallenge.solutions.simplejava;

public class FirstNonRepeatedChar {
	public static void main(String[] args) {
		String str = "swiss bank";

		// Loop through the string
		for (int i = 0; i < str.length(); i++) {
			boolean isRepeated = false;

			// Check if the current character is repeated in the string
			for (int j = 0; j < str.length(); j++) {
				if (i != j && str.charAt(i) == str.charAt(j)) {
					isRepeated = true;
					break;
				}
			}

			// If it's not repeated, print and exit
			if (!isRepeated) {
				System.out.println("First non-repeated character : " + str.charAt(i));
				break;
			}
		}
	}
}
