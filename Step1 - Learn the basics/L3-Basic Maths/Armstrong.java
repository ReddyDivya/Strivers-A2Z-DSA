public class Armstrong{
    
    static void armstrong(int n)
    {
        int temp = n;
        int sum = 0, lastDigit = 0, reverseNum = 0;

        while(n > 0)
        {
            lastDigit = n%10;
            sum = sum + (lastDigit * lastDigit * lastDigit);
            n = n/10;
        }

        if(sum == temp)
            System.out.println(temp +"- Yes, it is an Armstrong Number.");
        else
            System.out.println(temp +"- No, it is not an Armstrong Number.");
    }

    public static void main(String[] arg)
    {
        int n=371;
        armstrong(n);

        n=153;
        armstrong(n);

        n=1634;
        armstrong(n);

        n=135;
        armstrong(n);
    }
}