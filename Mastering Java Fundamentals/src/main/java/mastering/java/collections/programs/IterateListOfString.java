// 13.	Write a program to iterate over a list of Strings and print each element.

package mastering.java.collections.programs;

	import java.util.ArrayList;
	import java.util.List;

	public class IterateListOfString {
		
	    public static void main(String[] args) {
	    	
	        List<String> names = new ArrayList<>();
	        names.add("Alice");
	        names.add("Bob");
	        names.add("Charlie");

	        System.out.println("Iterate over a list of Strings :");
	        for (String name : names) {
	        	
	            System.out.println(name);
	        }
	    }
	}
