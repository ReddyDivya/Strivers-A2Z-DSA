import java.util.*;

public class FindLongestSubArray{

    //# Approach 1: Brute Force Approach:
    static int findLongestSubArrayBF(int[] arr, int n, int K) {
        // Step 1: Initialize the variable 'len' to store the length of the longest subarray
        int len = 0;

        // Step 2: Iterate over all possible starting points of subarrays
        for(int i = 0; i < n; i++) {
            // Step 3: Iterate over all possible ending points of subarrays starting from index 'i'
            for(int j = i; j < n; j++) {
                // Step 4: Initialize 'sum' to store the sum of the current subarray
                long sum = 0;

                // Step 5: Calculate the sum of the subarray from index 'i' to 'j'
                for(int s = i; s <= j; s++) {
                    sum += arr[s];
                }

                // Step 6: Check if the sum of the current subarray is equal to 'K'
                if(sum == K) {
                    // Step 7: Update 'len' if the current subarray length is greater than the previous maximum length
                    len = Math.max(len, j - i + 1);
                }
            }
        }

        // Step 8: Return the length of the longest subarray with sum equal to 'K'
        return len;
    }// findLongestSubArrayBF

    // Approach 2: Optimizing the Brute Force Approach (Using two loops)
    static int findLongestSubArrayBF2(int[] arr, int n, int K) {
        // Step 1: Initialize variable 'len' to store the length of the longest subarray
        int len = 0;

        // Step 2: Iterate over all possible starting points of subarrays
        for(int i = 0; i < n; i++) { // O(n)
            // Step 3: Initialize 'sum' to store the sum of the current subarray
            long sum = 0;

            // Step 4: Iterate over all possible ending points of subarrays starting from index 'i'
            for(int j = i; j < n; j++) { // O(n)
                // Step 5: Add the current element to 'sum'
                sum += arr[j];

                // Step 6: Check if the sum of the current subarray is equal to 'K'
                if(sum == K) {
                    // Step 7: Update 'len' if the current subarray length is greater than the previous maximum length
                    len = Math.max(len, j - i + 1);
                }
            }
        }

        // Step 8: Return the length of the longest subarray with sum equal to 'K'
        return len;

        // Overall time complexity: O(n^2)
        // Overall space complexity: O(1)
    }// findLongestSubArrayBF2

    // Approach 3: Better using Hashing
    static int findLongestSubArrayBetter(int[] arr, int n, int K) {
        // Step 1: Initialize a hashmap to store prefix sums and their corresponding indices
        HashMap<Long, Integer> preSumMap = new HashMap<>();

        // Step 2: Initialize sum to store the current prefix sum and maxLen to store the length of the longest subarray
        long sum = 0;
        int maxLen = 0;

        // Step 3: Iterate over all elements of the array
        for(int i = 0; i < n; i++) { // O(n)
            // Step 4: Calculate the prefix sum till index i
            sum += arr[i];

            // Step 5: If the prefix sum is equal to K, update maxLen
            if(sum == K) {
                maxLen = Math.max(maxLen, i + 1);
            }

            // Step 6: Calculate the remaining sum needed to form K
            long rem = sum - K;

            // Step 7: Check if the remaining sum exists in the hashmap
            if(preSumMap.containsKey(rem)) {
                // Step 8: Calculate the length of the subarray and update maxLen
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            // Step 9: Update the hashmap with the current prefix sum and its index if it doesn't already exist
            if(!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }

        // Step 10: Return the length of the longest subarray with sum equal to K
        return maxLen;

        // Overall time complexity: O(n)
        // Overall space complexity: O(n)
    } // findLongestSubArrayBetter

    // Approach 4: Better using Two Pointers
    static int findLongestSubArrayOptimal(int[] arr, int n, int K) {
        // Step 1: Initialize variables
        int maxLen = 0; // to store the maximum length of subarray
        int left = 0, right = 0; // two pointers for the sliding window
        long sum = arr[0]; // initialize sum with the first element
        // Space Complexity: O(1) for these variables

        // Step 2: Traverse the array with the right pointer
        // Time Complexity: O(n)
        while (right < n) {
            // Step 3: Reduce sum from the left if it exceeds K
            // Time Complexity: O(n) in the worst case (when reducing multiple times)
            while (left <= right && sum > K) {
                sum -= arr[left]; // reduce sum by the left element
                left++; // move the left pointer to the right
            }

            // Step 4: If sum equals K, update maxLen
            // Time Complexity: O(1)
            if (sum == K) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            // Step 5: Move the right pointer forward
            right++; // increment the right pointer
            // Time Complexity: O(1)
            if (right < n) {
                sum += arr[right]; // add the new element to the sum
                // Time Complexity: O(1)
            }
        }

        // Step 6: Return the length of the longest subarray
        // Time Complexity: O(1)
        return maxLen;
    }//findLongestSubArrayOptimal

    public static void main(String[] args){
        int[] arr = {2, 3, 5, 1, 9};
        int K=10;
        int lenBF = findLongestSubArrayBF(arr, arr.length, K);
        System.out.println("The Longest Subarray(Brute Force): "+ lenBF);//3

        int lenBF2 = findLongestSubArrayBF2(arr, arr.length, K);
        System.out.println("The Longest Subarray(Brute Force 2): "+ lenBF2);//3

        int lenBetter = findLongestSubArrayBetter(arr, arr.length, K);
        System.out.println("The Longest Subarray(Better): "+ lenBetter);//3

        int lenOptimal = findLongestSubArrayOptimal(arr, arr.length, K);
        System.out.println("The Longest Subarray(Optimal): "+ lenOptimal);//3
    }
}