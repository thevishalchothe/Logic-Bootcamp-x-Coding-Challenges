// 17. Write A Program to Create a PriorityQueue and sort elements in ascending order.

package mastering.java.collections.programs;

import java.util.PriorityQueue;

public class PriorityQueueSortElementsInAscendingOrder {

	public static void main(String[] args) {

		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		priorityQueue.add(20);
		priorityQueue.add(10);
		priorityQueue.add(30);

		System.out.println("Elements in ascending order:");

		while (!priorityQueue.isEmpty()) {
			System.out.println(priorityQueue.poll());
		}
	}
}
