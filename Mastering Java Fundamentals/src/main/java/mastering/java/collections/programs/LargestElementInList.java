// 25.	Write a program to find the largest element in a list using Collections.max().

package mastering.java.collections.programs;

import java.util.ArrayList;
import java.util.Collections;

public class LargestElementInList {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(5);

		System.out.println("Largest element: " + Collections.max(list));
	}
}
