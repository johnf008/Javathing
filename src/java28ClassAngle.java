//programmer John
//pgm desc: demonstrate use of math library methods; input an angle in degrees;
//provide corresponding since, cosine and tangent
//
import java.util.Scanner;
class Angle //declare class blueprint
{
    int deg;         //instance data variable
    int rad;

    double cosMethod(double rads)     //methods for angle class
    {
        double cosine;
        cosine = Math.cos(rads);           //utilize cosine method from Math class
        return cosine;
    }
    double sineMethod(double rads)    //utilize cosine method from Math class
    {
        double sine;
        sine = Math.sin(rads);
        return sine;
    }
    double tanMethod(double rads)
    {
        double tan;
        tan = Math.tan(rads);               //utilize cosine method from Math class
        return tan;
    }
}
//........end of class blueprint
public class java28ClassAngle
{
    public static void main(String[]args)
    {
        int degrees;            //declare local variables
        double radians, output;
        Scanner scIn = new Scanner(System.in);        //create object from Scanner input class

        System.out.println("Enter an angle: ");      //get input from user
        degrees = scIn.nextInt();

        radians = degrees * Math.PI/180;            //convert degrees to radians

        System.out.println("Angle in radians: " + radians);

        Angle ang1 = new Angle();                 //create object from Angle class

        System.out.println("Degrees: " + degrees);

        output = ang1.cosMethod(radians);    //call object's method and send argument/parameter data and assign result
        System.out.println("Cosine: " + output);

        output = ang1.sineMethod(radians);  //call object's method and send argument/parameter data and assign result
        System.out.println("Sine: " + output);

        output = ang1.tanMethod(radians);   //call object's method and send argument/parameter data and assign result
        System.out.println("Tangent: " + output);
    }
}
