// 23.	Write a program to create a list of employee names and filter those with names starting with 'A'.

package mastering.java.collections.programs;

import java.util.ArrayList;
import java.util.List;

public class FilterEmployeeStartingNameWithA {

	public static void main(String[] args) {

		List<String> employees = new ArrayList<>();
		employees.add("Alice");
		employees.add("Bob");
		employees.add("Amanda");

		System.out.println("List of employee names and filter those with names starting with 'A': ");
		
		employees.stream().filter(name -> name.startsWith("A")).forEach(System.out::println);
		
	}
}
