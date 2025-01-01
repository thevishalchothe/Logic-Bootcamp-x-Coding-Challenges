// 10. Write a program to find the length of a string without using any built-in function.
package codingchallenge.solutions.simplejava;

public class StringLengthWithoutFunction {
    public static void main(String[] args) {
        String str = "Hello World! Chothe Patil";
        int length = 0;
        
        // Loop through the string and count the characters
        for (int i = 0; i < str.length(); i++) {
            length++;
        }
        
        // Print the length of the string
        System.out.println("Length of the string: " + length);
    }
}
