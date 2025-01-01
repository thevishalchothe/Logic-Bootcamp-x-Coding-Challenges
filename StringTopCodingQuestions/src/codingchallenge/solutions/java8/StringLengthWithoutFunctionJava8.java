// 10. Write a program to find the length of a string without using any built-in function using Java8.
package codingchallenge.solutions.java8;

public class StringLengthWithoutFunctionJava8 {
	public static void main(String[] args) {
		String str = "Hello World!";

		// Use Streams to count the characters in the string
		long length = str.chars().count();
		// Print the length of the string
		System.out.println("Length of the string: " + length);
	}
}
