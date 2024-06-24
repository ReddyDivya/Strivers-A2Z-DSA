public class ReverseNumber {
    // Method to reverse a given number
    static int reverse_number(int x)
    {
        int result = 0;  // Initialize the result to store the reversed number

        // Loop to process each digit of the number
        while (x != 0) {
            int lastDigit = x % 10;  // Get the last digit

            // Check for overflow/underflow before multiplying by 10
            if (result > Integer.MAX_VALUE / 10 || result < Integer.MIN_VALUE / 10) {
                return 0;  // Return 0 in case of overflow/underflow
            }

            result = result * 10 + lastDigit;  // Append the last digit to the result
            x = x / 10;  // Remove the last digit from x
        }

        return result;  // Return the reversed number
    }

    public static void main(String[] arg)
    {
        // Test cases to reverse the given numbers
        int n = 7789;
        // Print the original number and its reversed form
        System.out.println("The reverse of the " + n + " is " + reverse_number(n));
        
        n = -123;
        // Print the original number and its reversed form
        System.out.println("The reverse of the " + n + " is " + reverse_number(n));
    }
}
