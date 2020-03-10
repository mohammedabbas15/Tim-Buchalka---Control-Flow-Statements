import java.util.Scanner;

public class ReadingUserInputChallenge
{
    public static void readUserInput()
    {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int count = 1;

        while (true)
        {
            System.out.println("enter number #" + count);
            boolean isNumber = scan.hasNextInt();
            if(isNumber)
            {
                int number = scan.nextInt();
                sum += number;
                if (count == 10)
                {
                    System.out.println("The sum is = " + sum);
                    break;
                }
                count++;
            }
            else
            {
                System.out.println("Invalid Number");
            }
            scan.nextLine();
        }
        scan.close();
    }
}
