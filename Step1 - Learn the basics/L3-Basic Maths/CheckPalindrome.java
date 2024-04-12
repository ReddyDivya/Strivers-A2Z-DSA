public class CheckPalindrome{
    static void check_palindrome(int n)
    {
        int reverseNum = 0;
        int lastDgit = 0;
        int duplicate = n;

        while(n > 0)
        {
            lastDgit = n % 10;
            reverseNum = (reverseNum * 10) + lastDgit;
            n = n/10;
        }

        if(duplicate == reverseNum)
            System.out.println(duplicate+" is a Palindrome Number.");
        else
            System.out.println(duplicate+" is not a Palindrome Number.");
    }

    public static void main(String[] arg)
    {
        int n = 1331;
        check_palindrome(n);

        n = 11;
        check_palindrome(n);

        n = 321;
        check_palindrome(n);
    }
}