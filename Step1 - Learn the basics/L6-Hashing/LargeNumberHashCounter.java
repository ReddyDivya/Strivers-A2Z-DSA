import java.util.Scanner;
import java.util.HashMap;

public class LargeNumberHashCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt(); // Input size of the array

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Input elements into the array
        }

        // Precompute
        HashMap<Integer, Integer> hMap = new HashMap<>(); // Create a HashMap to store frequency
        for (int i = 0; i < n; i++) {
            int key = arr[i];
            int freq = hMap.getOrDefault(key, 0); // Get the current frequency or 0 if not present
            freq++;
            hMap.put(key, freq); // Update the frequency
        }

        System.out.print("Enter the number of queries: ");
        int q = sc.nextInt(); // Input number of queries

        System.out.println("Enter the numbers to query:");
        while (q-- > 0) {
            int number = sc.nextInt(); // Input the number to query
            if (hMap.containsKey(number)) {
                // Print the frequency of the queried number
                System.out.println("Frequency of " + number + ": " + hMap.get(number) );
            } else {
                System.out.println("Frequency of " + number + ": 0 " ); // Print 0 if the number is not found
            }
        }
    }
}

/*
Enter the size of the array: 6
Enter the elements of the array:
1
2
3
3
4
2
Enter the number of queries: 4
Enter the numbers to query:
5
Frequency of 5: 0 
6
Frequency of 6: 0 
4
Frequency of 4: 1
2
Frequency of 2: 2
*/