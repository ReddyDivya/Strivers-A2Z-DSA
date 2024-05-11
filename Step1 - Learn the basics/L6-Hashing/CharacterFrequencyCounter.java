import java.util.Scanner; // Corrected import statement

public class CharacterFrequencyCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.next(); // Input string from user

        // Precompute character frequency
        int[] hash = new int[26]; // Array to store character frequency
        for (int i = 0; i < s.length(); i++) {
            // Increment the count for the character at index (s.charAt(i) - 'a')
            hash[s.charAt(i) - 'a']++;
        }

        System.out.print("Enter the number of queries: ");
        int q = sc.nextInt(); // Input number of queries

        // Process each query
        while (q-- > 0) {
            System.out.print("Enter a character to query: ");
            char ch = sc.next().charAt(0); // Input character to query

            // Fetch and print the frequency of the queried character
            System.out.println("Frequency of " + ch + ": " + hash[ch - 'a']);
        }
    }
}

/*
Output:

Enter a string: divyaarjundas
Enter the number of queries: 6
Enter a character to query: d
Frequency of d: 2
Enter a character to query: a
Frequency of a: 3
Enter a character to query: j
Frequency of j: 1
Enter a character to query: z
Frequency of z: 0
Enter a character to query: y
Frequency of y: 1
Enter a character to query: r
Frequency of r: 1
*/