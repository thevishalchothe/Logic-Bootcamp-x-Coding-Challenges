// 18.	Write a program to implement a simple inventory system using Map.

package mastering.java.collections.programs;

	import java.util.HashMap;
	import java.util.Map;

	public class ImplementSimpleInventorySystemUsingMap {
		
	    public static void main(String[] args) {
	    	
	        Map<String, Integer> inventory = new HashMap<>();
	        inventory.put("Apple", 50);
	        inventory.put("Banana", 30);
	        inventory.put("Orange", 20);

	        System.out.println("Inventory items:");
	        
	        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }
	    }
	}
