/*
1. Find the Smallest element in an array

# Approach 1: - Brute Force
Step1: Sort the array in ascending order.
Step2: Print the (size of the array -1)th index.

# Approach 2: - Recursive Approach(Using a max variable)
Step1: Create a min variable and initialize it with arr[0].
Step2: Use a for loop and compare it with other elements of the array
Step3: If any element is smaller than the min value, update min value with the element’s value
Step4: Print the min variable.
*/

/*
1. Find the Smallest element in an array

# Approach 1: - Brute Force
Step1: Sort the array in ascending order.
Step2: Print the (size of the array -1)th index.

# Approach 2: - Recursive Approach(Using a max variable)
Step1: Create a min variable and initialize it with arr[0].
Step2: Use a for loop and compare it with other elements of the array
Step3: If any element is smaller than the min value, update min value with the element’s value
Step4: Print the min variable.
*/

import java.util.*;

public class FindSmallestElement{
    public static void main(String[] args){
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

        // Call the method to find the smallest element and print the result
        System.out.println("Brute Force: " + findSmallestElementBF(arr));

        // Call the method to find the smallest element and print the result
        System.out.println("Optimal: " + findSmallestElementOptimal(arr));
    }//main

    static int findSmallestElementBF(int[] arr){
        Arrays.sort(arr);

        // Return the smallest element which is the fist element after sorting
        return arr[0];
    }//findSmallestElementBF

    static int findSmallestElementOptimal(int[] arr){
        
        int min = arr[0];

        // Iterate through the array
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        // Return the smallest element found
        return min;
    }//findSmallestElementOptimal
}

/*
Output:

Given Array: 
32 25 11 13
The smallest element in the array is(Brute Force): 11
The smallest element in the array is(Optimal): 11
*/