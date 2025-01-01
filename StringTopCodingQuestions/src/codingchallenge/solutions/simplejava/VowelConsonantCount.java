// 3. Write a program to count the number of vowels and consonants in a string.

package codingchallenge.solutions.simplejava;

public class VowelConsonantCount {
	public static void main(String[] args) {
		String str = "Hello World! Vishal here";
		int vowels = 0, consonants = 0;

		// Convert the string to lowercase to handle both cases
		str = str.toLowerCase();

		// Loop through the string to count vowels and consonants
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') { // or Define a set of vowels in hashset & check count in if vowelSet.contains(ch)
				vowels++;
			} else if (ch >= 'a' && ch <= 'z') {
				consonants++;
			}
		}

		// Print the results
		System.out.println("Vowels: " + vowels);
		System.out.println("Consonants: " + consonants);
	}
}
