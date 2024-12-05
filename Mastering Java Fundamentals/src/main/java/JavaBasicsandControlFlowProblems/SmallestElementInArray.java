// 	22. Write a program to find the smallest element in an array.

package JavaBasicsandControlFlowProblems;

import java.util.Scanner;

public class SmallestElementInArray {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of elements: ");
	        int n = sc.nextInt();
	        
	        int[] arr = new int[n]; // Declare an array of size 'n'
	        
	        // Input elements in the array
	        System.out.println("Enter elements:");
	        for (int i = 0; i < n; i++) { 
	            arr[i] = sc.nextInt(); // Read each element into the array
	        }
	        
	        // Find the smallest element
	        int min = arr[0]; // Initialize 'min' with the first element of the array
	        for (int i = 1; i < n; i++) { // Loop through the array starting from the second element
	            if (arr[i] < min) { // Check if the current element is smaller than 'min'
	                min = arr[i]; // Update 'min' to the current smaller element
	            }
	        }
	        System.out.println("The smallest element is: " + min);
	    }
	}