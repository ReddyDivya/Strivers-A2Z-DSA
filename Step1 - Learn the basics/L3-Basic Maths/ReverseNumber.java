public class ReverseNumber{
    static int reverse_number(int n)
    {
        int reverse = 0;
        int lastDigit = 0;

        while(n > 0)
        {
            lastDigit = n % 10;
            reverse = (reverse * 10) + lastDigit;
            n = n/10;
        }

        return reverse;
    }

    public static void main(String[] arg)
    {
        int n = 7789;
        System.out.println("The reverse of the "+ n +" is "+ reverse_number(n));
        
        n = 12345678;
        System.out.println("The reverse of the "+ n +" is "+ reverse_number(n));
    }
}