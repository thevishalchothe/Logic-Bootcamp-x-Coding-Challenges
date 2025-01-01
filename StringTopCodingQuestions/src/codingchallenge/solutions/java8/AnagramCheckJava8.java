// 5. Write a program to check if two strings are anagrams of each other using Java8.
package codingchallenge.solutions.java8;

public class AnagramCheckJava8 {
	public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "silent";

		// Use Streams to sort and compare both strings
		if (str1.chars().sorted().toArray() == str2.chars().sorted().toArray()) {
			System.out.println("The strings are anagrams.");
		} else {
			System.out.println("The strings are not anagrams.");
		}
	}
}
