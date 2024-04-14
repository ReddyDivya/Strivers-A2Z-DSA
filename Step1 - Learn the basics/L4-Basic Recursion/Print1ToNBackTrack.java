//Print 1 to N using Recursion by backtracking
public class Print1ToNBackTrack{
    
    // Method to print numbers from 1 to N using recursion by backtracking
    static void print1ToNBackTrack(int i, int n)
    {
        // Base condition: if i is less than 1, return
        if(i < 1) 
            return;

        // Recursively call print1ToNBackTrack with i decremented until i reaches 1
        print1ToNBackTrack(i-1, n);
        
        // Print the current number i
        System.out.println(i);
    }

    // Main method
    public static void main(String[] arg)
    {
        // Define the value of n
        int n = 4;

        // Call print1ToNBackTrack method to print numbers from 1 to n
        print1ToNBackTrack(n, n);
    }
}
