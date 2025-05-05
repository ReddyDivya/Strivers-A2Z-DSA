/*
3. Check if an Array is Sorted

# Approach 1: Brute Force
Step1: If the array is empty or has only one element, return true.
Step2: Start with the first element. Compare this element with every other element that comes after it.
Step4: If you find the current element is larger than any of the later elements, return false(unsorted)
Step5: Move to the next element and repeat the comparison.
If you finish checking all elements without finding any violations, return true(sorted).

# Approach 2: Optimal - Efficient (Single traversal)
Step1: We will check every element with its previous element if the previous element is smaller than or equal to the current element then we will move to the next index.
Step2: If the whole array is traversed successfully or the size of the given array is zero or one (i.e N = 0 or N = 1). Then we will return True else return False.
*/
import java.util.*;

public class IsArryaSorted{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); // Creating Scanner object to take input

        System.out.println("Enter the number of elements:");
        int n = scn.nextInt(); // Reading the size of the array

        System.out.println("Enter the elements:");
        int[] arr = new int[n]; // Creating array of size n

        // Reading n elements from the user
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        // Calling the function to check if array is sorted and printing result
        System.out.println("Checking if array is sorted? : " + isSortedBruteForce(arr, n));

        // Calling the function to check if array is sorted and printing result
        System.out.println("Checking if array is sorted? : " + isSortedOptimal(arr, n));

        scn.close(); // Closing Scanner
    }

    // Optimal Approach:Function to check if the array is sorted in non-decreasing order
    static boolean isSortedBruteForce(int[] arr, int n) {
        System.out.println("Brute Force Approach:");
        for (int i = 1; i < n; i++) {
            for(int j=i+1; j < n; j++){
                if(arr[j] < arr[i]){
                    return false;
                }
            }
        }
        return true; // If loop completes, array is sorted
    } // isSortedBruteForce

    // Optimal Approach:Function to check if the array is sorted in non-decreasing order
    static boolean isSortedOptimal(int[] arr, int n) {
        System.out.println("Optimal Approach:");
        for (int i = 1; i < n; i++) {
            // If current element is smaller than previous, array is not sorted
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true; // If loop completes, array is sorted
    } // isSortedOptimal
}

/*
Output:

Given array: 
1 2 3 4 5
Is array sorted(Brute Force) : true
Is array sorted(Optimal) : true
--------------------------------
Given array: 
1 2 3 4 5 4 3
Is array sorted(Brute Force) : false
Is array sorted(Optimal) : false
*/