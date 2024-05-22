import java.util.*;

public class FindSmallestElement{
    static int findSmallestElement(int[] arr){
        
        int min = arr[0];

        // Iterate through the array
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        // Return the smallest element found
        return min;
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

        // Call the method to find the smallest element and print the result
        System.out.println("The smallest element in the array is: " + findSmallestElement(arr));
    }
}

/*
Output:

Enter the size of the array: 
6
Enter the elements of the array: 
123
3
22
1
56
7
The smallest element in the array is: 1
*/