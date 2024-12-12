// 10.	Write a program to merge two ArrayLists into one.

package mastering.java.collections.programs;

import java.util.ArrayList;

public class MergeTwoArrayListIntoOne {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>();
		list1.add("A");
		list1.add("B");

		ArrayList<String> list2 = new ArrayList<>();
		list2.add("C");
		list2.add("D");

		list1.addAll(list2);
		
		System.out.println("Merged list: " + list1);
	}
}
