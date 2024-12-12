// 4. Write a Program to Create a HashMap that stores employee names and their salaries, then print the entries.

package mastering.java.collections.programs;

import java.util.HashMap;
import java.util.Map;

public class HashMapToStroreEntriesNameandSalary {
	
	public static void main(String[] args) {
	
		Map<String, Double> employeeSalaries = new HashMap<>();
		employeeSalaries.put("John", 50000.0);
		employeeSalaries.put("Alice", 60000.0);
		employeeSalaries.put("Bob", 55000.0);

		System.out.println("HashMap that stores employee names and their salaries : ");
		
		for (Map.Entry<String, Double> entry : employeeSalaries.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
