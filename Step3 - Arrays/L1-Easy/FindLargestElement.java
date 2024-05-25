/*
1. Find the Largest element in an array

# Approach 1: - Brute Force
Step1: Sort the array in ascending order.
Step2: Print the (size of the array -1)th index.

# Approach 2: - Recursive Approach(Using a max variable)
Step1: Create a max variable and initialize it with arr[0].
Step2: Use a for loop and compare it with other elements of the array
Step3: If any element is greater than the max value, update max value with the element’s value
Step4: Print the max variable.
*/
import java.util.*;

public class FindLargestElement{

    //Approach 1: Brute Force
    static int findLargestElementBF(int[] arr){

        // Check if the array is empty
        if(arr.length == 0)
            return Integer.MIN_VALUE;//return a default value
        
        Arrays.sort(arr);

      // Return the largest element which is the last element after sorting
        return arr[arr.length - 1];
    }//findLargestElementBF

    //Optimal Approach 2: - Recursive Approach(Using a max variable)
    static int findLargestElementOptimal(int[] arr){
        
        // Initialize max to the first element of the array
        int max = arr[0];

        // Iterate through the array
        for(int i = 0; i < arr.length; i++){
            // If the current element is greater than max, update max
            if(arr[i] > max){
                max = arr[i];
            }
        }

        // Return the largest element found
        return max;
    }//findLargestElementOptimal

    public static void main(String[] args){
        int arr[] =  {2,5,1,3,0};
        
        //Before the largest element in the array
        System.out.println("Before the largest element in the array: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

        System.out.println("The Largest element in the array is(Brute Force): " + findLargestElementBF(arr));
    
        System.out.println("The Largest element in the array is(Optimal): " + findLargestElementOptimal(arr));
    }
}

/*
Output:

Before the largest element in the array: 
2 5 1 3 0
The Largest element in the array is(Brute Force): 5
The Largest element in the array is(Optimal): 5 
*/