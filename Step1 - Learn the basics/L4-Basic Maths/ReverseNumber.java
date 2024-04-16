public class ReverseNumber {
    // Method to reverse a given number
    static int reverse_number(int n)
    {
        // Initialize variables
        int reverse = 0; // To store the reversed number
        int lastDigit = 0; // To store the last digit of the number

        // Loop until n becomes 0
        while(n > 0)
        {
            // Extract the last digit of n
            lastDigit = n % 10;
            // Construct the reversed number
            reverse = (reverse * 10) + lastDigit;
            // Remove the last digit from n
            n = n / 10;
        }

        // Return the reversed number
        return reverse;
    }

    public static void main(String[] arg)
    {
        // Test cases to reverse the given numbers
        int n = 7789;
        // Print the original number and its reversed form
        System.out.println("The reverse of the " + n + " is " + reverse_number(n));
        
        n = 12345678;
        // Print the original number and its reversed form
        System.out.println("The reverse of the " + n + " is " + reverse_number(n));
    }
}
