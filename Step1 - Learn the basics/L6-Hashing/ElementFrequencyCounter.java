import java.util.*;

public class ElementFrequencyCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of the array
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        // Create an array of size n to store user input elements
        int[] arr = new int[n];

        // Input elements into the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Precompute the frequency of each element using hashing
        int[] hash = new int[13]; // Assuming elements are in the range [0, 12]
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1; // Increment the count for the corresponding element
        }

        // Input the number of queries
        System.out.print("Enter the number of queries: ");
        int q = sc.nextInt();

        // Process each query
        while (q-- != 0) {
            int number;

            // Input the number for which frequency is to be fetched
            System.out.print("Enter the number to query: ");
            number = sc.nextInt();

            // Fetching the frequency of the queried number
            System.out.println("Frequency of " + number + ": " + hash[number]);
        }
    }
}

/*
Output:
Enter the size of the array: 5
Enter the elements of the array:
1
2
3
2
1
Enter the number of queries: 2
Enter the number to query: 2
Frequency of 2: 2
Enter the number to query: 4
Frequency of 4: 0
*/