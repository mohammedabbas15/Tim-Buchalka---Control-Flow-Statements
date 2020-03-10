public class SharedDigit
{
    public static boolean hasSharedDigit(int num1, int num2)
    {
        if(num1 < 10 || num1 > 99 ||num2 < 10 || num2 > 99)
        {
            return false;
        }
        boolean isSharedDigit = false;
        int firstLastDigit = num1 % 10;
        int secondLastDigit = num2 % 10;
        int firstFirstDigit = num1 / 10;
        int secondFirstDigit = num2 / 10;
        if((firstLastDigit == secondLastDigit) || (firstFirstDigit == secondFirstDigit) || (firstLastDigit == secondFirstDigit) || (secondLastDigit == firstFirstDigit))
        {
            isSharedDigit = true;
        }
        return isSharedDigit;
    }
}
