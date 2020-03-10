public class NumberToWords
{
    public static void numberToWords(int number)
    {
        if(number < 0)
        {
            System.out.println("Invalid Value");
        }
        int digitCount = getDigitCount(number);
        number = reverse(number);
        for(int i = digitCount; i > 0; i--)
        {
            switch(number % 10)
            {
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Zero");
                    break;
            }
            number /= 10;
        }
    }
    public static int reverse(int number)
    {
        int reverse = 0;  // our places holder to be updated
        while(number != 0)
        {
            reverse *= 10; // creating space to put next remainder
            reverse += (number % 10); // placing the remainder
            number /= 10;  // removing the least significant digit
        }
        return reverse;
    }
    public static int getDigitCount(int number)
    {
        if(number < 0)
        {
            return -1;
        }
        int digitCount = 0;
        while(number != 0)
        {
            digitCount++;
            number = number / 10;
        }
        if(digitCount == 0)
        {
            digitCount++;
        }
        return digitCount;
    }
}
