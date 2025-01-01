// 3. Write a program to count the number of vowels and consonants in a string using Java 8

package codingchallenge.solutions.java8;

public class VowelConsonantCountJava8 {
	public static void main(String[] args) {
		String str = "Jay Shree Ram";

		// Convert the string to lowercase and use Streams to count vowels and consonants
		long vowels = str.toLowerCase().chars().filter(ch -> "aeiou".indexOf(ch) != -1).count();
		long consonants = str.toLowerCase().chars().filter(ch -> ch >= 'a' && ch <= 'z' && "aeiou".indexOf(ch) == -1)
				.count();

		// Print the results
		System.out.println("Vowels: " + vowels);
		System.out.println("Consonants: " + consonants);
	}
}
