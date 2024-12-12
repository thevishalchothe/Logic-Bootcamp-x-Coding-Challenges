// 9.	Write a program to implement a queue using LinkedList.

package mastering.java.collections.programs;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementQueueUsingLinkedList {

	public static void main(String[] args) {

		// Create a Queue using LinkedList
		Queue<Integer> queue = new LinkedList<>();

		// Add elements to the queue (enqueue operation)
		queue.add(10); // Adds 10 to the queue
		queue.add(20); // Adds 20 to the queue (follows FIFO order)
		queue.add(30); // Adds 30 to the queue (follows FIFO order)

		// Print the current elements of the queue
		System.out.println("Queue elements: " + queue); // Displays [10, 20, 30]

		// Remove an element from the queue (dequeue operation)
		System.out.println("Removed element: " + queue.poll()); // Removes and displays 10 (front of the queue)

		// Peek at the front element of the queue without removing it
		System.out.println("Next element: " + queue.peek()); // Displays 20 (new front element)

	}

}
