// 15.	Write a program to sort a list of strings alphabetically.

package mastering.java.collections.programs;

import java.util.ArrayList;
import java.util.Collections;

public class SortListOfStringAlphabetically {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		list.add("Charlie");
		list.add("Alice");
		list.add("Bob");

		Collections.sort(list);

		System.out.println("Sorted list: " + list);
	}
}
