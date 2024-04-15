public class PalindromeString {

    static boolean palindrome(int i, String str, int n) {
        // Base case: If i exceeds half of the string length, return true
        if (i >= n / 2)
            return true;

        // If characters at the current positions are not equal, return false
        if (str.charAt(i) != str.charAt(n - i - 1))
            return false;

        // Recursive call with incremented index
        return palindrome(i + 1, str, n);
    }

    public static void main(String[] args) {
        // Example string.
        String str = "madam";
        // Check if the string is a palindrome
        System.out.println(palindrome(0, str, str.length()));

        // Another example string.
        String str1 = "madsm";
        // Check if the string is a palindrome
        System.out.println(palindrome(0, str1, str1.length()));
    }
}
