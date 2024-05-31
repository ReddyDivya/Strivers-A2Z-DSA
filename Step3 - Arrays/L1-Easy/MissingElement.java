/*
Find the missing number in an array

Example 1:
Input Format: N = 5, array[] = {1,2,4,5}
Result: 3
Explanation: In the given array, number 3 is missing. So, 3 is the answer.

Example 2:
Input Format: N = 3, array[] = {1,3}
Result: 2
Explanation: In the given array, number 2 is missing. So, 2 is the answer.

# Approach 1: Brute-force approach


*/
public class MissingElement {
    // Method to find the missing element using a brute-force approach
    /*
    - Iterate over the numbers from 1 to N using a for loop.
    - Inside the loop, initialize a flag variable to 0.
    - Iterate over the elements of the array using another for loop.
    - Check if the current number from the outer loop exists in the array. If found, set the flag to 1 and break the inner loop.
    - After the inner loop, check if the flag is still 0. If yes, return the current number as it is missing in the array.
    */
    public static int missingElementBF(int[] arr, int n) {
        // Loop through each number from 1 to n
        for (int i = 1; i <= n; i++) {
            // flag variable to check if an element exists
            int flag = 0;

            // Loop through each element in the array
            for (int j = 0; j < arr.length; j++) {
                // If the current number is found in the array, set flag to 1 and break the loop
                if (arr[j] == i) {
                    // i is present in the array
                    flag = 1;
                    break;
                }
            }

            // If the flag is still 0, it means the current number is missing, return it
            if (flag == 0)
                return i;
        }

        // The following line will never execute.
        // It is just to avoid warnings.
        return -1;
    }

    public static void main(String[] args) {
        int n = 5; // Length of the sequence
        int arr[] = {1, 2, 4, 5}; // Given array

        // Display initial array
        System.out.println("Given Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Find the missing number using the brute-force method
        int ans = missingElementBF(arr, n);
        System.out.println("The missing number is: " + ans);
    }
}
