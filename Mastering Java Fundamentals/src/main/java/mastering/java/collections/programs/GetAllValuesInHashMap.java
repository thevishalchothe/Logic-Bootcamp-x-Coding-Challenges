// 21.	Write a program to get all values in a HashMap using values().

package mastering.java.collections.programs;

import java.util.HashMap;
import java.util.Map;

public class GetAllValuesInHashMap {
	
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 1);
		map.put("B", 2);

		System.out.println("Values: " + map.values());
	}
}
