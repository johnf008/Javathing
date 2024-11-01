//name: John Flores
//pgm desc: Add dog breeds to an array
//
import java.util.Scanner;
import java.util.ArrayList;

public class java29arrayListDriverDog
{
    public static void main(String[] args)
    {

        Scanner scIN = new Scanner(System.in);

        ArrayList<String> dogs = new ArrayList<String>();

        String answer, response;
        boolean play = true;

        dogs.add("Bulldog");
        dogs.add("Chow");
        dogs.add("Pointer");

        for (String x: dogs)
        {
            System.out.println("Dog: " + x);
        }
        while(play)
        {
            System.out.println("Enter a dog type: ");
            answer = scIN.nextLine();

            dogs.add(answer);

            scIN.nextLine();

            System.out.println("Press enter or 'x' to exit: ");
            response = scIN.nextLine();
            if(response.equals("X") || response.equals("x"))
            {
                System.out.println("Thanks for participating");
                play = false;
            }
        }
        for(int k = 0; k<dogs.size(); k++)
        {
            System.out.println("Dog type: " + dogs.get(k));
        }
    }
}
