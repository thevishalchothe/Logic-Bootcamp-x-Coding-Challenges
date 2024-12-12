// 20.	Write a program to find the smallest element in a PriorityQueue.

package mastering.java.collections.programs;

import java.util.PriorityQueue;

public class SmallestElementInPriorityQueue {

	public static void main(String[] args) {

		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		priorityQueue.add(20);
		priorityQueue.add(10);
		priorityQueue.add(30);

		System.out.println("Smallest element: " + priorityQueue.peek());
	}
}
