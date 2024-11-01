//name:ProgrammerJohn
//pgm desc: Make a class to calculate interest
//
import java.util.Scanner;

class Investment               //class blueprint
{
    int amt;
    int tim;
    int rate;
    double earned_Interest;

    public void calcInterest(int amt, int time, int rate)
    {
        earned_Interest = (amt*time*rate) / 100;

        System.out.println("The interest earned : " + earned_Interest);
    }
}
public class java33ClassInterest
{
    public static void main(String [ ] args)
    {
        int principalAmt;
        int duration;
        int interest_Rate;
        boolean plau = true;
        String answer;

        Scanner scIN = new Scanner(System.in);     //create a scanner object

        Investment invest = new Investment();       //create an invest object

        //

        while(plau)
        {
            System.out.println("Enter an amount to invest: ");
            principalAmt = scIN.nextInt();

            System.out.println("Enter duration / years: ");
            duration = scIN.nextInt();

            System.out.println("Enter interest rate: ");
            interest_Rate = scIN.nextInt();

            invest.calcInterest(principalAmt, duration, interest_Rate);

            scIN.nextLine();         //clear the input stream

            System.out.println("Press enter to continue or 'x' to exit: ");
            answer =  scIN.nextLine();
            if (answer.equals("x") || answer.equals("X"))
            {
                plau = false;
                System.out.println("Thanks for playing");
            }

        }// End of while loop/
    }
}
