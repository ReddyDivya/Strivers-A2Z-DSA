import java.util.*;

public class CountDigits {

    // Method to count the number of digits in a given number
    static int count_digits(int n)
    {
        // Initialize variables
        int lastDigit = 0; // To store the last digit of the number
        int count = 0; // To count the number of digits

        // Loop until n becomes 0
        while(n > 0)
        {
            // Extract the last digit of n
            lastDigit = n % 10;
            // Remove the last digit from n
            n = n / 10;
            // Increment the digit count
            count++;
        }
        // Return the count of digits
        return count;
    }

    // Optimal approach to count digits using logarithm
    static int count_digits2(int n)
    {
        // Calculate the number of digits using logarithm
        int digits = (int)Math.floor(Math.log10(n) + 1);
        // Return the number of digits
        return digits;
    }

    public static void main(String[] arg)
    {
        // Test cases to count the number of digits
        int n = 7789;
        System.out.println("(Brute Force)Number of digits in " + n + " is " + count_digits(n));

        // Test the optimal approach
        n = 123489;
        System.out.println("(Optimal)Number of digits in " + n + " is " + count_digits2(n));
    }
}
