/*
1. Two Sum: Check if a pair with given sum exists in Array

Example 1:
Input Format: N = 5, arr[] = {2,6,5,8,11}, target = 14
Result: YES (for 1st variant)
       [1, 3] (for 2nd variant)
Explanation: arr[1] + arr[3] = 14. So, the answer is “YES” for the first variant and [1, 3] for the 2nd variant.
*/

import java.util.*;

public class TwoSum {
    // Approach 1: Brute Force (variant 1)
    static String twoSumBFV1(int[] arr, int n, int target) {
        // Step 1: Iterate through each element in the array
        for (int i = 0; i < n; i++) {
            // Step 2: For each element, iterate through the remaining elements to find a pair
            for (int j = i + 1; j < n; j++) {
                // Step 3: Check if the sum of the pair equals the target
                if (arr[i] + arr[j] == target)
                    // Step 4: If found, return "YES"
                    return "YES";
            }
        }
        // Step 5: If no pair is found, return "NO"
        return "NO";
    } // twoSumBFV1

    // Approach 1: Brute Force (variant 2)
    static int[] twoSumBFV2(int[] arr, int n, int target) {
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;

        // Step 1: Iterate through each element in the array
        for (int i = 0; i < n; i++) {
            // Step 2: For each element, iterate through the remaining elements to find a pair
            for (int j = i + 1; j < n; j++) {
                // Step 3: Check if the sum of the pair equals the target
                if (arr[i] + arr[j] == target) {
                    // Step 4: If found, store the indices of the pair
                    ans[0] = i;
                    ans[1] = j;
                    // Step 5: Return the indices
                    return ans;
                }
            }
        }
        // Step 6: If no pair is found, return [-1, -1]
        return ans;
    } // twoSumBFV2

    // Approach 2: Better using Hashing (variant 1)
    public static String twoSumBetterV1(int[] arr, int n, int target){
        HashMap<Integer, Integer> hMap = new HashMap<>();
        for(int i=0; i<n; i++){
            int num = arr[i];
            int elem = target - num;
            if(hMap.containsKey(elem))
            {
                return "YES";
            }

            hMap.put(arr[i], i);//element, key
        }

        return "NO";
    }//twoSumBetterV1

    // Approach 2: Better using Hashing (variant 2)
    public static int[] twoSumBetterV2(int[] arr, int n, int target){
        HashMap<Integer, Integer> hMap = new HashMap<>();
        
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;

        for(int i=0; i<n; i++){
            int num = arr[i];
            int element = target - num;

            if(hMap.containsKey(element)){
                ans[0] = hMap.get(element);
                ans[1] = i;
            }

            hMap.put(arr[i], i);
        }

        return ans;
    }//twoSumBetterV2

    // Approach 3: Optimal using 2 Pointers (variant 1)
    public static String twoSumOptimalV1(int[] arr, int n, int target) {
        Arrays.sort(arr); // Sorting the given array
        int left = 0, right = n - 1;

        while (left < right) { // left pointer shouldn't exceed the right pointer
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return "YES";
            } else if (sum < target) { // if sum is less than target, then increment left pointer
                left++;
            } else { // if sum is greater than target, then decrement right pointer
                right--;
            }
        }

        return "NO";
    } // twoSumOptimalV1

    // Approach 3: Optimal using 2 Pointers (variant 2)
    public static int[] twoSumOptimalV2(int[] arr, int n, int target){
        int left = 0, right = n-1;
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        Arrays.sort(arr);//sorting the given array

        while(left < right)//left pointer shouldn't exceed the right pointer
        {
            int sum = arr[left] + arr[right];
            if(sum == target)
            {   
                ans[0] = arr[left];
                ans[1] = arr[right];
                return ans;
            }
            else if(sum < target)//if sum is less than target, then increment left pointer
                left++;
            else if(sum > right)
                right--;//if sum is greater than target, then decrement right pointer
        }

        return ans;
    }//twoSumOptimalV2

    public static void main(String[] args) {
        int n = 5;
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        
        // Step 1: Call the function for the first variant and store the result
        String ansBFV1 = twoSumBFV1(arr, n, target); // Expected: "YES"
        System.out.println("This is the answer for variant 1 (Brute Force): " + ansBFV1);

        // Step 3: Call the function for the second variant and store the result
        int[] ansBFV2 = twoSumBFV2(arr, n, target); // Expected: [1, 3]
        System.out.println("This is the answer for variant 2 (Brute Force): [" + ansBFV2[0] + ", " + ansBFV2[1] + "]");

        //Better Approach using HashMap
        String ansBetterV1 = twoSumBetterV1(arr, n, target); // Expected: [1, 3]
        System.out.println("This is the answer for variant 1 (Better): " + ansBetterV1);

        int[] ansBetterV2 = twoSumBFV2(arr, n, target); // Expected: [1, 3]
        System.out.println("This is the answer for variant 2 (Better): [" + ansBetterV2[0] + ", " + ansBetterV2[1] + "]");

        //Optimal Approach using 2 pointer (variant 1)
        String ansOptimalV1 = twoSumOptimalV1(arr, n, target); // Expected: "YES"
        System.out.println("This is the answer for variant 1 (Optimal): " + ansOptimalV1);

        //Optimal Approach using 2 pointer (variant 2)
        int[] ansOptimalV2 = twoSumOptimalV2(arr, n, target); // Expected: [6, 8]
        System.out.println("This is the answer for variant 2 (Optimal): [" + ansOptimalV2[0] + ", " + ansOptimalV2[1] + "]");
    }
}

/*
Output:

This is the answer for variant 1 (Brute Force): YES
This is the answer for variant 2 (Brute Force): [1, 3]
This is the answer for variant 1 (Better): YES        
This is the answer for variant 2 (Better): [1, 3]     
This is the answer for variant 1 (Optimal): YES       
This is the answer for variant 2 (Optimal): [6, 8]
*/
