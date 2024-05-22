import java.util.*;

public class IsArryaSorted{
    static boolean isSorted(int[] arr, int n){
        for(int i=1; i<n; i++){
            if(arr[i] < arr[i-1])
                return false;
        }

        return true;
    }//isSorted

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

       System.out.println("Is array sorted : " + isSorted(arr, n));
    }
}

/*
Output:

Enter the size of the array: 
5
Enter the elements of the array: 
22
2
1
66
7
Is array sorted : false
-----------------------
Enter the size of the array: 
6
Enter the elements of the array: 
2 
11
22
123
456
678
Is array sorted : true
*/