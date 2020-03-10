public class LastDigitChecker
{
    public static boolean hasSameLastDigit(int a, int b, int c)
    {
        if(a < 10 || a > 1000 || b < 10 || b > 1000 || c < 10 || c > 1000)
        {
            return false;
        }
        boolean hasSameDigit = false;
        int lastA = a % 10;
        int lastB = b % 10;
        int lastC = c % 10;
        if(lastA == lastB || lastB == lastC || lastA == lastC)
        {
            hasSameDigit = true;
        }
        else
        {
            hasSameDigit = false;
        }
        return hasSameDigit;
    }
    public static boolean isValid (int a) {
        return (a >= 10 && a <= 1000);
    }
}
