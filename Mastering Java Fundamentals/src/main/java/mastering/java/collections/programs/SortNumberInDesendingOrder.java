// 5. Write a Program to Sort a list of integers in descending order using Collections.sort().

package mastering.java.collections.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortNumberInDesendingOrder {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(5);
		numbers.add(2);
		numbers.add(8);
		numbers.add(1);

		Collections.sort(numbers, Collections.reverseOrder());
		
		System.out.println("Sorted list in descending order: " + numbers);
	}
}
