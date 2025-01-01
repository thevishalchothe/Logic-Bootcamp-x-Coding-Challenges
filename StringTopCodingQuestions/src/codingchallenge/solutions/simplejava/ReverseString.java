// 1)	Write a program to reverse a given string.
package codingchallenge.solutions.simplejava;

public class ReverseString {
	
    public static void main(String[] args) {
    	
        String beforeReversed = "Hello World! Vishal";
        String afterReversed = "";
        
        // Loop through the string from end to start
        for (int i = beforeReversed.length() - 1; i >= 0; i--) {
        	afterReversed += beforeReversed.charAt(i);  // Append each character in reverse order
        }
        
        // Print the reversed string
        System.out.println("Reversed String: " + afterReversed);
        
     // -----------------------------------------------------------------
		
     		String str = "Chothe Patil";

     		// Use StringBuilder to reverse the string in Java 8
     		String reversed = new StringBuilder(str).reverse().toString();

     		// Print the reversed string
     		System.out.println("Reversed String (with StringBuilder): " + reversed);

    }
}
