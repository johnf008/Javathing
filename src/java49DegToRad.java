//name: John Flores
//pgm desc: Convert degrees to radians
import java.util.*;

public class java49DegToRad {
    public static double Convert(double degrees){

        double radians = degrees * Math.PI / 180;
        return radians;
    }

    public static void main(String[] args) {
        boolean play = true;
        Scanner sObj = new Scanner(System.in);
        List<String> list = new ArrayList<String>();

        while (play) {
            System.out.print("Enter the degrees you want to convert: ");
            int degrees = sObj.nextInt();

            java49DegToRad obj = new java49DegToRad();

            double radians = obj.Convert(degrees);

            System.out.println("Your degrees: " + degrees);
            System.out.println("Your converted radians: " + radians);

            String fullThing = ("Degrees: " + degrees + ". Radians: " + radians);
            list.add(fullThing);
            System.out.println(" ");

            System.out.print("Would you like to continue. Choose X to exit: ");
            String answer = sObj.next();

            if (answer.equals("X")) {
                System.out.println(list);
                break;

            }

        }
    }
}