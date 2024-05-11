import java.util.*;

public class MixedCaseCharacterFrequencyCounter{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.next(); // Input string from user

        // Precompute character frequency
        int hash[] = new int[256];//Array to store character frequency

        for(int i=0; i<s.length(); i++){

            // Increment the count for the character at index (s.charAt(i) - 'a')
            hash[s.charAt(i)]++;
        }

        System.out.print("Enter the number of queries: ");
        int q = sc.nextInt(); // Input number of queries
        
        while(q-- > 0) {
            System.out.print("Enter a character to query: ");
            char ch = sc.next().charAt(0);// Input character to query

            // Fetch and print the frequency of the queried character
            System.out.println("Frequency of " + ch + ": " + hash[ch]);
        }
    }
}

/*
Enter a string: ArjunDas
Enter the number of queries: 4
Enter a character to query: A
Frequency of A: 1
Enter a character to query: a
Frequency of a: 1
Enter a character to query: D
Frequency of D: 1
Enter a character to query: s
Frequency of s: 1
*/