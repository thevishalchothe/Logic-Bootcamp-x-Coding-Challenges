// 22.	Write a program to split a string into words based on spaces.

package mastering.java.string.programs;

public class WordCount {

	public static void main(String[] args) {

		// Initialize the sentence to be counted
		String sentence = "This is a Mastering Java Fundamental.";

		// Split the sentence into words using whitespace as the delimiter
		// "\\s+" matches one or more whitespace characters (spaces, tabs, etc.)
		String[] words = sentence.split("\\s+");

		// Print the word count by getting the length of the array 'words'
		System.out.println("(Using Whitespace as the Delimiter) Word count is : " + words.length);
		
// ---------------------------------------------------------------------------------
		
        String sent = "My name is Vishal Chothe.";

		 // Initialize word count variable
        int wordCount = 0;
        
        // Split the sentence by spaces and loop through the words
        for (String word : sent.split(" ")) {
            // If the word is not empty, count it
            if (!word.isEmpty()) {
                wordCount++;
            }
        }
        
        // Print the word count
        System.out.println("(Split the sentence by spaces and loop through the words) Word count is : " + wordCount);
	}
}
