// 1. Write a program to Create a list of integers and print them using a for-each loop

package mastering.java.collections.programs;

import java.util.ArrayList;
import java.util.List;

public class ListofIntegerIterateUsingforeachLoop {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		
		System.out.print("Iterate List through for-each Loop : ");
		for (int number : numbers) {
			System.out.print(" "+ number);
		}
	}
}
