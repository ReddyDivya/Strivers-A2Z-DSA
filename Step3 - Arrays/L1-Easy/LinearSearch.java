/*
7. Linear Search

Example 1:
Input: arr[]= 1 2 3 4 5, num = 3
Output: 2
Explanation: 3 is present in the 2nd index

Example 2:
Input: arr[]= 5 4 3 2 1, num = 5
Output: 0
Explanation: 5 is present in the 0th index

# Approach 1- Brute Force approach
Step1: Traverse the whole array and see if the element is present in the array or not.
Step2: If found, print the index of the element.
Step3: Otherwise, we will print -1.

*/
public class LinearSearch {
    static int linearSearch(int[] arr, int n, int num) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    } // linearSearch

    public static void main(String[] args) {
        int arr[] = {11, 2, 23, 14, 35};
        int num = 141;
        int n = arr.length;

        // Print the array before Linear Search
        System.out.println("Before Linear Search: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int index = linearSearch(arr, n, num);
        if(index < 0)
            System.out.print("The element "+num+" we're searching for doesn't exist in the array.");
        else
            System.out.print("The element "+num+" we're searching for exists at index "+ (index+1)+".");
    }
}
/*
Output:

Before Linear Search: 
11 2 23 14 35 
The element 14 we're searching for exists at index 4.

Before Linear Search: 
11 2 23 14 35
The element 141 we're searching for doesn't exist in the array.
*/