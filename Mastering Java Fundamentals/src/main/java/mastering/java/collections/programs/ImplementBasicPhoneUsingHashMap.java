// 12.	Write a program to implement a basic phone book using HashMap.

package mastering.java.collections.programs;

import java.util.HashMap;
import java.util.Map;

public class ImplementBasicPhoneUsingHashMap {

	public static void main(String[] args) {

		Map<String, String> phoneBook = new HashMap<>();
		phoneBook.put("Alice", "1234567890");
		phoneBook.put("Bob", "9876543210");

		for (Map.Entry<String, String> entry : phoneBook.entrySet()) {

			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
