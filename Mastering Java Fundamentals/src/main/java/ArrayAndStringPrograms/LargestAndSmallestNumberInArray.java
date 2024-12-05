// 2.  Write a Program to Find the Largest and Smallest Element

package ArrayAndStringPrograms;

public class LargestAndSmallestNumberInArray {
	
	public static void main(String[] args) {
		
        int[] array = {34, 67, 12, 89, 45}; 		// Initializing an array of integers
        
        // Assuming the first element is both the maximum and minimum
        int max = array[0], min = array[0];
        
        // Loop through each element in the array to find the largest and smallest
        for (int num : array) {
            // If the current number is greater than the max, update max
            if (num > max) max = num;
            // If the current number is smaller than the min, update min
            if (num < min) min = num;
        }
        
        // Print the largest and smallest numbers
        System.out.println("Largest Number is : " + max + ", Smallest Number is : " + min);
        
	}
}