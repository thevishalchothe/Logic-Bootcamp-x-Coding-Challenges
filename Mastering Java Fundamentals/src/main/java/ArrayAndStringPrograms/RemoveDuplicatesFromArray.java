// 5.	Write a program to remove duplicate elements from an array.

package ArrayAndStringPrograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {

	    public static void main(String[] args) {
	    	
	        int[] array = {1, 2, 2, 3, 4, 4, 5};
	        
	     // Creating a Set to store unique elements
	        Set<Integer> set = new LinkedHashSet<>();
	        
	        // Looping through the array to add elements to the Set
	        for (int num : array) {
	            set.add(num); // Set will automatically remove duplicates
	        }
	        
	        // Printing the set, which now contains only unique elements
	        System.out.println("After Removing Duplicate : "+set);
	    }
	}