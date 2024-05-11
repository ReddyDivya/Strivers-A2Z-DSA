// Program Name: ArrayElementCounter

public class ArrayElementCounter {
    // Method to count occurrences of a number in an array
    static int countOccurrences(int arr[], int number) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(number == arr[i]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Array of integers
        int[] arr = {1, 2, 1, 3, 2};

        // Printing the count of occurrences of number 1 in the given array
        System.out.println("Frequency of 1: " + countOccurrences(arr, 1) + " in the given array");

        // Printing the count of occurrences of number 2 in the given array
        System.out.println("Frequency of 2: " + countOccurrences(arr, 2) + " in the given array");
    }
}
