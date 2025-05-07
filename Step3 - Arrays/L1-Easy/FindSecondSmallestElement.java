/*
2. Find Second Smallest and Second Largest Element in an array


# Approach 1: - Brute Force
Step1: Sort the array in ascending order
Step2: The element present at the second index is the second smallest element
Step3: The element present at the second index from the end is the second largest element

# Approach 2: - Better
Step1: Find the smallest element in the array in a single traversal
Step2: We once again traverse the array and find an element that is just greater than the smallest element we just found.

# Approach 3: - Recursive Approach(Using a max variable)
Step1: If the current element is smaller than ‘small’, then we update second_small and small variables
Step2: Else if the current element is smaller than ‘second_small’ then we update the variable ‘second_small’
Step3: Once we traverse the entire array, we would find the second smallest element in the variable second_small.
*/
import java.util.*;

public class FindSecondSmallestElement {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); // Create Scanner object to read input
        int n = 0;
        int[] arr = null;

        try {
            System.out.println("Enter the number of elements:");
            n = scn.nextInt(); // Read the size of the array

            // If the array has fewer than 2 elements, we cannot find a second smallest
            if (n < 2) {
                System.out.println("There is no second smallest element in the array.");
                return;
            }

            // Initialize array and read user input
            arr = new int[n];
            System.out.println("Enter the elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = scn.nextInt(); // Read each element into the array
            }

        } catch (InputMismatchException e) {
            // Handle non-integer input
            System.out.println("Error: Invalid input. Please enter integers only.");
            return; // Exit program after catching input error
        } finally {
            scn.close(); // Always close Scanner to avoid memory leaks
        }

        // Call all three approaches
        fnBruteForce(arr, n);
        fnBetter(arr, n);
        fnOptimal(arr, n);
    }

    // Approach 1: Brute Force
    // Sort the array and pick the first element that is greater than the smallest
    // Time Complexity: O(n log n)
    // Space Complexity: O(n) due to array copy
    static void fnBruteForce(int[] arr, int n) {
        int[] sorted = Arrays.copyOf(arr, n); // Create a copy to avoid modifying the original array
        Arrays.sort(sorted); // Sort the copied array

        int smallest = sorted[0]; // Get the smallest element

        // Traverse the sorted array to find the first element greater than the smallest
        for (int i = 1; i < n; i++) {
            if (sorted[i] != smallest) {
                System.out.println("Brute Force: " + sorted[i]);
                return;
            }
        }

        // All elements are the same
        System.out.println("Brute Force: No second smallest element.");
    }

    // Approach 2: Better (Two-pass linear search)
    // First find the smallest, then find the smallest element greater than it
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    static void fnBetter(int[] arr, int n) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        // Pass 1: Find the smallest element
        for (int i = 0; i < n; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        // Pass 2: Find the smallest element greater than the smallest
        for (int i = 0; i < n; i++) {
            if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }

        // If second smallest wasn't updated, it means no valid second smallest
        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("Better: No second smallest element.");
        } else {
            System.out.println("Better: " + secondSmallest);
        }
    }

    // Approach 3: Optimal (Single pass)
    // Track both smallest and second smallest in a single loop
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    static void fnOptimal(int[] arr, int n) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        // Traverse array only once and update smallest and second smallest accordingly
        for (int i = 0; i < n; i++) {
            if (arr[i] < smallest) {
                // New smallest found, update both smallest and second smallest
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                // Update second smallest if current is greater than smallest and smaller than second smallest
                secondSmallest = arr[i];
            }
        }

        // Check if a valid second smallest element was found
        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("Optimal: No second smallest element.");
        } else {
            System.out.println("Optimal: " + secondSmallest);
        }
    }
}

/*
Output:
Enter the number of elements:
6
Enter the elements:
55
44
33
21
1
445
Brute Force: 21
Better: 21
Optimal: 21
*/