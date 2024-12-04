//5. Write a Program to	Find the Smallest of three numbers. 

//1. By Comparing with if Condition, the numbers and find the Smallest
//2. Using Math.max() 
//3. Using the ternary operator 
package JavaBasicsandControlFlowProblems;

import java.util.Scanner;

public class SmallestOf3Number {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();
        
//----------------------------------------------------------------------------------

        // 1. By Comparing with if Condition, the numbers and find the smallest
        int smallestIf = num1;
        if (num2 < smallestIf) {
            smallestIf = num2;
        }
        if (num3 < smallestIf) {
            smallestIf = num3;
        }
        System.out.println("By Comparing with if Condition: The smallest number is: " + smallestIf);
        
//----------------------------------------------------------------------------------

        // 2. Using Math.min() to find the smallest of the three numbers
        int smallestMathMin = Math.min(num1, Math.min(num2, num3));
        
        System.out.println("Using Math.min() Function: The smallest number is: " + smallestMathMin);

//----------------------------------------------------------------------------------

        // 3. Using the ternary operator to find the smallest number
        int smallestTernary = (num1 <= num2 && num1 <= num3) ? num1 : (num2 <= num1 && num2 <= num3) ? num2 : num3;
        
        System.out.println("Using the ternary operator: The smallest number is: " + smallestTernary);
    }
}
