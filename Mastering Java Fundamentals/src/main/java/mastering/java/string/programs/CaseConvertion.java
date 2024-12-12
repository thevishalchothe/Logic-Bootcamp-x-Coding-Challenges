// 18.	Write a Program to Convert a string to lowercase/uppercase.

package mastering.java.string.programs;

public class CaseConvertion {

	public static void main(String[] args) {
		
		String str = "Hello World";

		String lowerCase = str.toLowerCase();
		String upperCase = str.toUpperCase();

		System.out.println("Lowercase: " + lowerCase);
		System.out.println("Uppercase: " + upperCase);
		
	}
}
