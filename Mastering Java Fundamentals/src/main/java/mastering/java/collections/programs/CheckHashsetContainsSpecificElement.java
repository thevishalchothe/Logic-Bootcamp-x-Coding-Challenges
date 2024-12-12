// 6.	Write a program to check if a HashSet contains a specific element.

package mastering.java.collections.programs;

	import java.util.HashSet;
	import java.util.Set;

	public class CheckHashsetContainsSpecificElement {
		
	    public static void main(String[] args) {
	    
	    	Set<String> set = new HashSet<>();
	        set.add("Apple");
	        set.add("Banana");
	        set.add("Orange");

	        System.out.println("Contains 'Apple'? --> " + set.contains("Apple"));
	        
	        System.out.println("Contains 'Grapes'? --> " + set.contains("Grapes"));
	    }
	}
