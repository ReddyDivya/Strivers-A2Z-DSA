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

        // Print the sorted array
        System.out.println("Before Selection sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Call the selection sort method to sort the array
        SelectionSort(arr, n);
    }

    // Method to perform selection sort on the given array
    static void SelectionSort(int arr[], int n) {
        // Iterate through the array
        for (int i = 0; i < n - 1; i++) {
            // Assume the current element is the minimum
            int min = i;

            // Find the index of the minimum element in the unsorted part of the array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            // Swap the found minimum element with the first element of the unsorted part
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }//for

        // Print the sorted array
        System.out.println("After Selection sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

/*
Output:

Enter the size of the array: 6
Enter the elements of the array:
13
46
52
20
24
9
After Selection sort:
9 13 20 24 46 52
*/