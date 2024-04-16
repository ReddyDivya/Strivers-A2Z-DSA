import java.util.*;

public class Divisors{
    static void divisors(int n)
    {
        // Print the header indicating the number whose divisors are being listed
        System.out.print("The Divisors of "+n+" are:");

        // Loop to find divisors, starting from 1 up to the square root of n
        for(int i=1; i*i<=n; i++) // i*i<=n means sqrt(n), sqrt(36)=>6
        {
            // Check if i divides n evenly (i.e., if i is a factor of n)
            if(n % i == 0)
            {   
                // Print the first factor found
                System.out.print(i+" ");//1, 2, 3, 4, 6

                // Check if n divided by i is different from i
                // This condition ensures that we don't print the same factor twice
                if(n/i != i)
                    // Print the second factor found, which is n divided by i
                    // This factor pair ensures that every divisor is listed
                    // For example, for n=36, if i=1 (first factor), then n/i=36 (second factor)
                    // Similarly, if i=2 (first factor), then n/i=18 (second factor), and so on
                    System.out.print(n/i+" ");//36, 18, 12, 9
            }
        }
        // Print a newline character to format the output
        System.out.println();
    }

    public static void main(String[] arg)
    {
        // Test cases
        int n = 36;
        divisors(n);

        n = 16;
        divisors(n);

        n = 5;
        divisors(n);
    }
}
