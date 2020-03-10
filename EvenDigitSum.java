public class EvenDigitSum
{
    public static int getEvenDigitSum(int number)
    {
        if (number < 0)
        {
            return -1;
        }

        int finalNumber = 0;

        while (number > 0)
        {
            if (((number % 10) %2) == 0)   //getting last digit AND testing for even
            {
                finalNumber += number % 10; //takes out the last digit and adds to finalNumber
            }
            number = number / 10; //takes out last digit to test the next digit
        }
        return finalNumber;
    }
}
