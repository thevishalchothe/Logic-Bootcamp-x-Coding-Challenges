// 24.	Write a program to check if two maps are equal.

package mastering.java.collections.programs;

import java.util.HashMap;
import java.util.Map;

public class TwoMapEqualOrNot {

	public static void main(String[] args) {

		Map<String, Integer> map1 = new HashMap<>();
		map1.put("A", 1);
		map1.put("B", 2);

		Map<String, Integer> map2 = new HashMap<>();
		map2.put("A", 1);
		map2.put("B", 2);

		System.out.println("Maps are equal? => " + map1.equals(map2));
	}
}
