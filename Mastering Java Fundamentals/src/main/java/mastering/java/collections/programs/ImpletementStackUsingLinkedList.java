// 8.	Write a program to implement a stack using LinkedList.

package mastering.java.collections.programs;

import java.util.LinkedList;

public class ImpletementStackUsingLinkedList {

	public static void main(String[] args) {

		LinkedList<Integer> stack = new LinkedList<>();

		// Push elements onto the stack (inserts at the beginning of the list)
		stack.push(10); // Adds 10 to the stack
		stack.push(20); // Adds 20 to the stack (now top of the stack)
		stack.push(30); // Adds 30 to the stack (now top of the stack)

		// Print the current elements of the stack
		System.out.println("Stack elements: " + stack); // Displays [30, 20, 10]

		// Pop an element from the stack (removes and returns the top element)
		System.out.println("Popped element: " + stack.pop()); // Removes and displays 30

		// Peek at the top element of the stack without removing it
		System.out.println("Top element: " + stack.peek()); // Displays 20 (current top element)

	}
}
