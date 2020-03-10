public class SumOddRange {
    public static boolean isOdd(int number)
    {
        if(number > 0)
        {
            if(number % 2 != 0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        return false;
    }
    public static int sumOdd(int start, int end)
    {
        if(start > 0 && end > 0)
        {
            if(start <= end)
            {
                int sum = 0;
                for (int i = start; i <= end; i++)
                {
                    if(isOdd(i))
                    {
                        sum += i;
                    }
                }
                return sum;
            }
        }
        return -1;
    }
}
