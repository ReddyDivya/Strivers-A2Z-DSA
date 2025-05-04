/*
2. Find Second Largest Element in an array


# Approach 1: - Brute Force
Step1: Sort the array in ascending order
Step2: The element present at the second index is the second smallest element
Step3: The element present at the second index from the end is the second largest element

# Approach 2: - Better approach
Step1: Find the largest element in the array in a single traversal
Step2: We once again traverse the array and find an element that is just greater than the smallest element we just found.
Step3: We would find the largest element which is just smaller than the largest element we just found

# Approach 3: - Recursive Approach(Using a max variable)
Step1: If the current element is larger than ‘large’ then update second_large and large variables
Step2: Else if the current element is larger than ‘second_large’ then we update the variable second_large.
Step3: Once we traverse the entire array, we would find the second largest element in the variable second_large.
*/
import java.util.*;

public class FindSecondLargestElement{

    public static void main(String[] args) {
        // Initialize the array
        int[] arr = {1, 2, 4, 6, 7, 7, 5};

        // Brute force approach using sorting
        fnBruteApproach(arr, arr.length);

        // Better approach using two passes (find max and then second max)
        fnBetterApproach(arr, arr.length);

        // Optimal approach using single pass
        fnOptimalApproach(arr, arr.length);
    }

    // Brute force: sort array, then find the first smaller element than the largest
    static private void fnBruteApproach(int[] arr, int n) {
        System.out.println("Brute force approach: ");
        Arrays.sort(arr); // Sort the array
        int largest = arr[n - 1]; // Last element is the largest
        int secondLargest = -1;

        // Traverse from second last to start to find second largest
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < largest) {
                secondLargest = arr[i];
                break;
            }
        }

        System.out.println("Second Largest Element is " + secondLargest);
    }

    // Better approach: first find largest, then find the largest value less than it
    static private void fnBetterApproach(int[] arr, int n) {
        System.out.println("Better approach: ");
        int largest = arr[0];
        int secondLargest = -1;

        // First pass: find the largest element
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest)
                largest = arr[i];
        }

        // Second pass: find the second largest element
        for (int i = 0; i < n; i++) {
            if (arr[i] != largest && arr[i] > secondLargest)
                secondLargest = arr[i];
        }

        System.out.println("Second Largest Element is " + secondLargest);
    }

    // Optimal approach: find largest and second largest in one loop
    static private void fnOptimalApproach(int[] arr, int n) {
        System.out.println("Optimal approach: ");
        int largest = arr[0];
        int secondLargest = -1;

        // One loop to find both largest and second largest
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] != largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Second Largest Element is " + secondLargest);
    }
}


/*
Output:

Brute force approach: 
Second Largest Element is 6
Better approach: 
Second Largest Element is 6
Better approach: 
Second Largest Element is 6
*/