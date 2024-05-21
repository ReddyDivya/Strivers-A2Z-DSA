import java.util.Scanner;

public class RecursiveInsertionSort {

    // Recursive method to perform insertion sort on the given array
    static void insertionSort(int[] arr, int i, int n) {
        // Base case: if the current index reaches the array length, return
        if (i == n)
            return;

        // Initialize the current index
        int j = i;

        // Shift elements of the sorted segment to the right to make space for the current element
        while (j > 0 && arr[j - 1] > arr[j]) {
            // Swap the elements if they are in the wrong order
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
        }

        // Recursively call insertionSort for the next element
        insertionSort(arr, i + 1, n);
    } // End of insertionSort

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        // Create an array to store the elements
        int[] arr = new int[n];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Print the unsorted array
        System.out.println("Before the Recursive Insertion Sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Call the insertionSort method to sort the array
        insertionSort(arr, 0, n); // arr, i, n

        // Print the sorted array
        System.out.println("After the Recursive Insertion Sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Close the scan ner to free up resources
        sc.close();
    }
}

/*
Output:

Enter the size of the array: 
6
Enter the elements of the array: 
13
46
24
52
20
9
Before the Recursive Insertion Sort: 
13 46 24 52 20 9
After the Recursive Insertion Sort:
9 13 20 24 46 52
*/