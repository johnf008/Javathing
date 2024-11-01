//Programmer John
//Pgm desc: This program will setup an array of pet names and randomly select one to display
//
import java.util.Random;   // Access the library, specifically the random class
public class RandomPetArray
{
    public static void main(String[] args)
    {
        String[] Pets = {"Bulldog", "Chow", "Pug", "Yorky", "Dane", "Lab", "Poodle"};

        Random rObj = new Random(); //Creating an object from the Random class

        int rNum;

        for(int x = 0; x<10; x++)
        {

            rNum = rObj.nextInt(6);         //call the next Int() method using the "rObj" object to generate a random #

            System.out.println("Random pet name: " + Pets[rNum]);

        }

    }
}
