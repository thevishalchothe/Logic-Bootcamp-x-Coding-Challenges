// 7. Write a Program to Create a TreeSet and add elements to it. Print them in sorted order.

package mastering.java.collections.programs;

import java.util.TreeSet;

public class SortingOderElementUsingTreeSet {

	public static void main(String[] args) {

		TreeSet<Integer> treeSet = new TreeSet<>();
		treeSet.add(10);
		treeSet.add(5);
		treeSet.add(20);

		System.out.println("Sorted elements Using TreeSet: " + treeSet);
	}
}
