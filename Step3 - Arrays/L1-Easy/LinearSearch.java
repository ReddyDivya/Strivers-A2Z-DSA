/*
7. Linear Search

Example 1:
Input: arr[]= 11 2 23 14 35, num = 14
Output: 3
Explanation: 14 is present in the 3rd index

# Approach 1- Brute Force approach
Step1: Traverse the whole array and see if the element is present in the array or not.
Step2: If found, print the index of the element.
Step3: Otherwise, we will print -1.

*/
public class LinearSearch {
    /**
     * This method performs a linear search on the array to find the specified element.
     * @param arr The array to search in.
     * @param n The length of the array.
     * @param num The element to search for.
     * @return The index of the element if found, otherwise -1.
     */
    static int linearSearch(int[] arr, int n, int num) {
        for (int i = 0; i < n; i++) {
            // Check if the current element is the one we're looking for
            if (arr[i] == num) {
                return i; // Return the index if the element is found
            }
        }
        return -1; // Return -1 if the element is not found in the array
    } // linearSearch

    public static void main(String[] args) {
        // Define the array and the element to search for
        int arr[] = {11, 2, 23, 14, 35};
        int num = 141;
        int n = arr.length;

        // Print the array before performing the linear search
        System.out.println("Before Linear Search: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Perform the linear search and get the result index
        int index = linearSearch(arr, n, num);

        // Print the result based on the index returned by linearSearch
        if (index < 0) {
            // If index is -1, the element is not in the array
            System.out.print("The element " + num + " we're searching for doesn't exist in the array.");
        } else {
            // If index is valid, print the index (1-based for user readability)
            System.out.print("The element " + num + " we're searching for exists at index " + (index) + ".");
        }
    }
}
/*
Output examples:

Before Linear Search: 
11 2 23 14 35
The element 14 we're searching for exists at index 3.

Before Linear Search: 
11 2 23 14 35
The element 141 we're searching for doesn't exist in the array.
*/
