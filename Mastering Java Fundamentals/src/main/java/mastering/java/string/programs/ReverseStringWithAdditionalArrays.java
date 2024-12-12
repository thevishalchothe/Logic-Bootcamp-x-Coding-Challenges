// 14.	Reverse a string with using additional arrays or lists.

package mastering.java.string.programs;

public class ReverseStringWithAdditionalArrays {
	
    public static void main(String[] args) {

    	String str = "Vishal";         // Initialize the string to be reversed
    	
        String reversed = "";

        // Loop through the string from the last character to the first
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i); // Append each character to the reversed string
        }

        // Print the reversed string
        System.out.println("Reversed String Using for Loop: " + reversed);

 // -----------------------------------------------------------------------------------
        // Reverse a string with using additional arrays or lists, using StringBuilder

        String str1 = "Chothe";

        // Create a StringBuilder to build the reversed string
        StringBuilder reversed1 = new StringBuilder();

        // Loop through the string from the last character to the first
        for (int i = str1.length() - 1; i >= 0; i--) {
            reversed1.append(str1.charAt(i)); // Append each character to the StringBuilder
        }

        // Print the reversed string from the StringBuilder
        System.out.println("\nReversed String Using String builder: " + reversed1);
    }
}
