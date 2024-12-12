// 22.	Write a program to sort an ArrayList using Collections.sort().

package mastering.java.collections.programs;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(30);
		list.add(10);
		list.add(20);

		Collections.sort(list);
		System.out.println("Sorted list: " + list);
	}
}
