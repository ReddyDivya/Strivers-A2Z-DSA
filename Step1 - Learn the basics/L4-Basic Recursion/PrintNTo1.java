//Print N to 1 using Recursion
public class PrintNTo1
{
    // Method to print numbers from N to 1 using recursion
    static void printNTo1(int i, int n)
    {
        // Base condition: if i is less than 1, stop recursion
        if(i < 1)
            return;

        // Print the current number i
        System.out.println(i);//3 2 1

        // Recursive call: decrement i and call printNTo1 again until i < 1
        printNTo1(i-1, n);//(2, 3), (1, 3), (0, 3)
    }

    // Main method
    public static void main(String[] arg)
    {
        // Define the value of n
        int n = 3;

        // Call printNTo1 method to print numbers from n to 1
        printNTo1(n, n);
    }
}
