//name: programmer John
//pgm desc: This program calculates the hypotenuse of a right triangle base on inputs from user
//
import java.util.Scanner;
public class java27FindHypotonuse
{
    public static void main(String[]args)
    {
        Scanner scIN = new Scanner(System.in);     //use Scanner class to create an object to utilize for user input purposes
        int Aside, Bside, Cside;
        double Hypotenuse;
        boolean play = true;
        String answer;

        while(play)
        {
            System.out.println("Enter the base length of a right triangle: ");
            Aside = scIN.nextInt();

            System.out.println("Enter the vertical length of right triangle: ");
            Bside = scIN.nextInt();
            // the formula c2= a2*b2 is used to find the hypotenuse of a right triangle
            Cside = (Aside*Aside) + (Bside * Bside);

            double hypotenuse = Cside * Cside;
            System.out.println("The hypotenuse is: " + hypotenuse + " given a base side of: " + Aside + " and vertical side of: " + Bside);

            scIN.nextLine();   //This line clears the input Scanner buffer area

            System.out.println("Would you like to continue? (yes/no): ");

            answer = scIN.nextLine();

            if(answer.equals("no"))
            {
                System.out.println("The user entered no");
                play = false;
            }
        }
        System.out.println("Thank you for playing ");
    }
}
