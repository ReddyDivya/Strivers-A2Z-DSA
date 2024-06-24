/*
Example Walkthrough:

Let's consider 𝑁=120:
1. Extract Digits: The digits in 120 are 1, 2, and 0.
2. Check Divisibility:
    Digit 1: 120÷1=120(remainder 0). So, 1 evenly divides 120.
    Digit 2: 120÷2=60 (remainder 0). So, 2 evenly divides 120.
    Digit 0: Ignore 0 since division by 0 is not possible.
*/
import java.io.*;
import java.util.*;

class EvenlyDivides {

    // Method to count the number of digits in N that evenly divide N
    static int evenlyDivides(int N) {
        int n = N;  // Copy of the original number N
        int count = 0;  // Initialize the counter for divisible digits

        // Loop to process each digit of the number
        while (n > 0) {
            int lastdigit = n % 10;  // Extract the last digit of n

            // Check if the last digit can evenly divide the original number N
            if (lastdigit > 0 && N % lastdigit == 0)
                count++;  // Increment the count if it can

            n = n / 10;  // Remove the last digit from n
        }
        
        return count;  // Return the count of divisible digits
    }

    public static void main(String[] args) {
        int n = 120;
        // Output the result for the number 120
        System.out.println("The number " + n + " is evenly divided by " + evenlyDivides(n) + " digits.");  // Expected output: 2

        n = 1234;
        // Output the result for the number 1234
        System.out.println("The number " + n + " is evenly divided by " + evenlyDivides(n) + " digits.");  // Expected output: 2

        n = 1012;
        // Output the result for the number 1012
        System.out.println("The number " + n + " is evenly divided by " + evenlyDivides(n) + " digits.");  // Expected output: 3
    }
}
