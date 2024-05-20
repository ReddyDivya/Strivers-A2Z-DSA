import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        // Create an array to store elements
        int[] arr = new int[n];

        // Input elements into the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Print the unsorted array
        System.out.println("Before Bubble sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Call the Bubble sort method to sort the array
        BubbleSort(arr, n);
    }

    // Method to perform Bubble sort on the given array
    static void BubbleSort(int arr[], int n) {
        /*
        Iterate through the array from last index to the first. 
        Each pass bubbles up the largest element to its correct position at the end of the array.
        */
        for (int i = n - 1; i >= 0; i--) {

            // If no swap occurs, array is already sorted, so exit loop
            int didSwap = 0;
 
            /*
            - Compare adjacent elements and swap if necessary
            - iterates from index 0 to i - 1. This loop compares adjacent elements and swaps them if they are in the wrong order (if arr[j] is greater than arr[j + 1]).
            */
            for (int j = 0; j < i; j++) {

                // if this condition is true, it means that the elements are out of order, so they need to be swapped
                if (arr[j] > arr[j + 1])
                {
                    // Swap the elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    //indicate that at least one swap has occurred during the pass.
                    didSwap = 1;
                }
            }

            // If no swap occurred, the array is already sorted
            if (didSwap == 0) {
                break;
            }
        } // End of outer loop

        // Print the sorted array
        System.out.println("After Bubble sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}


/*
Output

Enter the size of the array: 6
Enter the elements of the array:
13
24
56
1
3
4
Before Bubble sort:
13 24 56 1 3 4     
After Bubble sort:
1 3 4 13 24 56
*/