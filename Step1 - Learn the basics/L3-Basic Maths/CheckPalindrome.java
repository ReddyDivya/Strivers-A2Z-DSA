public class CheckPalindrome{
    static boolean check_palindrome(int n)
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

        return duplicate == reverseNum;
    }

    public static void main(String[] arg)
    {
        int n = 1331;
        System.out.println(check_palindrome(n));

        n = 11;
        System.out.println(check_palindrome(n));

        n = 321;
        System.out.println(check_palindrome(n));
    }
}