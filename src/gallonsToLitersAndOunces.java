//name:ProgrammerJohn
//pgm desc: Find the amount of Liters and Ounces in a gallon.
import java.util.Scanner;
public class gallonsToLitersAndOunces
{
    public static void main(String[]args)
    {
        int count = 0;
        boolean play = true;
        Scanner sObj = new Scanner(System.in);
        double []gallonsArray = new double[5];
        double []litersArray = new double[5];
        double []ouncesArray = new double[5];



        for(int i = 0; i<5; i++)
        {
            System.out.println("Enter the amount of gallons: ");
            double gallons = sObj.nextInt();
            double liters = gallons * 3.785412;
            double ounces = gallons * 128;

            gallonsArray[i] = gallons;
            litersArray[i] = liters;
            ouncesArray[i] = ounces;


            System.out.println("The liters is: " + liters);
            System.out.println("The ounces is: " + ounces);

            count = count +1;
            if (i == 5)
            {
                break;
            }



        }
        for (double x: gallonsArray)
        {
            System.out.println("gallonsArray: " + x);
        }


        for(double y: litersArray)
        {
            System.out.println("litersArray: " + y);
        }

        for(double z: ouncesArray)
        {

            System.out.println("ouncesArray: " + z);
        }

    }
}
