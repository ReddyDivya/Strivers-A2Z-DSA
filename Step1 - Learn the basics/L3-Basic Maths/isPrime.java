public class IsPrime {
    // Method to check if a number is prime or not
    static void isPrime(int n) {
        // Check if the number is less than or equal to 1
        if (n <= 1) {
            // If the number is less than or equal to 1, it's not prime
            System.out.println(n + " Not a Prime Number");
            return; // Exit the method
        }
        
        int count = 0; // Initialize a counter for factors
        // Loop to check for factors from 2 to the square root of n
        for (int i = 2; i * i <= n; i++) {
            // If n is divisible by i, increment the factor count
            if (n % i == 0) {
                count++;
            }
        }

        // Check if count is still 0 after the loop
        if (count == 0) {
            // If count is 0, it means no factors were found, so the number is prime
            System.out.println(n + " Prime Number");
        } else {
            // If count is not 0, it means factors were found, so the number is not prime
            System.out.println(n + " Not a Prime Number");
        }
    }

    public static void main(String[] args) {
       // Test cases
       isPrime(11); // true
       isPrime(100); // false
       isPrime(13); // true
    }
}
