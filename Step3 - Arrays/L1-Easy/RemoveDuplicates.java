/*
# Approach 1: Brute Force

Step1: Declare a HashSet.
Step2: Run a for loop from starting to the end.
Step3: Put every element of the array in the set.
Step4: Store size of the set in a variable K.
Step5: Now put all elements of the set in the array from the starting of the array.
Step6: Return K.


# Approach 2: Optimal - Two pointers

Step1: Take a variable i as 0;
Step2: Use a for loop by using a variable ‘j’ from 1 to length of the array.
Step3: If arr[j] != arr[i], increase ‘i’ and update arr[i] == arr[j].
Step4: After completion of the loop return i+1, i.e size of the array of unique elements.
*/

import java.util.*;

public class RemoveDuplicates {

    // Approach 1: Brute Force
    static void removeDuplicatesBF(int[] arr) {
        // Create a HashSet to store unique elements
        HashSet<Integer> set = new HashSet<>();
        
        // Create a list to store unique elements in order
        List<Integer> uniqueList = new ArrayList<>();

        // Add elements to the set to remove duplicates
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        // Add unique elements from the set to the list in order
        for (int x : set) {
            uniqueList.add(x);
        }

        // Copy unique elements from the list back to the original array
        for (int i = 0; i < uniqueList.size(); i++) {
            arr[i] = uniqueList.get(i);
        }

        System.out.println("The array after removing duplicate elements is (Brute Force):");
        for (int i = 0; i < uniqueList.size(); i++) {
            System.out.print(arr[i] + " ");
        }
    }// removeDuplicatesBF


    // Approach 2: Optimal
    static void removeDuplicatesOptimal(int[] arr) {
        // Sort the array to ensure duplicates are adjacent.
        Arrays.sort(arr);

        // Check if the array is empty or has only one element
        if (arr.length == 0) return;

        // Initialize a pointer i to keep track of the unique elements' position.
        int i = 0;

        // Iterate through the array starting from the second element.
        for (int j = 1; j < arr.length; j++) {
            // If the current element is different from the last unique element,
            // it means it's a new unique element.
            if (arr[i] != arr[j]) {
                i++; // Move the pointer i to the next position.
                // Update the next position with the current element.
                arr[i] = arr[j];
            }
        }

        // Print the array after removing duplicate elements.
        System.out.println("\nThe array after removing the duplicate elements (Optimal): ");
        for (int k = 0; k <= i; k++) {
            System.out.print(arr[k] + " ");
        }

        System.out.println();
    }//removeDuplicatesOptimal

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 2, 3, 3};

        System.out.println("Given Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        removeDuplicatesBF(arr);// brute force
        removeDuplicatesOptimal(arr);// optimal
    }
}

/*
Output:

Given Array: 
1 1 2 2 2 3 3
The array after removing duplicate elements is (Brute Force):
1 2 3
The array after removing the duplicate elements (Optimal):   
1 2 3
*/