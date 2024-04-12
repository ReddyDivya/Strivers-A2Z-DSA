public class CountDigits{

    static void count_digits(int n)
    {
        int lastDigit = 0;
        int count = 0;

        while(n>0)
        {
            lastDigit = n%10;
            n = n/10;
            count++;
        }

        System.out.println("The number of digits are >> "+count);
    }

    public static void main(String[] arg)
    {
        count_digits(7789);//4
        count_digits(123489);//6
    }
}