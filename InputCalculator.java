import java.util.Scanner;

public class InputCalculator
{
    public static void inputThenPrintSumAndAverage()
    {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int average = 0;
        while (true)
        {
            boolean isNumber = scan.hasNextInt();
            if(isNumber)
            {
                count++;
                int number = scan.nextInt();
                sum += number;
            }
            else
            {
                average = sum / count;
                System.out.println("SUM = " + sum + " AVG = " + average);
                break;
            }
            scan.nextLine();
        }
        scan.close();
    }
}
