import java.util.*;

public class FindLargestElement{
    // This method finds the largest element in an integer array.
    static int findLargestElement(int[] arr){
        
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
    }

    public static void main(String[] args){
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();  // Read the size of the array

        // Declare an array of the given size
        int[] arr = new int[n];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();  // Read each element of the array
        }

        // Call the method to find the largest element and print the result
        System.out.println("The largest element in the array is: " + findLargestElement(arr));
    }
}

/*
Output:

Enter the size of the array: 
7
Enter the elements of the array: 
8
333
4
555
32
11
111
The largest element in the array is: 555
*/