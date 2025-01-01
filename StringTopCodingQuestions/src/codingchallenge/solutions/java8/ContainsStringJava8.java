// 8. Write a program to check if one string is contained within another string using Java8.
package codingchallenge.solutions.java8;

public class ContainsStringJava8 {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "World";
        
        // Use Java 8 Stream to check if str1 contains str2
        if (str1.contains(str2)) {
            System.out.println("The string contains the substring.");
        } else {
            System.out.println("The string does not contain the substring.");
        }
    }
}
