public class NumberPalindrome {
    public static boolean isPalindrome(int number)
    {
        int palindrome = number;
        int reverse = 0;
        while(palindrome != 0)
        {
            int remainder = palindrome % 10; // extracting the least significant digit
            reverse = reverse * 10 + remainder; // adding the least significant digit to the new number in reverse
            palindrome = palindrome / 10;
        }
        if(number == reverse)
        {
            return true;
        }
        return false;
    }
}
