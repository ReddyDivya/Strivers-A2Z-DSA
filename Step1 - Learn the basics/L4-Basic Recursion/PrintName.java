public class PrintName{
    
    // Method to print the name 'Divya' recursively from i to n times
    static void printName(int i, int n)
    {
        // Base condition: if i exceeds n, stop recursion
        if(i > n)   //base condition
            return;

        // Print the name 'Divya'
        System.out.println("Divya");

        // Recursive call: increment i and call printName again until i > n
        printName(i+1, n); // Function call to print till i increments.
    }
    
    // Main method
    public static void main(String[] arg)
    {
        // Call printName method to print 'Divya' 5 times
        printName(1, 5);//Divya, Divya, Divya, Divya, Divya
    }
}
