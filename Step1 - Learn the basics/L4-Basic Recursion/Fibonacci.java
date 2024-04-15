public class Fibonacci {
    
    // Method to calculate the nth Fibonacci number recursively
    public static int fibonacci(int n) {
        // Base cases: Fibonacci of 0 is 0, Fibonacci of 1 is 1
        if (n == 0)
            return 0;
        if (n <= 1)
            return n;
        
        // Recursive calls to calculate the Fibonacci numbers of (n-1) and (n-2)
        int last = fibonacci(n - 1); // Fibonacci number of (n-1)
        int secondLast = fibonacci(n - 2); // Fibonacci number of (n-2)
        
        // Return the sum of the Fibonacci numbers of (n-1) and (n-2)
        return last + secondLast;
    }

    public static void main(String[] args) {
        int n = 4; // Number of Fibonacci numbers to generate
        // Loop to generate and print the Fibonacci series up to the nth number
        for (int i = 0; i < n; i++) {
            System.out.println(fibonacci(i) + " ");
        }
    }
}
