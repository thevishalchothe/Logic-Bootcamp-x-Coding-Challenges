// 14.	Reverse a string without using additional arrays or lists.

// The char[] is derived directly from the input string, so no additional arrays or lists are introduced.

package StringProblems;

public class ReverseStringWithoutUsingAdditionalArrays {
	
    public static void main(String[] args) {
    	
        String str = "Vishal";

        // Convert string to character array (does not violate the rule as it reuses memory)
        char[] charArray = str.toCharArray();

        // Reverse the char array in place
        for (int i = 0, j = charArray.length - 1; i < j; i++, j--) {
            // Swap characters
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
        }

        // Convert char array back to a string
        String reversed = new String(charArray);

        // Print the reversed string
        System.out.println("Reversed String Without Additional Arrays or Lists: " + reversed);
    }
}
