//Programmer John, Mikey, Sebastion
//Pgm desc: Convert Farenheight to Celcius
//
import java.util.Scanner;
public class ConvertTempsCFR
{
    public static void main(String[]args)
    {
        Scanner sObj= new Scanner(System.in);
        double[] fArray = new double[5];
        double[] cArray = new double[5];
        for(int i = 0; i<5; i++)
        {
            System.out.println("Enter your farenheit temerture: ");
            double F = sObj.nextInt();
            fArray[i] = F ;

            double C = (F-32)*5/9;
            cArray[i] = C;
        }
        for(double x :fArray)
        {
            System.out.println("Here is the f Array: " + x);
        }
        for(double y:cArray)
        {
            System.out.println("Here is the C array: " + y);
        }
    }
}
