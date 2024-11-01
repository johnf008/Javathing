//Name:John
//Pgm desc: Ask for an element name, put it into a list, and print it.
import java.util.Scanner;
public class java20CFR
{
    public static void main(String[]args)
    {
        String[] Array = new String[10];
        Scanner sObj = new Scanner(System.in);
        for(int i = 0; i<10;i++)
        {
            System.out.println("Enter an element name: ");
            String elementName = sObj.nextLine();
            Array[i] = elementName;
            System.out.println("You selected: " + elementName);
        }
        for (int x = 0; x< Array.length; x++)
        {
            System.out.println("In total, you selected: " + Array[x]);
        }
        for (String y: Array)
        {
            System.out.println("In total, you selected: " + y);
        }

    }
}
