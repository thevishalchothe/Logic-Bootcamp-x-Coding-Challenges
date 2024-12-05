//	25. Write a program to find the average of an array of numbers.

package JavaBasicsandControlFlowProblems;

import java.util.Scanner;

public class AverageOfArray {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of elements: ");
	        int n = sc.nextInt(); // Read the number of elements in the array
	        int[] arr = new int[n]; // Declare an array of size 'n'
	        
	        // Input elements in the array
	        System.out.println("Enter elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt(); // Read each element from the user
	        }
	        
	        // Initialize sum to store the total of array elements
	        int sum = 0;
	        for (int i = 0; i < n; i++) {
	            sum += arr[i]; // Add each element to the sum
	        }
	        
	        // Calculate the average by dividing the sum by the number of elements
	        double average = (double) sum / n; // Cast sum to double for accurate division
	        System.out.println("Average of elements: " + average); 
	    }
	}
