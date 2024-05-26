/*
1. Find the Smallest element in an array

# Approach 1: - Brute Force
Step1: Sort the array in ascending order.
Step2: Print the (size of the array -1)th index.

# Approach 2: - Recursive Approach(Using a max variable)
Step1: Create a min variable and initialize it with arr[0].
Step2: Use a for loop and compare it with other elements of the array
Step3: If any element is smaller than the min value, update min value with the element’s value
Step4: Print the min variable.
*/

/*
1. Find the Smallest element in an array

# Approach 1: - Brute Force
Step1: Sort the array in ascending order.
Step2: Print the (size of the array -1)th index.

# Approach 2: - Recursive Approach(Using a max variable)
Step1: Create a min variable and initialize it with arr[0].
Step2: Use a for loop and compare it with other elements of the array
Step3: If any element is smaller than the min value, update min value with the element’s value
Step4: Print the min variable.
*/

import java.util.*;

public class FindSmallestElement{
    static int findSmallestElementBF(int[] arr){
        
        // Check if the array is empty
        // if(arr.length == 0)
        //     return Integer.MIN_VALUE;//return a default value
        
        Arrays.sort(arr);

        // Return the smallest element which is the fist element after sorting
        return arr[0];
    }//findSmallestElementBF

    static int findSmallestElementOptimal(int[] arr){
        
        int min = arr[0];

        // Iterate through the array
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        // Return the smallest element found
        return min;
    }//findSmallestElementOptimal

    public static void main(String[] args){
        int arr[] =  {32,25,11,13};

        System.out.println("Given Array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();

        // Call the method to find the smallest element and print the result
        System.out.println("The smallest element in the array is(Brute Force): " + findSmallestElementBF(arr));

        // Call the method to find the smallest element and print the result
        System.out.println("The smallest element in the array is(Optimal): " + findSmallestElementOptimal(arr));
    }
}

/*
Output:

Given Array: 
32 25 11 13
The smallest element in the array is(Brute Force): 11
The smallest element in the array is(Optimal): 11
*/