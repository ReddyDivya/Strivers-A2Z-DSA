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

    public static void main(String[] arg)
    {
        int n = 7789;
        System.out.println("Number of digits in "+n+" is "+count_digits(n));
        n = 123489;
        System.out.println("Number of digits in "+n+" is "+count_digits(n));
    }
}