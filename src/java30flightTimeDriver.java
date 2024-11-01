//name: John
//pgm desc: Add passengers to the manifest array list
//
import java.util.Scanner;        //access Scanner and random classes form utility package
import java.util.Random;
import java.util.ArrayList;
public class java30flightTimeDriver
{
    public static void main(String[]args)   //main method
    {
        String passName, complete, response, flight = "swa738";
        int boardpassNum;
        Boolean powerStatus = true;

        Scanner scIn = new Scanner(System.in);           //create instance objects from scanner and random classes
        Random rand = new Random();

        ArrayList<String> manifest = new ArrayList<String>();    //setup arraylist to maintain the flight manifest of passangers

        while(powerStatus)
        {
            System.out.println("Please enter the passenger name, home city and phone#");
            passName = scIn.nextLine();

            boardpassNum = rand.nextInt(9999);

            complete = passName + " flight: " + flight + " boardpass: " + boardpassNum;

            manifest.add(complete);                //add passenger into the dynamic arraylist

            System.out.println("Press enter to continue or 'x' to exit: ");
            response = scIn.nextLine();

            if( response.equals("x") || response.equals("X"))
            {
                System.out.println("Thank you");
                powerStatus = false;
            }
        }
        for(int j = 0; j < manifest.size(); j++)
        {
            System.out.println("Passenger manifest: " + manifest.get(j));           //print out each value element from manifest ArrayList
        }
    }
}
