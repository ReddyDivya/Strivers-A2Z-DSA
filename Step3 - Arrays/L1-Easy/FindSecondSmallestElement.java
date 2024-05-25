/*
2. Find Second Smallest and Second Largest Element in an array


# Approach 1: - Brute Force
Step1: Sort the array in ascending order
Step2: The element present at the second index is the second smallest element
Step3: The element present at the second index from the end is the second largest element

# Approach 2: - Recursive Approach(Using a max variable)
Step1: If the current element is smaller than ‘small’, then we update second_small and small variables
Step2: Else if the current element is smaller than ‘second_small’ then we update the variable ‘second_small’
Step3: Once we traverse the entire array, we would find the second smallest element in the variable second_small.
*/
import java.util.*;

public class FindSecondSmallestElement{
    
    // Approach 1: Brute Force Approach
    static private void findSecondSmallestElementBF(int[] arr, int n){
        if (n < 2) {
            System.out.println("There is no second smallest element in the array(Brute Force).");
            return;
        }
        
        Arrays.sort(arr);
        int second_small = arr[1]; // second smallest

        // Print the results for the second smallest element.
        System.out.println("The second smallest element in the array is(Brute Force): " + second_small);
    }//findSecondSmallestElementBF

    // Approach 2: Better Approach
    static private void findSecondSmallestElementBetter(int[] arr, int n){
        // Initialize variables to store the smallest and second smallest elements
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;

        // Check if the array size is less than 2
        if (n < 2) {
            // If so, print a message indicating that there is no second smallest element and return
            System.out.println("There is no second smallest element in the array(Better).");
            return;
        }

        int i;
        // Iterate through the array to find the smallest element
        for(i = 0; i < n; i++){
            // Update 'small' to the minimum value between 'small' and the current element 'arr[i]'
            small = Math.min(small, arr[i]);
        }

        // Iterate through the array again to find the second smallest element
        for(i = 0; i < n; i++)
        {
            // If the current element is smaller than 'second_small' and not equal to 'small'
            if (arr[i] < second_small && arr[i] != small)
            {
                // Update 'second_small' to the current element
                second_small = arr[i];
            }
        }

        // Print the results for the second smallest element.
        System.out.println("The second smallest element in the array is(Better): " + second_small);
    }//findSecondSmallestElementBetter

    // Approach 3: Optimal Approach
    static private void findSecondSmallestElementOptimal(int[] arr, int n){
        // If the array size is less than 2, print a message indicating no second smallest element.
        if(n < 2) {
            System.out.println("There is no second smallest element in the array(Optimal).");
            return;
        }

        // Initialize the smallest and second smallest values to the maximum possible integer value.
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;

        // Iterate through the array to find the smallest and second smallest elements.
        for(int i = 0; i < n; i++){
            // If the current element is less than the smallest element found so far,
            // update the second smallest and smallest elements.
            if(arr[i] < small){
                second_small = small;
                small = arr[i];
            }
            // If the current element is less than the second smallest but not equal to the smallest,
            // update the second smallest element.
            else if(arr[i] < second_small && arr[i] != small){
                second_small = arr[i];
            }
        }

        // Print the results for the second smallest element.
        System.out.println("The second smallest element in the array is(Optimal): " + second_small);
    }//findSecondSmallestElementOptimal

    public static void main(String[] args){
        int[] arr = {1, 2, 4, 6, 7, 5};
    	int n = arr.length;

        System.out.println("Given Array: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        // Find the second smallest element in the array.
        findSecondSmallestElementBF(arr, arr.length);
        findSecondSmallestElementBetter(arr, arr.length);
        findSecondSmallestElementOptimal(arr, arr.length);
    }//main
}

/*
Output:

Given Array: 
1 2 4 6 7 5 
The second smallest element in the array is(Brute Force): 2
The second smallest element in the array is(Better): 2
The second smallest element in the array is(Optimal): 2
*/