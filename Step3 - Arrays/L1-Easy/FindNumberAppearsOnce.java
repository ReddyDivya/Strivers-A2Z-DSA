/*
Find the number that appears once, and the other numbers twice

Example 1:
Input Format: arr[] = {2,2,1}
Result: 1
Explanation: In this array, only the element 1 appear once and so it is the answer.

Example 2:
Input Format: arr[] = {4,1,2,1,2}
Result: 4
Explanation: In this array, only element 4 appear once and the other elements appear twice. So, 4 is the answer.
*/

import java.util.*;

public class FindNumberAppearsOnce{
    //# Approach 1: Brute Force
    static int findNumberAppearsOnceBF(int[] arr, int n) {
        // Iterate through each element in the array
        for (int i = 0; i < n; i++) {
            int num = arr[i]; // Get the current number
            int count = 0;    // Initialize a counter for occurrences of num

            // Count how many times num appears in the array
            for (int j = 0; j < n; j++) {
                if (num == arr[j]) {
                    count++;
                }
            }

            // If num appears exactly once, return it
            if (count == 1) {
                return num;
            }
        }

        // If no such element is found, return -1
        return -1;
    } // end of findNumberAppearsOnceBF

    //# Approach 2: Better using Hashing
    static int findNumberAppearsOnceBetterHashing(int[] arr, int n) {
        // Step 1: Find the maximum element in the array
        int maximum = arr[0];
        for (int i = 0; i < n; i++) {
            maximum = Math.max(maximum, arr[i]);
        }

        // Step 2: Declare a hash array of size maximum + 1
        // Step 3: Hash the given array
        int[] hash = new int[maximum + 1];
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }

        // Step 4: Find the single element and return the answer
        for (int i = 0; i < n; i++) {
            if (hash[arr[i]] == 1)
                return arr[i];
        }

        // This line will never execute if the array contains a single element.
        return -1;
    }//findNumberAppearsOnceBetterHashing

    //# Approach 3: Better using Map
    static int findNumberAppearsOnceBetterMap(int[] arr, int n) {
        // Step 1: Declare the hashmap and hash the given array
        HashMap<Integer, Integer> hMap = new HashMap<>();

        // Step 2: Iterate through the array and update the hashmap
        for (int i = 0; i < n; i++) {
            int value = hMap.getOrDefault(arr[i], 0);
            hMap.put(arr[i], value + 1);
        }

        // Step 3: Find the single element and return the answer
        for (Map.Entry<Integer, Integer> it : hMap.entrySet()) {
            if (it.getValue() == 1)
                return it.getKey();
        }

        // This line will never execute if the array contains a single element.
        return -1;
    }//findNumberAppearsOnceBetterMap

    //# Approach 4: Optimal using XOR
    static int findNumberAppearsOnceOptimal(int[] arr, int n) {
        // Step 1: Initialize xorResult to 0
        int xorResult = 0;

        // Step 2: Perform XOR operation on all elements of the array
        for (int i = 0; i < n; i++) {
            xorResult = xorResult ^ arr[i];
        }

        // Step 3: Return the result
        return xorResult;
    }//findNumberAppearsOnceOptimal

    public static void main(String[] args){
        int[] arr = {4, 1, 2, 1, 2};
        System.out.println("Given Array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        int ansBF = findNumberAppearsOnceBF(arr, arr.length);
        System.out.println("The single element is(Brute Force): " + ansBF);

        int ansBetterHash = findNumberAppearsOnceBetterHashing(arr, arr.length);
        System.out.println("The single element is(Better using Hash): " + ansBetterHash);

        int ansBetterMap = findNumberAppearsOnceBetterHashing(arr, arr.length);
        System.out.println("The single element is(Better using Map): " + ansBetterMap);

        int ansOptimal = findNumberAppearsOnceBetterHashing(arr, arr.length);
        System.out.println("The single element is(Optimal using XOR): " + ansOptimal);
    }
}

/*
Output:

Given Array: 
4 1 2 1 2
The single element is(Brute Force): 4      
The single element is(Better using Hash): 4
The single element is(Better using Map): 4 
The single element is(Optimal using XOR): 4
*/