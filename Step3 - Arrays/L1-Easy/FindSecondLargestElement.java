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

    //Approach 1: Brute Force
    static private void findSecondLargestElementBF(int[] arr, int n){
        if (n < 2) {
            System.out.println("There is no second largest element in the array(Brute Force).");
            return;
        }

        Arrays.sort(arr);
        int second_largest = arr[n-2];

        // Print the results for the second smallest element.
        System.out.println("The second largest element in the array is(Brute Force): " + second_largest);
    }//findSecondLargestElementBF

    //Approach 2: Better
    static private void findSecondLargestElementBetter(int[] arr, int n){
        
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;

        if (n < 2) {
            System.out.println("There is no second largest element in the array(Better).");
            return;
        }

        int i;
        // Iterate through the array to find the smallest element
        for(i = 0; i < n; i++){
            // Update 'large' to the maximum value between 'largest' and the current element 'arr[i]'
            large = Math.max(large, arr[i]);
        }

        for(i=0; i<n; i++){
            if(arr[i] > second_large && arr[i] != large){
                second_large = arr[i];
            }
        }

        // Print the results for the second smallest element.
        System.out.println("The second largest element in the array is(Better): " + second_large);
    }//findSecondLargestElementBetter

    // This method finds the second largest element in an integer array.
    static private void findSecondLargestElementOptimal(int[] arr, int n){
        // If the array size is less than 2, return -1 indicating no second largest element.
        if(n < 2)
        {
            System.out.println("There is no second largest element in the array(Optimal).");
            return;
        }
        
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
            return; // No second largest element found.
        }

        // Print the results for the second largest element.
        if(second_large == -1){
            System.out.println("There is no second largest element in the array.");
        } else {
            System.out.println("The second largest element in the array is(Optimal): " + second_large);
        }
    }//findSecondLargestElementOptimal

    public static void main(String[] args){
        int[] arr = {1, 2, 4, 6, 7, 5};
    	int n = arr.length;

        System.out.println("Given Array: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        // Find the second largest element in the array.
        findSecondLargestElementBF(arr, arr.length);
        findSecondLargestElementBetter(arr, arr.length);
        findSecondLargestElementOptimal(arr, arr.length);
    }//main
}


/*
Output:

Given Array: 
1 2 4 6 7 5
The second largest element in the array is(Brute Force): 6
The second largest element in the array is(Better): 6
The second largest element in the array is(Optimal): 6
*/