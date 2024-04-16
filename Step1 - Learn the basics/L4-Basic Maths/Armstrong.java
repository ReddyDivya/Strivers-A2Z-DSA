public class Armstrong {
	
    // Method to check if a number is an Armstrong number
    static boolean armstrong(int n)
    {
        // Store the original value of n for comparison later
        int temp = n;
        // Initialize sum to accumulate the sum of the cubes of the digits
        int sum = 0;
        // Variable to store the last digit of n
        int lastDigit = 0;

        // Loop until n becomes 0
        while(n > 0)
        {
            // Extract the last digit of n
            lastDigit = n % 10;
            // Add the cube of the last digit to sum
            sum = sum + (lastDigit * lastDigit * lastDigit);
            // Remove the last digit from n
            n = n / 10;
        }

        // If sum equals the original value of n, it's an Armstrong number
        return sum == temp;
    }

    public static void main(String[] args)
    {
        // Test cases to check if the given numbers are Armstrong numbers
        int n = 371;
        System.out.println(n + " is Armstrong? " + armstrong(n));

        n = 153;
        System.out.println(n + " is Armstrong? " + armstrong(n));

        n = 1634;
        System.out.println(n + " is Armstrong? " + armstrong(n));

        n = 135;
        System.out.println(n + " is Armstrong? " + armstrong(n));

        n = 1;
        System.out.println(n + " is Armstrong? " + armstrong(n));
    }
}
