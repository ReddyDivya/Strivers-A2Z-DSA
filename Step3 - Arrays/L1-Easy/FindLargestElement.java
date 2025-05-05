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
        Scanner scn = new Scanner(System.in); // Creating Scanner object to take input

        System.out.println("Enter the number of elements:");
        int n = scn.nextInt(); // Reading the size of the array

        System.out.println("Enter the elements:");
        int[] arr = new int[n]; // Creating array of size n

        // Reading n elements from the user
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
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