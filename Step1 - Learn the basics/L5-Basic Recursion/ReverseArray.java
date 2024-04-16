// Method to reverse the input array using single pointer
public class ReverseArray {

    // Method to reverse the input array
    static void reverseArray(int arr[], int n) {
        // Create a new array to store the reversed elements
        int[] ans = new int[n];

        // Iterate over the original array in reverse order
        for(int i = n - 1; i >= 0; i--) {
            // Store the elements in the reversed order in the new array
            ans[n - i - 1] = arr[i];
        }

        // Print the reversed array
        System.out.print("Reversed array is:- \n");
        // Loop through the array and print each element
        for(int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static void main(String[] args) {
        // Define the size of the array
        int n = 5;
        // Define the original array
        int arr[] = {5, 4, 3, 2, 1};
        // Call the method to reverse the array
        reverseArray(arr, n);
    }
}
