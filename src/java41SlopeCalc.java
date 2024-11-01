//name: John
//pgm desc: Calculate slope
import java.util.*;

public class java41SlopeCalc {
    public static void main(String[] args) {
        boolean play = true;
        while (play) {
            Scanner sObj = new Scanner(System.in);

            System.out.print("Enter your x1: ");
            double x1 = sObj.nextDouble();

            System.out.print("Enter your y1: ");
            double y1 = sObj.nextDouble();

            System.out.print("Enter your x2: ");
            double x2 = sObj.nextDouble();

            System.out.print("Enter your y2: ");
            double y2 = sObj.nextDouble();

            double y = y2 - y1;
            double x = x2 - x1;
            double slope = y / x;

            System.out.println("Your slope is: " + slope);


        }
    }
}