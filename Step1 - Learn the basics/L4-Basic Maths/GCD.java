import java.util.*;

public class GCD {
    // Method to calculate the Greatest Common Divisor (GCD) of two numbers
    static void gcd(int n1, int n2)
    {
        // Initialize a variable to store the GCD, initially set to 1
        int ans = 1;

        // Iterate from 1 up to the minimum of n1 and n2
        for(int i = 1; i <= Math.min(n1, n2); i++)
        {
            // Check if both n1 and n2 are divisible by i without remainder
            if(n1 % i == 0 && n2 % i == 0)
                // Update the GCD if i is a common divisor of n1 and n2
                ans = i;
        }

        // Print the calculated GCD
        System.out.println("The GCD of the two numbers is " + ans);
    }

    public static void main(String[] arg)
    {
        // Test cases to find the GCD of pairs of numbers
        gcd(4, 8);  // GCD of 4 and 8 is 4
        gcd(3, 6);  // GCD of 3 and 6 is 3
        gcd(52, 10);  // GCD of 52 and 10 is 2
    }
}
