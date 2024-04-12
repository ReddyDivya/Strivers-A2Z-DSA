import java.util.*;

public class CountDigits{

    static int count_digits(int n)
    {
        int lastDigit = 0;
        int count = 0;

        while(n>0)
        {
            lastDigit = n%10;
            n = n/10;
            count++;
        }
        return count;
    }

    //optimal approach
    static int count_digits2(int n)
    {
        //logarithm
        int digits = (int)Math.floor(Math.log10(n) + 1);
        return digits;
    }

    public static void main(String[] arg)
    {
        int n = 7789;
        System.out.println("Number of digits in "+n+" is "+count_digits(n));
        n = 123489;
        System.out.println("Number of digits in "+n+" is "+count_digits2(n));
    }
}