public class Sum {
    // Recursive method to calculate the sum of first n natural numbers
    static int sum(int n) {
        // Base case: if n is less than 1, return 0
        if (n < 1)
            return 0;

        // Recursive case: return the sum of n and the sum of (n-1)
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        int n = 4;
        // Print the sum of the first n natural numbers
        System.out.println("Sum of first " + n + " natural numbers is >> " + sum(n));
    }
}
