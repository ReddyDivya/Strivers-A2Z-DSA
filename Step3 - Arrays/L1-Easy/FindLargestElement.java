/*
1. Find the Largest element in an array

# Approach 1: - Brute Force
Step1: Sort the array in ascending order.
Step2: Print the (size of the array -1)th index.

# Approach 2: - Recursive Approach(Using a max variable)
Step1: Create a max variable and initialize it with arr[0].
Step2: Use a for loop and compare it with other elements of the array
Step3: If any element is greater than the max value, update max value with the element’s value
Step4: Print the max variable.
*/
/* Online Java Compiler and Editor */
import java.util.*;

public class FindLargestElement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); // Create Scanner object to read input
        int n = 0;
        int[] arr = null;

        try {
            System.out.println("Enter the number of elements:");
            n = scn.nextInt(); // Read the size of the array

            // If the array has fewer than 2 elements, we cannot find a second smallest
            if (n < 2) {
                System.out.println("There is no second smallest element in the array.");
                return;
            }

            // Initialize array and read user input
            arr = new int[n];
            System.out.println("Enter the elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = scn.nextInt(); // Read each element into the array
            }

        } catch (InputMismatchException e) {
            // Handle non-integer input
            System.out.println("Error: Invalid input. Please enter integers only.");
            return; // Exit program after catching input error
        } finally {
            scn.close(); // Always close Scanner to avoid memory leaks
        }
        
        fnLargestElementBrute(arr, arr.length);
        fnLargestElementOptimal(arr, arr.length);
        
    }
    static private void fnLargestElementBrute(int[] arr, int n) {
        // Brute Force approach using sorting
        System.out.println("Brute Force approach: ");
        
        // Sort the array in ascending order
        Arrays.sort(arr);
        
        // The last element will be the largest
        System.out.println("Largest: " + arr[n - 1]);
    }//fnLargestElementBrute

    static private void fnLargestElementOptimal(int[] arr, int n) {
        // Optimal approach using a max variable
        System.out.println("Optimal approach: ");
        
        // Initialize max with the first element
        int max = arr[0];
        
        // Traverse the array to find the maximum
        for (int i = 0; i < n; i++) {
            // If current element is greater than max, update max
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        // Print the largest element
        System.out.println("Largest: " + max);
    }//fnLargestElementOptimal
}

/*
Output:
Brute Force approach: 
Largest: 6
Optimal approach: 
Largest : 6
*/