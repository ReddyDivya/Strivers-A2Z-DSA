/*
- 6. Rotate array by K elements
- Right Rotate By D Place

# Approach 1- Brute Force approach for Rotating the Elements to the right
Step-1: Copy the last k elements into the temp array.
Step-2: Shift n-k elements from the beginning by k positions to the right.
Step-3: Copy the elements from the temp array back into the main array.

# Approach 2: Using "Reversal Algorithm" for Rotating Elements to right
Step 1: Reverse the last k elements of the array
Step 2: Reverse the first n-k elements of the array.
Step 3: Reverse the whole array.
*/

public class RightRotateByDElements {

    //Approach 1. Brute-force approach to rotate an array to the right by k elements
    public static void RotateToRightBF(int[] arr, int n, int k) {
        // If the array is empty, no need to rotate
        if (n == 0) return;

        // Normalize k to be within the bounds of the array length
        k = k % n;
        // If k is greater than n, there's no need to rotate as it's equivalent to k % n
        if (k > n) return;

        // Step-1: Copy the last k elements into the temp array
        // Create a temporary array to hold the last k elements
        int[] temp = new int[k];

        for (int i = n - k; i < n; i++) {
            //The last 2 elements {6, 7} are stored in the temporary array.
            temp[i - n + k] = arr[i];
        }

        // Step-2: Shift the first n-k elements to the right by k positions
        // Shift elements from index 0 to n-k-1 in the original array to the right by k positions
        for (int i = n - k - 1; i >= 0; i--) {
            //The first 5 elements are shifted right by 2 positions.
            arr[i + k] = arr[i];
        }

        // Step-3: Copy the elements from the temp array back into the main array
        // Copy the elements from the temporary array back to the beginning of the original array
        for (int i = 0; i < k; i++) {
            
            //The elements from the temporary array {6, 7} are copied back to the beginning of the array.
            arr[i] = temp[i];
        }

        // Print the array after rotating to the right
        System.out.println("After Rotating the elements to right(Brute Force): ");
        for (int i = 0; i < n; i++) {

            // The final rotated array is {6, 7, 1, 2, 3, 4, 5}.
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    } // RotateToRightBF

    //Approach 2: Using ” Reversal Algorithm “
    public static void RotateToRightOptimal(int[] arr, int n, int k) {
        // Reverse first n-k elements
        //The first 5 elements {1, 2, 3, 4, 5} are reversed to become {5, 4, 3, 2, 1}.
        Reverse(arr, 0, n - k - 1);

        // Reverse last k elements
        //The last 2 elements {6, 7} are reversed to become {7, 6}.
        Reverse(arr, n - k, n - 1);

        // Reverse whole array
        //The entire array {5, 4, 3, 2, 1, 7, 6} is reversed to become {6, 7, 1, 2, 3, 4, 5}.
        Reverse(arr, 0, n - 1);

        // Print the array after rotating to the right
        System.out.println("After Rotating the elements to right(Optimal): ");
        for (int i = 0; i < n; i++) {

            // The final rotated array is {6, 7, 1, 2, 3, 4, 5}.
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }//RotateToRightOptimal

    // Function to reverse a portion of the array
    public static void Reverse(int arr[], int start, int end) {
        // Continue swapping elements until start index is less than or equal to end index
        while (start <= end) {
            // Swap the elements at the start and end indices
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;//Move the start index forward
            end--;// Move the end index backward
        }
    } // Reverse

    // Main method to test the rotation
    public static void main(String[] args) {
        // Initialize the array and its size
        int n = 7;
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int arr2[] = {1, 2, 3, 4, 5, 6, 7};
        int k = 2;

        // Print the array before rotating to the right
        System.out.println("Before Rotating the elements to right: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //Approach-1: Rotate the array to the right by k elements
        RotateToRightBF(arr, n, k);

        //Approach-2: Rotate the array to the right by k elements
        RotateToRightOptimal(arr2, n, k);
    }//main
}

/*
Output:

Before Rotating the elements to right: 
1 2 3 4 5 6 7
After Rotating the elements to right: 
6 7 1 2 3 4 5
*/