//name: ProgrammerJohn
//pgm desc: Determine simple interest based on user $ at interest rate of 1%
import java.util.Scanner;
public class java19SimpleInterest
{
    public static void main(String[] args)
    {
        int time = 12;  //months
        int rate = 1;   //percent
        Scanner sObj = new Scanner(System.in);
        boolean play = true;

        while(play)
        {
            System.out.println("How much would you like to invest? ($100 min.) or 'x' to exit: ");
            String answer = sObj.nextLine();
            if(answer.equals("x"))
            {
                play = false;
                System.out.println("Thank you for investing in your future");

            }
            else
            {
                int num  = Integer.parseInt(answer);
                if(num<100)
                {
                    System.out.println("The minimum is 100.");
                }

                int earnedInterest = (num * time * rate) / 100;
                System.out.println("The principal amount is " + num);
                System.out.println("With a time period of " + time);
                System.out.println("and the rate of interest is " + rate);
                System.out.println(" ");
                System.out.println("The earned interest is: " + earnedInterest);
                System.out.println(" ");
            }
        }
    }
}
