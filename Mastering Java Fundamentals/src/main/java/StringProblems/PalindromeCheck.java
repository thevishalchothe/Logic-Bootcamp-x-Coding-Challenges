//17. Check if a String is a Palindrome Using a Stack (Non-recursive).

package StringProblems;

import java.util.Stack;

public class PalindromeCheck {
	public static void main(String[] args) {
		
		String str = "madam";
		
		Stack<Character> stack = new Stack<>();

		for (char c : str.toCharArray()) {
			stack.push(c);
		}

		StringBuilder reversed = new StringBuilder();
		while (!stack.isEmpty()) {
			reversed.append(stack.pop());
		}

		boolean isPalindrome = str.equals(reversed.toString());
		
		System.out.println("String is palindrome: " + isPalindrome);
		
	}
}