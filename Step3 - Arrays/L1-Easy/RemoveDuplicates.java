import java.util.*;

public class RemoveDuplicates{
    // This method removes duplicates from a sorted integer array and returns the new length of the array.
    static int removeDuplicates(int[] arr){
        // Sort the array to ensure duplicates are adjacent.
        Arrays.sort(arr);

        // Check if the array is empty or has only one element
        if(arr.length == 0) return 0;

        // Initialize a pointer i to keep track of the unique elements' position.
        int i = 0;

        // Iterate through the array starting from the second element.
        for(int j = 1; j < arr.length; j++){
            // If the current element is different from the last unique element,
            // it means it's a new unique element.
            if(arr[i] != arr[j]){
                i++; // Move the pointer i to the next position.
                // Update the next position with the current element.
                arr[i] = arr[j];
            }
        }

        // Return the number of unique elements in the array.
        return i + 1;
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

        // Call the method to remove duplicates and get the new length of the array.
        int uniqueArrLength = removeDuplicates(arr);

        // Print the array after removing duplicate elements.
        System.out.println("The array after removing the duplicate elements: ");
        for(int i = 0; i < uniqueArrLength; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}

/*
Output:

Enter the size of the array: 
6
Enter the elements of the array: 
3
2
3
2
1
5
The array after removing the duplicate elements: 
1 2 3 5
----------------------------------------------------
Enter the size of the array: 
6
Enter the elements of the array: 
2
3
3
2
1
4
The array after removing the duplicate elements: 
1 2 3 4
*/