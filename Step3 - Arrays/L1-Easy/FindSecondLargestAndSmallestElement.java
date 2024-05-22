import java.util.*;

public class FindSecondLargestAndSmallestElement{
    // This method finds the second largest element in an integer array.
    static private int findSecondLargestElement(int[] arr, int n){
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
    }

    // This method finds the second smallest element in an integer array.
    static private int findSecondSmallestElement(int[] arr, int n){
        // If the array size is less than 2, return -1 indicating no second smallest element.
        if(n < 2)
            return -1;

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

        // Check if second_small was updated from its initial value.
        if(second_small == Integer.MAX_VALUE){
            return -1; // No second smallest element found.
        }
        return second_small;
    }

    public static void main(String[] args){
        // Create a Scanner object to read input from the user.
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the size of the array.
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();  // Read the size of the array.

        // Declare an array of the given size.
        int[] arr = new int[n];

        // Prompt the user to enter the elements of the array.
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();  // Read each element of the array.
        }

        // Find the second smallest element in the array.
        int secondSmallest = findSecondSmallestElement(arr, arr.length);
        // Find the second largest element in the array.
        int secondLargest = findSecondLargestElement(arr, arr.length);

        // Print the results for the second largest element.
        if(secondLargest == -1){
            System.out.println("There is no second largest element in the array.");
        } else {
            System.out.println("The second largest element in the array is: " + secondLargest);
        }

        // Print the results for the second smallest element.
        if(secondSmallest == -1){
            System.out.println("There is no second smallest element in the array.");
        } else {
            System.out.println("The second smallest element in the array is: " + secondSmallest);
        }
    }
}


/*
Output:

Enter the size of the array: 
6
Enter the elements of the array: 
22
1
11
33
2
5
The second largest element in the array is: 22
The second smallest element in the array is: 2
*/