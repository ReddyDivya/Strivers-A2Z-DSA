import java.util.*;

/*
7. Move all Zeros to the end of the array

# Approach 1 - Brute Force Approach: 
Step 1: Copy non-zero elements from the original array to a temporary array.
Step 2: Copy the elements from the temporary array one by one and fill the first X places of the original array.
Step 3: Fill the last N-X places of the original array with zeros. 

# Approach 2- Optimal Approach(Using 2 pointers): 
Step 1: 
    - Initialize two pointers, i and j, where i points to the first non-zero element and j points to the first zero element in the array.
    - Iterate through the array with pointer j until a zero element is found.
    - If no zero element is found, exit the process.
Step 2: Once a zero element is found, set pointer i to j+1.
Step 3:
    - Iterate through the array with pointer i.
    - If a[i] (the element at index i) is non-zero:
    - Swap a[i] with a[j]. Now, the current j points to the non-zero element a[i].
    - Increment j by 1 so that it points to the next zero element.
Step 4: Repeat Step 3 until all non-zero elements are moved to the front of the array and zeros are shifted to the end.
*/

public class MoveAllZeroesToEndOfArray{
    // Brute Force Approach: 
    public static void moveAllZeroesBF(int[] arr, int n){
        // Temporary list to store non-zero elements
        ArrayList<Integer> temp = new ArrayList<>();

        // Step 1: Copy non-zero elements from the original array to the temp array
        //temp[] -> temp[1, 2, 3, 2, 4, 5, 1]
        for(int i = 0; i < n; i++){
            if(arr[i] != 0){
                temp.add(arr[i]);
            }
        }

        // Number of non-zero elements
        int nonZeroes = temp.size();

        // Step 2: Copy elements from temp to fill the first nonZeroes places of the original array.
        //[1 0 2 3 2 0 0 4 5 1] -> [1 2 3 2 4 5 1]
        for(int i = 0; i < nonZeroes; i++){
            arr[i] = temp.get(i);
        }

        // Step 3: Fill the remaining cells with zeros
        //adding zeroes at the end of the arr - [1, 2, 3, 2, 4, 5, 1, 0, 0, 0]
        for(int i = nonZeroes; i < n; i++){
            arr[i] = 0;
        }

        // Print the array after moving all zeroes to the end
        System.out.println("After moving all zeroes to the end of the array (Brute Force):");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+ " ");//final array - [1, 2, 3, 2, 4, 5, 1, 0, 0, 0]
        }
        System.out.println();
    }//moveAllZeroesBF

    // Placeholder for optimal approach to move all zeros to the end
    public static void moveAllZeroesOptimal(int[] arr, int n){
        // Implement the optimal approach here

        // Initialize pointer j to -1
        int j = -1;

        // Step 1: Place the pointer j
        //Iterate through the array until a non-zero element is found.
        for(int i = 0; i < n; i++){
            // If a non-zero element is found, update j and exit loop
            if(arr[i] == 0){
                j = i;
                break;
            }
        }

        // If no non-zero elements are found, return the array
        if(j == -1) return;

        // Step 2: Move the pointers i and j and swap accordingly
        //[2, 3, 4, 5, 1, 1, 0, 0, 0, 0]
        for(int i = j + 1; i < n; i++){
            if(arr[i] != 0){
                // Swap a[i] and a[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        // Print the array after moving all zeroes to the end
        System.out.println("After moving all zeroes to the end of the array (Optimal):");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+ " ");//final array - [1, 2, 3, 2, 4, 5, 1, 0, 0, 0]
        }
        System.out.println();
    }//moveAllZeroesOptimal

    public static void main(String[] args){
        // Initialize the array and its size
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int[] arr2 = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int n = 10;

        // Print the array before moving all zeroes to the end
        System.out.println("Before moving all zeroes to the end of the array:");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Apply brute force approach to move all zeroes to the end
        moveAllZeroesBF(arr, n);

        // Apply optimal approach to move all zeroes to the end
        moveAllZeroesOptimal(arr2, n);
    }//main
}

/*

Output:

Before moving all zeroes to the end of the array:
1 0 2 3 2 0 0 4 5 1
After moving all zeroes to the end of the array (Brute Force):
1 2 3 2 4 5 1 0 0 0
After moving all zeroes to the end of the array (Optimal):    
1 2 3 2 4 5 1 0 0 0
*/
