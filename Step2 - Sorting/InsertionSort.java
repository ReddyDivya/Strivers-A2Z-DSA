import java.util.*;

public class InsertionSort {

    // Method to perform insertion sort on the given array
    static void insertionSort(int arr[], int n) {
        //iterates over each element of the array starting from the second element (index 1) and going up to the last element (index n - 1).
        for (int i = 1; i < n; i++) {

            //For each iteration, the current element key is assigned the value of the element at the current index i. This is the element that needs to be placed at its correct position in the sorted sequence.
            int key = arr[i]; // Current element to be compared
            int j = i - 1;

            //iterates backwards (from j = i - 1 to 0) comparing key with each element before it (arr[j]).
            while (j >= 0 && arr[j] > key) {
                
                //If an element arr[j] is greater than key, it is shifted one position to the right (arr[j + 1] = arr[j]) to make space for key.
                arr[j + 1] = arr[j];
                j--;//process continues until either key is greater than or equal to arr[j], or j becomes negative.
            }

            //Once the correct position for key is found, it is inserted into the array at index j + 1.
            arr[j + 1] = key; 
        }

        // Print the sorted array
        System.out.println("After insertion sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array");
        int n = sc.nextInt();

        // Create an array to store elements
        int[] arr = new int[n];

        System.out.println("Enter the elements of an array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Print the unsorted array
        System.out.println("Before Insertion sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Call the insertion sort method to sort the array
        insertionSort(arr, n);
    }
}

/*
Output:

Enter the size of an array
8
Enter the elements of an array
4
9
15
12
6
8
13
90
Before Insertion sort:
4 9 15 12 6 8 13 90
After insertion sort:
4 6 8 9 12 13 15 90
*/