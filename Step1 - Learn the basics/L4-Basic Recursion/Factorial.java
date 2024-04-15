public class Factorial {
    // Recursive method to calculate the Factorial of n
    static int factorial(int n) {
        // Base case: if n is less than 1, return 1
        if (n < 1)
            return 1;

        // Recursive case: return the Factorial of n multiplied by the Factorial of (n-1)
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int n = 4;
        // Print the Factorial of n
        System.out.println("Factorial of first " + n + " is >> " + factorial(n));
    }
}
