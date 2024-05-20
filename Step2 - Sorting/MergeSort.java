import java.util.*;

import java.util.ArrayList;
import java.util.Scanner;

public class MergeSort {
    
    // This method merges two sorted halves of the array into a single sorted array.
    private static void merge(int[] arr, int low, int mid, int high) {
        // Temporary array to store the merged elements
        ArrayList<Integer> temp = new ArrayList<>();
        
        // Starting index of the left half of the array
        int left = low;
        
        // Starting index of the right half of the array
        int right = mid + 1;

        // Merge the elements into the temporary array in sorted order
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        // If there are remaining elements in the left half, add them to the temp array
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        // If there are remaining elements in the right half, add them to the temp array
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // Transfer the sorted elements from the temporary array back to the original array
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    // This method recursively divides the array into halves and sorts them
    public static void mergesort(int[] arr, int low, int high) {
        // Base case: if the array has one or no elements, it is already sorted
        if (low >= high)
            return;
        
        // Find the middle point to divide the array into two halves
        int mid = (low + high) / 2;
        
        // Recursively sort the left half
        mergesort(arr, low, mid);
        
        // Recursively sort the right half
        mergesort(arr, mid + 1, high);
        
        // Merge the two sorted halves
        merge(arr, low, mid, high);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input the size of the array
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        // Create an array to store the elements
        int[] arr = new int[n];

        // Input the elements of the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Print the unsorted array
        System.out.println("Before Merge Sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Call the MergeSort method to sort the array
        mergesort(arr, 0, n - 1);

        // Print the sorted array
        System.out.println("After Merge Sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Close the scanner
        sc.close();
    }
}

/*
Output:
Enter the size of the array 
6
Enter the elements of the array 
21
3
4
89
45
32
Before Merge sort of an array: 
21 3 4 89 45 32
After the Merge sort of an array:
3 4 21 32 45 89
*/