// 19.	Write a program to clone an ArrayList.

package mastering.java.collections.programs;

import java.util.ArrayList;

public class CloneAnArrayList {

	public static void main(String[] args) {

		ArrayList<String> originalList = new ArrayList<>();
		originalList.add("A");
		originalList.add("B");

		// Clone the original ArrayList to create a new list
		// The clone() method creates a shallow copy of the ArrayList
		ArrayList<String> clonedList = (ArrayList<String>) originalList.clone();

		// Display the original and cloned lists
		System.out.println("Original List: " + originalList); // Output: [A, B]
		System.out.println("Cloned List: " + clonedList); // Output: [A, B]
	}
}
