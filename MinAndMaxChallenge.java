import java.util.Scanner;

public class MinAndMaxChallenge
{
    public static void minAndMax()
    {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        boolean firstNUmber = true;
        while(true)
        {
            System.out.println("enter number:");
            boolean isNumber = scanner.hasNextInt();
            if(isNumber)
            {
                int number = scanner.nextInt();

                if(number < min)
                {
                    min = number;
                }
                if(number > max)
                {
                    max = number;
                }
            }
            else
            {
                System.out.println("Maximum number = " + max + " Minimum = " + min);
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}
