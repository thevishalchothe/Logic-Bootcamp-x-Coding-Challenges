// 14.	Write a program to remove all elements from a list using clear().

package mastering.java.collections.programs;

import java.util.ArrayList;

public class RemoveAllElementsFromList {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");

		System.out.println("Before clear (Elements from List) : " + list);
		
		list.clear();
		
		System.out.println("After clear(Elements from List) : " + list);
	}
}
