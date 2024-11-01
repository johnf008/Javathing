//Name: programmerJohn
//pgm desc: Determine the circumference and area of the circle.
//
import java.util.Scanner;
public class FindCircumferemce
{
    public static void main(String []args) {
        boolean play = true;
        Scanner sObj = new Scanner(System.in);
        double pi = 3.14;
        while (play)
        {
            System.out.println("Enter the radius of a circle, or type '987654321' to exit: ");
            int radius = sObj.nextInt();

            if (radius == 987654321)
            {
                break;
            }

            double circumference = 2 * pi * radius;
            double area = pi * radius * radius;

            System.out.println("If the radius of a circle is " + radius);
            System.out.println("Then the circumference is " + circumference + " units");
            System.out.println("And the area is " + area + " =square units.");

        }
        System.out.println("You have exited the program. ");
    }
}
