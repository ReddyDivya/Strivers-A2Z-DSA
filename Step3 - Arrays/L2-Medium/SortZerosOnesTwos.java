
// Sort an array of 0s, 1s, and 2s
//Leetcode: 75
//https://leetcode.com/problems/sort-colors/description/

import java.util.*;

class SortZerosOnesTwos {
    // Optimal Approach to sort an array of 0s, 1s, and 2s
    public static void sortZerosOnesTwosOptimal(ArrayList<Integer> arr, int n) {
        int low = 0, mid = 0, high = n - 1; // Initialize pointers

        // Traverse the array from the beginning to the end
        while (mid <= high) {
            // case 1: arr[mid] == 0
            if (arr.get(mid) == 0) {
                // Swap arr[low] and arr[mid] to move 0s to the beginning
                int temp = arr.get(low);
                arr.set(low, arr.get(mid));
                arr.set(mid, temp);
                
                // Increment both low and mid pointers
                low++;
                mid++;
            }
            // case 2: arr[mid] == 1
            else if (arr.get(mid) == 1) {
                // 1 is already in the correct position, just move the mid pointer
                mid++;
            }
            // case 3: arr[mid] == 2
            else if (arr.get(mid) == 2) {
                // Swap arr[mid] and arr[high] to move 2s to the end
                int temp = arr.get(mid);
                arr.set(mid, arr.get(high));
                arr.set(high, temp);
                
                // Decrement the high pointer
                high--;
            }
        } // Loop ends when mid pointer crosses high pointer
    } // sortZerosOnesTwosOptimal

    public static void main(String[] args) {
        int n = 6; // Size of the array

        // Initialize the ArrayList with elements 2, 0, 2, 1, 1, 0
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[] {2, 0, 2, 1, 1, 0}));

        // Print the array before sorting
        System.out.print("Before the sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();

        // Call the sorting function
        sortZerosOnesTwosOptimal(arr, n);

        // Print the array after sorting
        System.out.print("After the sort (Optimal): ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }
} // SortZerosOnesTwos
