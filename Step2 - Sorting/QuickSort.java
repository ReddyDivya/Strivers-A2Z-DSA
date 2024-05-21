import java.util.*;

public class QuickSort {
    // Partition function to divide the array into two parts
    static int partition(List<Integer> arr, int low, int high) {
        // Select the pivot element (first element in this case)
        int pivot = arr.get(low);
        
        // Initialize pointers i and j
        int i = low;
        int j = high;

        // Continue until i and j meet
        while (i < j) {
            // Move i to the right until arr[i] > pivot
            while (arr.get(i) <= pivot && i <= high - 1) {
                i++;
            }

            // Move j to the left until arr[j] < pivot
            while (arr.get(j) >= pivot && j >= low + 1) {
                j--;
            }

            // Swap arr[i] and arr[j] if i < j
            if (i < j) {
                int temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }

        // Swap pivot with arr[j] to place pivot in its correct position
        int temp = arr.get(low);
        arr.set(low, arr.get(j));
        arr.set(j, temp);

        // Return the partition index
        return j;
    }//partition


    // QuickSort function to recursively sort the array
    static void qs(List<Integer> arr, int low, int high) {
        // Check if the low index is less than the high index to ensure there are elements to sort
        if (low < high) {
            // Find the partition index
            int pIndex = partition(arr, low, high);
            // Recursively call qs on the left and right partitions
            qs(arr, low, pIndex - 1);  // Sort elements to the left of partition
            qs(arr, pIndex + 1, high); // Sort elements to the right of partition
        }
    }

    // Public method to initiate the QuickSort algorithm
    public static List<Integer> quickSort(List<Integer> arr) {
        // Call the qs method to perform QuickSort on the array
        qs(arr, 0, arr.size() - 1);
        // Return the sorted array
        return arr;
    }

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        // Creating an ArrayList to store integers
        List<Integer> arr = new ArrayList<>(n);

        // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        // Printing the array before sorting
        System.out.println("Before Using Quick Sort: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }

        // Adding a new line after printing the array
        System.out.println();

        // Sorting the array using the QuickSort algorithm
        QuickSort.quickSort(arr);

        // Printing the array after sorting
        System.out.println("After Using Quick Sort: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }

        // Adding a new line after printing the sorted array
        System.out.println();
    }//main
}

/*
Output:

Enter the size of the array: 
7
Enter the elements of the array: 
89
2
44
5
6
1
99
Before Using Quick Sort: 
89 2 44 5 6 1 99
After Using Quick Sort:
1 2 5 6 44 89 99
*/