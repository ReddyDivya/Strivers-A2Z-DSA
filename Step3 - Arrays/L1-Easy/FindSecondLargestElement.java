/*
2. Find Second Largest Element in an array


# Approach 1: - Brute Force
Step1: Sort the array in ascending order
Step2: The element present at the second index is the second smallest element
Step3: The element present at the second index from the end is the second largest element

# Approach 2: - Recursive Approach(Using a max variable)
Step1: If the current element is larger than ‘large’ then update second_large and large variables
Step2: Else if the current element is larger than ‘second_large’ then we update the variable second_large.
Step3: Once we traverse the entire array, we would find the second largest element in the variable second_large.
*/
import java.util.*;

public class FindSecondLargestElement{
    // This method finds the second largest element in an integer array.
    static private int findSecondLargestElementOptimal(int[] arr, int n){
        // If the array size is less than 2, return -1 indicating no second largest element.
        if(n < 2)
            return -1;
        
        // Initialize the largest and second largest values to the minimum possible integer value.
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;

        // Iterate through the array to find the largest and second largest elements.
        for(int i = 0; i < n; i++){
            // If the current element is greater than the largest element found so far,
            // update the second largest and largest elements.
            if(arr[i] > large){
                second_large = large;
                large = arr[i];
            }
            // If the current element is greater than the second largest but not equal to the largest,
            // update the second largest element.
            else if(arr[i] > second_large && arr[i] != large){
                second_large = arr[i];
            }
        }

        // Check if second_large was updated from its initial value.
        if(second_large == Integer.MIN_VALUE){
            return -1; // No second largest element found.
        }
        return second_large;
    }//findSecondLargestElementOptimal

    public static void main(String[] args){
        int[] arr = {1, 2, 4, 6, 7, 5};
    	int n = arr.length;

        System.out.println("Given Array: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        int secondLargest = findSecondLargestElementOptimal(arr, arr.length);

        // Print the results for the second largest element.
        if(secondLargest == -1){
            System.out.println("There is no second largest element in the array.");
        } else {
            System.out.println("The second largest element in the array is(Optimal): " + secondLargest);
        }
    }//main
}


/*
Output:

Given Array: 
1 2 4 6 7 5
The second largest element in the array is(Optimal): 6
*/