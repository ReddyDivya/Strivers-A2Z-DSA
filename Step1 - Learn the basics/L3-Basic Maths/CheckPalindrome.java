public class CheckPalindrome {
    
    // Method to check if a number is a palindrome
    static boolean check_palindrome(int n)
    {
        // Initialize variables
        int reverseNum = 0; // To store the reverse of the number
        int lastDigit = 0; // To store the last digit of the number
        int duplicate = n; // To store the original number (for comparison later)

        // Loop until n becomes 0
        while(n > 0)
        {
            // Extract the last digit of n
            lastDigit = n % 10;
            // Construct the reverse of the number
            reverseNum = (reverseNum * 10) + lastDigit;
            // Remove the last digit from n
            n = n / 10;
        }

        // If the original number is equal to its reverse, it's a palindrome
        return duplicate == reverseNum;
    }

    public static void main(String[] arg)
    {
        // Test cases to check if the given numbers are palindromes
        int n = 1331;
        System.out.println(check_palindrome(n)); // Prints true since 1331 is a palindrome

        n = 11;
        System.out.println(check_palindrome(n)); // Prints true since 11 is a palindrome

        n = 123;
        System.out.println(check_palindrome(n)); // Prints false since 123 is not a palindrome
    }
}
