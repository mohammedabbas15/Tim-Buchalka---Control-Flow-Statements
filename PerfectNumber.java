public class PerfectNumber
{
    public static boolean isPerfectNumber(int number)
    {
        if (number < 1)
        {
            return false;
        }
        int count = 0;
        boolean isPerfect = false;
        for (int i = 1; i < number; i++)
        {
            if (number % i == 0)
            {
                count = count + i;
            }
        }
        if(count == number)
        {
            isPerfect = true;
        }
        return isPerfect;
    }
}
