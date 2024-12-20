// 3) Write a program to determine the second largest element in an array.
package codingchallenge.solutions.simplejava;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};

        // Variables to store the largest and second largest elements
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Traverse the array to find the largest and second largest elements
        for (int num : arr) {
            if (num > largest) { 
                secondLargest = largest; // Update secondLargest before updating largest
                largest = num;          // Update largest
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;    // Update secondLargest if conditions are met
            }
        }

        // Output the second largest element
        System.out.println("Second Largest Element: " + secondLargest);
    }
}
