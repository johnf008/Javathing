//name: ProgrammerJohn
//pgm desc: Input a number and determine if it is even or odd
// place the number in teh correct list.
import java.util.Scanner;
import java.util.ArrayList;

public class java32arrayListNUmsDriver
{
    public static void main(String[] args)
    {
        Scanner scIN = new Scanner(System.in);
        ArrayList<Integer> evenList = new ArrayList<Integer>();
        ArrayList<Integer> oddList = new ArrayList<Integer>();

        int answer;
        double remain;
        String response;
        boolean active = true;

        while(active)
        {
            System.out.println("Enter a number: ");
            answer = scIN.nextInt();

            if(answer % 2 == 0)      //check remainder
            {
                evenList.add(answer);
            }
            else
            {
                oddList.add(answer);
            }
            scIN.nextLine();

            System.out.println("Press enter to continue or 'x' to exit: ");
            response = scIN.nextLine();
            if (response.equals("x") || response.equals("X")) //check user input
            {
                active = false;
            }

        }
        System.out.println("The evenList: " + evenList);
        System.out.println("The oddList: " + oddList);

    }
}
