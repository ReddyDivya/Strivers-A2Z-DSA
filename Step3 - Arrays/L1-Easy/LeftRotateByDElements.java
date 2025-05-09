/*
- 6. Rotate array by K elements
- Left Rotate By D Place

# Approach 1- Brute Force approach for Rotating the Elements to the left
Step-1: Copy the first k elements into the temp array.
Step-2: Shift n-k elements from last by k position to the left
Step-3: Copy the elements into the main array from the temp array.

# Approach 2 - Using "Reversal Algorithm" for Rotating Elements to left
Step 1: Reverse the first k elements of the array
Step 2: Reverse the last n-k elements of the array.
Step 3: Reverse the whole array.
*/
public class LeftRotateByDElements{
    // Brute force approach for rotating the array to the left by k elements
    public static void RotateToLeftBF(int[] arr, int n, int d){
        d = d % n; // Handle d > n
        int[] temp = new int[d];

        // Step 1: Copy first d elements to temp
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        // Step 2: Shift remaining elements to the left
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }

        // Step 3: Place temp elements at the end
        for (int i = 0; i < d; i++) {
            arr[n - d + i] = temp[i];
        }
    }//RotateToLeftBF

    // Optimal approach for rotating the array to the left by k elements
    public static void RotateToLeftOptimal(int[] arr, int n, int k){
        // Adjust k to be within the bounds of the array length
        k = k % n;
        if(k == 0) return;

        // Reverse the first k elements
        // Reverse the elements from index 0 to k-1 (i.e., index 0 to 1 if k=2).
        // [1, 2, 3, 4, 5, 6, 7] -> [2, 1, 3, 4, 5, 6, 7]
        Reverse(arr, 0, k-1);

        // Reverse the last n-k elements
        // Reverse the elements from index k to n-1 (i.e., index 2 to 6 if k=2).
        // [2, 1, 3, 4, 5, 6, 7] -> [2, 1, 7, 6, 5, 4, 3]
        Reverse(arr, k, n-1);

        // Reverse the whole array
        // Reverse the entire array from index 0 to n-1 (i.e., index 0 to 6).
        // [2, 1, 7, 6, 5, 4, 3] -> [3, 4, 5, 6, 7, 1, 2]
        Reverse(arr, 0, n-1);

        // Print the array after rotating to the left
        System.out.println("After Rotating the elements to Left (Optimal): ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Function to reverse elements in the array between indices start and end
    public static void Reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args){
        // Initialize the array and its size
        int n = 7;
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int arr2[] = {1, 2, 3, 4, 5, 6, 7};
        int k = 2;

        // Print the array before rotating to the left
        System.out.println("Before Rotating the elements to Left: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Approach-1: Rotate the array to the left by k elements using brute force
        RotateToLeftBF(arr, n, k);

        // Approach-2: Rotate the array to the left by k elements using optimal approach
        RotateToLeftOptimal(arr2, n, k);
    }//main
}

/*
Output:

Before Rotating the elements to Left: 
1 2 3 4 5 6 7
After Rotating the elements to Left (Brute Force): 
3 4 5 6 7 1 2
After Rotating the elements to Left (Optimal):     
3 4 5 6 7 1 2
*/