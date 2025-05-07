/*
4. Remove Duplicates in-place from Sorted Array

# Approach 1: Brute Force

Step1: Declare a HashSet.
Step2: Run a for loop from starting to the end.
Step3: Put every element of the array in the set.
Step4: Store size of the set in a variable K.
Step5: Now put all elements of the set in the array from the starting of the array.
Step6: Return K.
--------------------------------------------
# Approach 2: Optimal - Two pointers

Step1: Take a variable i as 0;
Step2: Use a for loop by using a variable ‘j’ from 1 to length of the array.
Step3: If arr[j] != arr[i], increase ‘i’ and update arr[i] == arr[j].
Step4: After completion of the loop return i+1, i.e size of the array of unique elements.
*/

import java.util.*;

public class RemoveDuplicates {

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

        // Brute Force: works without sorting
        System.out.println("Remove Duplicates (Brute): " + fnBruteApproach(arr, arr.length));
        
        // Sort array before calling the optimal approach
        Arrays.sort(arr); 
        System.out.println("Remove Duplicates (Optimal): " + fnOptimalApproach(arr, arr.length));
    }

    // Brute Force: Uses HashSet to remove duplicates
    static int fnBruteApproach(int[] arr, int n) {
        HashSet<Integer> set = new HashSet<>(); // HashSet stores only unique elements

        // Add each element to the set
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }

        return set.size(); // Size of set is the number of unique elements
    }

    // Optimal Approach: Works on sorted arrays only
    static int fnOptimalApproach(int[] arr, int n) {
        if (n == 0) return 0; // Handle empty array

        int i = 0; // Pointer to track unique elements

        // Compare each element with the previous unique one
        for (int j = 1; j < n; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }

        return i + 1; // Number of unique elements
    }
}

/*
Output:

Enter the number of elements:
5
Enter the elements:
44
3
2
11
3
Remove Duplicates (Brute): 4
Remove Duplicates (Optimal): 4
*/