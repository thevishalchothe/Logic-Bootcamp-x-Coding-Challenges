//23. Write a program to Find the sum of all elements in an array.

package JavaBasicsandControlFlowProblems;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements: ");

		int n = sc.nextInt(); // Read the number of elements and store it in variable `n`
		int[] arr = new int[n]; // Create an array of size `n`

		// Input elements in the array
		System.out.println("Enter elements:"); // Prompt user to input array elements
		for (int i = 0; i < n; i++) { // Loop through the array
			arr[i] = sc.nextInt(); // Read each element and store it in the array
		}

		// Find sum of array elements
		int sum = 0; // Initialize variable `sum` to store the total sum
		for (int i = 0; i < n; i++) { // Iterate through the array
			sum += arr[i]; // Add each array element to `sum`
		}
		
        System.out.println("Sum of all elements : " + sum);

	}
}
