// 24. Write a program to Join All Elements of an Array into a Single String

package StringProblems;

public class JoinArrayElements {

	public static void main(String[] args) {

		String[] array = { "Hello", "World", "Java" }; // Initialize an array of strings with three elements

		// Use String.join() method to join array elements into a single string with a
		// space as the delimiter
		String result = String.join(" ", array);

		System.out.println("Joined String: " + result);
	}
}