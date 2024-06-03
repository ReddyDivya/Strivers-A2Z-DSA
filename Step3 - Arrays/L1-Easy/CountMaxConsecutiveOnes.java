/*
Count Maximum Consecutive One's in the array

Example 1:
Input: prices = {1, 1, 0, 1, 1, 1}
Output: 3
Explanation: There are two consecutive 1’s and three consecutive 1’s in the array out of which maximum is 3.

Example 2:
Input: prices = {1, 0, 1, 1, 0, 1} 
Output: 2
Explanation: There are two consecutive 1's in the array. 

*/
public class CountMaxConsecutiveOnes{
    static int findMaxConsecutiveOnes(int[] arr) {
        // Step 1: Initialize variables
        int count = 0; // Count to keep track of the current sequence of 1's
        int max = 0;   // Max to store the maximum length of consecutive 1's found

        // Step 2: Loop through each element in the array
        for (int i = 0; i < arr.length; i++) {
            // Check if the current element is 1
            if (arr[i] == 1) {
                count++; // Increment count if element is 1
            } else {
                count = 0; // Reset count to 0 if element is not 1
            }

            // Update max with the maximum value between max and count
            max = Math.max(max, count);
        }

        // Step 3: Return the maximum length of consecutive 1's found
        return max;
    }//findMaxConsecutiveOnes

    public static void main(String[] args){
        int[] nums = { 1, 1, 0, 1, 1, 1 };
        int ans = findMaxConsecutiveOnes(nums);
        System.out.println("The maximum  consecutive 1's are " + ans);
    }
}