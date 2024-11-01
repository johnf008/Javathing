//name: John
//pgm desc: Calculate Kinetic energy using a static method
import java.util.*;
public class java50KineticEnergy {

    static double FindKE(double m, double v){      //standAlone static method
        double KE;

        KE = ( 0.5 * m) * (Math.pow(v,2));
        return KE;
    }

    public static void main(String [] args){
        boolean play = true;
        Scanner scObj = new Scanner(System.in);

        while (play){
            System.out.println("Enter the mass: ");
            double mass = scObj.nextDouble();

            System.out.println("Enter the velocity: ");
            double velocity = scObj.nextDouble();

            double kineticEnergy = FindKE(mass, velocity);

            System.out.println("The Kinetic Energy for object with mass of " + mass + " kg ");
            System.out.println("and a velocity of "+ velocity + " m/s is: ");
            System.out.println(kineticEnergy + " Joules ");

            System.out.println();

            System.out.print("Would you like to continue? Select 'X' to exit: ");
            String answer = scObj.next();

            if (answer.equals("X")){
                break;
            }
        }
    }
 }
