/*
3. Check if an Array is Sorted

# Approach 1: Brute Force
Step1: If the array is empty or has only one element, return true.
Step2: Start with the first element. Compare this element with every other element that comes after it.
Step4: If you find the current element is larger than any of the later elements, return false(unsorted)
Step5: Move to the next element and repeat the comparison.
If you finish checking all elements without finding any violations, return true(sorted).

# Approach 2: Optimal - Efficient (Single traversal)
Step1: We will check every element with its previous element if the previous element is smaller than or equal to the current element then we will move to the next index.
Step2: If the whole array is traversed successfully or the size of the given array is zero or one (i.e N = 0 or N = 1). Then we will return True else return False.
*/
import java.util.*;

public class IsArryaSorted{
    //# Approach 1: Brute Force
    static boolean isSortedBF(int[] arr, int n){
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[i]){
                    return false;
                }
            }
        }

        return true;
    }//isSortedBF

    //Approach 2: Optimal
    static boolean isSortedOptimal(int[] arr, int n){
        for(int i=1; i<n; i++){
            if(arr[i] < arr[i-1])
                return false;
        }

        return true;
    }//isSorted

    public static void main(String[] args){
        int arr[] = {1, 2, 3, 4, 5, 4, 3};
        int n = 7;

        // Prompt the user to enter the elements of the array.
        System.out.println("Given array: ");
        for(int i = 0; i < n; i++){
           System.out.print(arr[i]+" ");
        }
        System.out.println();

       System.out.println("Is array sorted(Brute Force) : " + isSortedBF(arr, n));
       System.out.println("Is array sorted(Optimal) : " + isSortedOptimal(arr, n));
    }//main
}

/*
Output:

Given array: 
1 2 3 4 5
Is array sorted(Brute Force) : true
Is array sorted(Optimal) : true
--------------------------------
Given array: 
1 2 3 4 5 4 3
Is array sorted(Brute Force) : false
Is array sorted(Optimal) : false
*/