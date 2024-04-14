public class PrintNTo1BackTrack{
    
    // Method to print numbers from N to 1 using recursion by backtracking
    static void printNTo1BackTrack(int i, int n)
    {
        // Base condition: if i is less than 1, return
        if(i < 1) 
            return;

        // Print the current number i
        System.out.println(i); // 4 3 2 1

        // Recursively call printNTo1BackTrack with i decremented until i reaches 1
        printNTo1BackTrack(i-1, n);
    }

    // Main method
    public static void main(String[] arg)
    {
        // Define the value of n
        int n = 4;

        // Call printNTo1BackTrack method to print numbers from n to 1
        printNTo1BackTrack(n, n);
    }
}
                              