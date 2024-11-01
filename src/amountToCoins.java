//Names: John, Mikey, Sebastian
//Pgm desc: Find the amount of coins for a number
import java.util.Scanner;
public class amountToCoins
{
    public static void main(String[] args)
    {
        boolean play = true;
        Scanner sObj = new Scanner(System.in);
        while(play)
        {
            System.out.println("Enter a number 1-99 or enter '9876'  to exit: ");
            int num = sObj.nextInt();

            if (num == 9876)
            {
                break;
            }


            int quarterCount = 0;
            int dimeCount = 0;
            int nickelCount = 0;
            int pennyCount = 0;

            while(num>0)
            {
                if (num>=25)
                {
                    quarterCount += 1;
                    num = num - 25;
                }
                else if (num>=10)
                {
                    dimeCount +=1;
                    num = num - 10;
                }
                else if (num >= 5)
                {
                    nickelCount += 1;
                    num = num - 5;
                }
                else if (num >= 1)
                {
                    pennyCount +=1;
                    num = num - 1;
                }


            }
            System.out.println("The amount of quarters you have is: " + quarterCount);
            System.out.println("The amount of dimes you have is: " + dimeCount);
            System.out.println("The amount of nickels you have is: " + nickelCount);
            System.out.println("The amount of pennies you have is: " + pennyCount);

        }
        System.out.println("Thank you for using this");


    }
}
