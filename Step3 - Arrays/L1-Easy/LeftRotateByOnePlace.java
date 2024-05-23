public class LeftRotateByOnePlace {

    // Brute-force approach to left rotate an array by one place
    static private void leftRotateByOnePlaceBF(int[] arr, int n) {
        // Create a temporary array to store the rotated elements
        int[] temp = new int[n];

        // Copy elements from the original array to the temporary array, shifting them left by one position
        for (int i = 1; i < n; i++) {
            temp[i - 1] = arr[i];
        }

        // Place the first element of the original array at the last position of the temporary array
        temp[n - 1] = arr[0];

        // Print the array after left rotation
        System.out.println("After Left rotate by one place(Brute Force): ");
        for (int i = 0; i < n; i++) {
            System.out.print(temp[i] + " ");
        }
        System.out.println();
    }//leftRotateByOnePlaceBF

    //Optimal approach to left rotate an array by one place
   static private void leftRotateByOnePlaceOptimal(int[] arr, int n) {
        // Store the first element of the array in a temporary variable
        int temp = arr[0];

        // Shift all elements of the array one position to the left
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        // Place the first element (stored in temp) at the end of the array
        arr[n - 1] = temp;

        // Print the array after left rotation
        System.out.println("After Left rotate by one place (Optimal): ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }//leftRotateByOnePlaceOptimal

    // Main method to test the left rotation
    public static void main(String[] args) {
        // Initialize the array and its size
        int n = 5;
        int arr[] = {1, 2, 3, 4, 5};

        // Print the original array before rotation
        System.out.println("Before Left rotate by one place: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Call the brute-force approach to left rotate the array by one place
        leftRotateByOnePlaceBF(arr, n);

        // Call the optimal approach to left rotate the array by one place
        leftRotateByOnePlaceOptimal(arr, n);
    }//main
}


/*
Output:

Before Left rotate by one place: 
1 2 3 4 5 
After Left rotate by one place(Brute Force): 
2 3 4 5 1
After Left rotate by one place (Optimal): 
2 3 4 5 1
*/