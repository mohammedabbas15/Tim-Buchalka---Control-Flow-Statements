public class DigitSumChallenge {
    public static int sumDigits(int number)
    {
        int sum = 0;
        if(number < 10)
        {
            return -1;
        }
        while(number > 0)
        {
            // extracting the least significant digit
            int digit = number % 10;
            sum += digit;

            // drop the least significant digit
            number /= 10;
        }
        return sum;
    }
}
