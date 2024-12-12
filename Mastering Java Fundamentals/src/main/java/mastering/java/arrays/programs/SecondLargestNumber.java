// 6.	Write a program to find the second largest number in an array.

package mastering.java.arrays.programs;

public class SecondLargestNumber {
	public static void main(String[] args) {

		int[] array = { 10, 20, 15, 25, 30 };

		// Initialize largest and secondLargest to the minimum possible value
		int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;

		// Iterate through each number in the array
		for (int num : array) {
			// If the current number is greater than the largest number found so far
			if (num > largest) {
				// Update secondLargest to the old largest value
				secondLargest = largest;
				// Update largest to the current number
				largest = num;
			}
			// If the current number is not equal to the largest and is greater than
			// secondLargest
			else if (num > secondLargest && num != largest) {
				// Update secondLargest to the current number
				secondLargest = num;
			}
		}

		// Output the second largest number
		System.out.println("Second Largest: " + secondLargest);
	}
}
