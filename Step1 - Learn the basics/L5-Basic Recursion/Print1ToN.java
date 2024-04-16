//Print 1 to N using Recursion
public class Print1ToN{
    
    // Method to print numbers from i to n using recursion
    static void print1ToN(int i, int n)
    {
        // Base condition: if i exceeds n, stop recursion
        if(i > n)
            return;

        // Print the current number i
        System.out.println(i);

        // Recursive call: increment i and call print1ToN again until i > n
        print1ToN(i+1, n);
    }

    // Main method
    public static void main(String[] arg)
    {
        // Call print1ToN method to print numbers from 1 to 4
        print1ToN(1, 4);//1 2 3 4
    }
}
