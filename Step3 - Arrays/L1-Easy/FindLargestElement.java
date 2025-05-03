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
        
        // Brute Force approach using sorting
        System.out.println("Brute Force approach: ");
        
        // Input array
        int[] arr = {2, 3, 4, 5, 6, 2};
        
        // Sort the array in ascending order
        Arrays.sort(arr);
        
        // The last element will be the largest
        System.out.println("Largest: " + arr[arr.length - 1]);

        /* -------------------------------------------------------------------- */
        
        // Optimal approach using a max variable
        System.out.println("Optimal approach: ");
        
        // Initialize max with the first element
        int max = arr[0];
        
        // Traverse the array to find the maximum
        for (int i = 0; i < arr.length; i++) {
            // If current element is greater than max, update max
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        // Print the largest element
        System.out.println("Largest: " + max);
    }
}

/*
Output:
Brute Force approach: 
Largest: 6
Optimal approach: 
Largest : 6
*/