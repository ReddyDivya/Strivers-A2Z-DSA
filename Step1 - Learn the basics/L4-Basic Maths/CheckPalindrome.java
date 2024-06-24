public class CheckPalindrome {
    
    // Method to check if a number is a palindrome
    static boolean check_palindrome(int x)
    {
        // Negative numbers are not palindromes
        if (x < 0) {
            return false;
        }

        int result = 0;  // Initialize the variable to store the reversed number
        int n = x;  // Make a copy of the original number

        // Loop to reverse the number
        while (n > 0) {
            int lastDigit = n % 10;  // Get the last digit

            // Check for overflow/underflow
            if (result > (Integer.MAX_VALUE - lastDigit) / 10) {
                return false;  // Return false in case of overflow
            }

            result = result * 10 + lastDigit;  // Append the last digit to the result
            n = n / 10;  // Remove the last digit from n
        }

        // Check if the original number is equal to the reversed number
        return x == result;
    }

    public static void main(String[] arg)
    {
        // Test cases to check if the given numbers are palindromes
        int n = 1331;
        System.out.println("The palindrome of "+n+ " is "+ check_palindrome(n)); // Prints true since 1331 is a palindrome

        n = 11;
        System.out.println("The palindrome of "+n+ " is "+ check_palindrome(n)); // Prints true since 11 is a palindrome

        n = 123;
        System.out.println("The palindrome of "+n+ " is "+ check_palindrome(n));// Prints false since 123 is not a palindrome
    }
}
