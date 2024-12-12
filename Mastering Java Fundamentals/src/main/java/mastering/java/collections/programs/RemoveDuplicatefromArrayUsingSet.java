// 2.	Write a program to remove duplicates from an array using a Set.

package mastering.java.collections.programs;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatefromArrayUsingSet {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 2, 4, 1 };
		Set<Integer> uniqueSet = new HashSet<>();

		for (int num : array) {
			uniqueSet.add(num);
		}

		System.out.println("Unique elements from an array using a Set : " + uniqueSet);
	}
}
