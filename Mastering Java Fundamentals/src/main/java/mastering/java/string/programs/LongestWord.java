// 	23. Write a program to Find the Longest Word in a Sentence

package mastering.java.string.programs;

public class LongestWord {

	public static void main(String[] args) {
		
		String sentence = "This is a simple sentence";
		
		// Split the sentence into words based on whitespace
        String[] words = sentence.split("\\s+");
        
        // Variable to keep track of the longest word
        String longest = "";

        // Iterate over each word in the sentence
        for (String word : words) {
            // Check if the current word is longer than the longest found so far
            if (word.length() > longest.length()) {
                // Update the longest word
                longest = word;
			}
		}

		System.out.println("Longest word: " + longest);
	}
}