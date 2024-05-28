
/*
8. Union of Two Sorted Arrays

Example 1:
Input:
n = 10, m = 7.
arr1[] = {1,2,3,4,5,6,7,8,9,10}
arr2[] = {2,3,4,4,5,11,12}
Output: {1,2,3,4,5,6,7,8,9,10,11,12}

# Approach 1: Using Map
Step1: Use a Single map to find the frequencies of elements in arr1 and arr2.
Step2: 

*/

import java.util.*;

public class UnionOfSortedArrays {

    // Approach 1: Brute Force - Using Map to find the union of two arrays
    static ArrayList<Integer> FindUnionBFS1(int[] arr1, int[] arr2, int arr1Len, int arr2Len) {
        
        // Initialize a HashMap to store the frequency of each element from both the arrays 
        HashMap<Integer, Integer> freq = new HashMap<>();
        
        // Initialize an ArrayList to store the union(unique) elements of the two arrays
        ArrayList<Integer> Union = new ArrayList<>();

        // Traverse the first array and update the frequency map
        for (int i = 0; i < arr1Len; i++) {
            /*
            
            -> arr1[i]: The key we are looking for in the map.
            -> 0: The default value to return if arr1[i] is not already a key in the map.
            -> If arr1[i] is a key in the map, freq.get(arr1[i]) returns its current count. If not, it returns 0.
            -> freq.getOrDefault(arr1[i], 0) + 1: The new value to associate with the key arr1[i].
            */
            freq.put(arr1[i], freq.getOrDefault(arr1[i], 0) + 1);
        }

        // Traverse the second array and update the frequency map
        for (int i = 0; i < arr2Len; i++) {
            /*
            -> arr2[i]: The key we are looking for in the map.
            -> 0: The default value to return if arr2[i] is not already a key in the map.
            -> If arr2[i] is a key in the map, freq.get(arr2[i]) returns its current count. If not, it returns 0.
            -> freq.getOrDefault(arr2[i], 0) + 1: The new value to associate with the key arr2[i].
            */
            freq.put(arr2[i], freq.getOrDefault(arr2[i], 0) + 1);
        }

        // Iterate over the keys of the HashMap and add them to the Union ArrayList
        for (int key : freq.keySet()) {
            Union.add(key);
        }

        // Return the Union ArrayList
        return Union;
    } // FindUnionBF

    // Approach 2: Brute Force - Using Sets
    // Method to find the union of two arrays using a HashSet
    static ArrayList<Integer> FindUnionBFS2(int[] arr1, int[] arr2, int arr1Len, int arr2Len) {
        HashSet<Integer> set = new HashSet<>(); // Initialize a HashSet to store unique elements
        ArrayList<Integer> Union = new ArrayList<>(); // Initialize an ArrayList to store the union result

        // Add all elements from arr1 to the set
        for (int i = 0; i < arr1Len; i++) {
            set.add(arr1[i]);
        }

        // Add all elements from arr2 to the set
        for (int i = 0; i < arr2Len; i++) {
            set.add(arr2[i]);
        }

        // Transfer all unique elements from the set to the Union ArrayList
        for (int key : set) {
            Union.add(key);
        }

        return Union; // Return the Union ArrayList
    } // FindUnionBFS2

    // Approach 3: Optimal - 2 Pointers
    // Method to find the union of two sorted arrays
    static ArrayList<Integer> FindUnionOptimal(int[] arr1, int[] arr2, int arr1Len, int arr2Len) {
        int i = 0, j = 0; // Initialize pointers for arr1 and arr2
        ArrayList<Integer> Union = new ArrayList<>(); // Initialize ArrayList to store the union

        // Loop until we reach the end of either arr1 or arr2
        while (i < arr1Len && j < arr2Len) {
            if (arr1[i] <= arr2[j]) { // If current element of arr1 is less than or equal to current element of arr2
                // Add arr1[i] to Union if it is not already the last added element
                if (Union.size() == 0 || Union.get(Union.size() - 1) != arr1[i]) {
                    Union.add(arr1[i]);
                }
                i++; // Move pointer i to the next element in arr1
            } else { // If current element of arr2 is less than current element of arr1
                // Add arr2[j] to Union if it is not already the last added element
                if (Union.size() == 0 || Union.get(Union.size() - 1) != arr2[j]) {
                    Union.add(arr2[j]);
                }
                j++; // Move pointer j to the next element in arr2
            }
        }

        // If any elements are left in arr1, add them to Union
        while (i < arr1Len) {
            if (Union.get(Union.size() - 1) != arr1[i]) {
                Union.add(arr1[i]);
            }
            i++;
        }

        // If any elements are left in arr2, add them to Union
        while (j < arr2Len) {
            if (Union.get(Union.size() - 1) != arr2[j]) {
                Union.add(arr2[j]);
            }
            j++;
        }

        // Return the ArrayList containing the union of the two arrays
        return Union;
    } // FindUnionOptimal

    public static void main(String[] args) {
        // Define the lengths of the two arrays
        int arr1Len = 10, arr2Len = 7;
        
        // Initialize the two arrays with given values
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {2, 3, 4, 4, 5, 11, 12};

        //Brute Force - Solution 1
        ArrayList<Integer> UnionArrS1 = FindUnionBFS1(arr1, arr2, arr1Len, arr2Len);

        // Print the result
        System.out.println("Union of Array 1 and Array 2 is (Brute Force - Solution 1):");
        for (int val : UnionArrS1) {
            System.out.print(val + " ");
        }
        System.out.println();

        //Brute Force - Solution 2
        ArrayList<Integer> UnionArrS2 = FindUnionBFS2(arr1, arr2, arr1Len, arr2Len);
        
        // Print the result
        System.out.println("Union of Array 1 and Array 2 is (Brute Force - Solution 2):");
        for (int val : UnionArrS2) {
            System.out.print(val + " ");
        }
        System.out.println();

        //Optimal
        ArrayList<Integer> UnionArrOptimal = FindUnionOptimal(arr1, arr2, arr1Len, arr2Len);
        
        // Print the result
        System.out.println("Union of Array 1 and Array 2 is (Optimal):");
        for (int val : UnionArrOptimal) {
            System.out.print(val + " ");
        }
        System.out.println();
    }//main
}

/*
Output:

Union of Array 1 and Array 2 is (Brute Force - Solution 1):
1 2 3 4 5 6 7 8 9 10 11 12 
Union of Array 1 and Array 2 is (Brute Force - Solution 2):
1 2 3 4 5 6 7 8 9 10 11 12
Union of Array 1 and Array 2 is (Optimal):
1 2 3 4 5 6 7 8 9 10 11 12
*/