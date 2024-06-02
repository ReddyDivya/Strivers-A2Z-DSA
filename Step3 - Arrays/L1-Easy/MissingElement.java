/*
Find the missing number in an array

Example 1:
Input Format: N = 5, array[] = {1,2,4,5}
Result: 3
Explanation: In the given array, number 3 is missing. So, 3 is the answer.

Example 2:
Input Format: N = 3, array[] = {1,3}
Result: 2
Explanation: In the given array, number 2 is missing. So, 2 is the answer.
---------------------------------------------------------------------------
# Approach 1: Brute-force approach
- Iterate over the numbers from 1 to N using a for loop.
- Inside the loop, initialize a flag variable to 0.
- Iterate over the elements of the array using another for loop.
- Check if the current number from the outer loop exists in the array. If found, set the flag to 1 and break the inner loop.
- After the inner loop, check if the flag is still 0. If yes, return the current number as it is missing in the array.

Time Complexity: O(n^2)
Space Complexity:O(1)
---------------------------------------------------------------------------
# Approach 2: Better approach

- Initialize: Create a hash array of size `n + 1` initialized to `zero`.
- Store Frequencies: Loop through the input array and record the presence of each element in the hash array.
- Check for Missing Element: Iterate through the hash array from 1 to n and find the index with a value of 0.
- Return the Missing Element: Return the index with a value of 0 as the missing number.

Time Complexity: O(n)
Space Complexity:O(n)
----------------------------------------------------------------------------
# Approach 3: Optimal 1:

- Calculate the summation of the first n natural numbers using the formula sum = n * (n + 1) / 2.
- Initialize a variable s2 to 0. Then, calculate the summation of all array elements by iterating through the array from index 0 to n-1 and adding each element to s2.
- Calculate the missing number by subtracting s2 (the sum of the array elements) from sum (the sum of the first n natural numbers)
- Return the calculated missing number.

Time Complexity: O(n)
Space Complexity: O(1)
----------------------------------------------------------------------------
# Approach 4: Optimal 2: XOR Approach

- Initialize two variables xor1 and xor2 to store XOR values.
- Loop through the array elements:
    ->Calculate the XOR of the array elements and store the result in xor2.
    ->Calculate the XOR of numbers from 1 to n-1 and store the result in xor1.
- Calculate the XOR of numbers from 1 to n by updating xor1.
- Return the missing number by XORing xor1 and xor2.

Time Complexity: O(n)
Space Complexity: O(1)
----------------------------------------------------------------------------
*/
public class MissingElement {
    //# Approach 1: Brute-force:
    public static int missingElementBF(int[] arr, int n) {
        // Loop through each number from 1 to n
        //TC: This loop runs 𝑛 times.
        for (int i = 1; i <= n; i++) {
            // flag variable to check if an element exists
            int flag = 0;//SC: O(1)

            // Loop through each element in the array
            //TC: This loop runs 𝑛-1 times since (arr.length = n-1).
            for (int j = 0; j < arr.length; j++) {
                // If the current number is found in the array, set flag to 1 and break the loop
                if (arr[j] == i) {
                    // i is present in the array
                    flag = 1;
                    break;
                }
            }

            // If the flag is still 0, it means the current number is missing, return it
            if (flag == 0)
                return i;
        }

        // The following line will never execute.
        // It is just to avoid warnings.
        return -1;

        //TC: (n) * (n-1) = O(n^2)
        //SC: O(1)
    }//missingElementBF

    //# Approach 2: Better:
    static int missingElementBetter(int[] arr, int n) {
        // Initialize a hash array of size n+1 to store the frequencies of elements.
        //TC: O(1); SC= O(n+1) => O(n)
        int hash[] = new int[n + 1];//hash = {0, 0, 0, 0, 0, 0}

        // Store the frequencies of elements from the input array.
        // Since the array is supposed to have numbers from 1 to n, we iterate until n-1.
        //TC: O(n-1), simplifies to O(n)
        for (int i = 0; i < n - 1; i++) {
            /*
                arr[0] = 1 -> hash[1]++;//hash = {0, 1, 0, 0, 0, 0}
                arr[1] = 2 -> hash[2]++;//hash = {0, 1, 1, 0, 0, 0}
                arr[2] = 4 -> hash[4]++;//hash = {0, 1, 1, 0, 1, 0}
                arr[3] = 5 -> hash[5]++;//hash = {0, 1, 1, 0, 1, 1}
            */
            hash[arr[i]]++;
        }

        // Check the frequencies for numbers 1 to n.
        // The number with a frequency of 0 is the missing number.
        //TC: O(n)
        for (int i = 1; i <= n; i++) {

            /*
                hash[1] = 1 (not missing)
                hash[2] = 1 (not missing)
                hash[3] = 0 (missing)
            Since hash[3] = 0, the missing number is 3.
            */
            if (hash[i] == 0) {
                return i;//return 3 as missing element
            }
        }

        // The following line will never execute as there will always be a missing number.
        // It is just to avoid compiler warnings about missing return statements.
        return -1;

        //TC = O(1) + O(n) + O(n) => O(n)
        //SC= O(n)
    } // End of missingElementBetter function

    //# Approach 3: Optimal 1:
    public static int missingElementOptimal1(int[] arr, int n) {
        // Step 1: Calculate the summation of first n natural numbers
        // Summation of first n natural numbers
        int sum = (n * (n+1) / 2); //TC:O(1); SC:O(1)

        // Step 2: Calculate the summation of all array elements
        //TC: O(n) due to loop; SC:O(1)
        int s2 = 0;
        for(int i=0; i<n-1; i++){
            s2 += arr[i];
        }

        // Step 3: Calculate the missing number by subtracting the summation of array elements from the summation of first n natural numbers
        int missingNum  = sum - s2;//TC: O(1); SC:O(1)

        // Step 4: Return the missing number
        return missingNum;//TC: O(n); SC:O(1)
    }//missingElementOptimal1

    //# Approach 4: Optimal 2: XOR Approach
    public static int missingElementOptimal2(int[] arr, int n) {
        // Step 1: Initialize variables to store XOR values
        int xor1 = 0, xor2 = 0;//TC:O(1); SC:O(1)

        // Step 2: Loop through array elements and calculate XOR
        for(int i = 0; i < n-1; i++){
            // Step 2.1: Calculate XOR of array elements
            xor2 = xor2 ^ arr[i];   //TC: O(n); SC:O(1)
            
            // Step 2.2: Calculate XOR up to [1...N-1]
            xor1 = xor1 ^ (i + 1);  //TC: O(n); SC:O(1)
        }

        // Step 3: Calculate XOR up to [1...N]
        xor1 = xor1 ^ n; //TC: O(1); SC:O(1)

        // Step 4: Return the missing number (XOR of XORs)
        return (xor1 ^ xor2);//TC: O(1); SC:O(1)
    }//missingElementOptimal2

    public static void main(String[] args) {
        int n = 5; // Length of the sequence
        int arr[] = {1, 2, 4, 5}; // Given array

        // Display initial array
        System.out.println("Given Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("n: "+n);

        // Find the missing number using the brute-force method
        int ansBF = missingElementBF(arr, n);
        System.out.println("The missing number is(Brute Force): " + ansBF);

        // Find the missing number using the Better method
        int ansBetter = missingElementBetter(arr, n);
        System.out.println("The missing number is(Better): " + ansBetter);

        // Find the missing number using the Optimal-1 method
        int ansOptimal1 = missingElementOptimal1(arr, n);
        System.out.println("The missing number is(Optimal-1): " + ansOptimal1);

        // Find the missing number using the Optimal-2 method
        int ansOptimal2 = missingElementOptimal2(arr, n);
        System.out.println("The missing number is(Optimal-2): " + ansOptimal2);
    }//main
}

/*
Output:

Given Array: 
1 2 4 5
n: 5
The missing number is(Brute Force): 3
The missing number is(Better): 3     
The missing number is(Optimal-1): 3  
The missing number is(Optimal-2): 3  
*/
