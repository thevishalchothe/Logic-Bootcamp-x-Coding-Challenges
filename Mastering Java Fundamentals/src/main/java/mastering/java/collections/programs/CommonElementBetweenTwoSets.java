// 16.	Write a program to find the common elements between two sets.

package mastering.java.collections.programs;

import java.util.HashSet;
import java.util.Set;

public class CommonElementBetweenTwoSets {

	public static void main(String[] args) {

		Set<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);

		Set<Integer> set2 = new HashSet<>();
		set2.add(2);
		set2.add(3);
		set2.add(4);

		set1.retainAll(set2);

		System.out.println("Common elements: " + set1);
	}
}
