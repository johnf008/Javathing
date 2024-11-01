//name:ProgrammerJohn
//pgm desc: Ask for a shape and calculate volume
import java.util.*;
import java.lang.Math.*;

public class java37VolumeShapeCFR
{
    public static void main(String[] args)
    {
        boolean play = true;
        Scanner scObj = new Scanner(System.in);
        double pi = 3.14;

        ArrayList<Double> sphereList = new ArrayList<Double>();
        ArrayList<Double> cylinderList = new ArrayList<Double>();
        ArrayList<Double> coneList = new ArrayList<Double>();
        ArrayList<Double> allList = new ArrayList<Double>();

        while(play)
        {
            System.out.println("Select an option: 'S' for sphere, 'Cy' for cylinder, 'Co' for cone, or 'x' to exit: ");
            String answer = scObj.nextLine();

            if(answer.equals("x") ||answer.equals("X"))
            {
                break;
            }
            else if(answer.equals("S"))
            {
                System.out.println("Enter the radius of your Sphere: ");
                double radius = scObj.nextDouble();
                double volume = (4.0/3.0)* Math.PI * Math.pow(radius,3);
                System.out.println("Your volume for the sphere is: " + volume);
                sphereList.add(volume);
                allList.add(volume);
                scObj.nextLine();
            }
            else if (answer.equals("Cy"))
            {
                System.out.println("Enter the radius of your Cylinder: ");
                double radius = scObj.nextDouble();
                System.out.println("Enter the height of your cylinder: ");
                double height = scObj.nextDouble();
                double volume = Math.PI * Math.pow(radius,2) * height;
                System.out.println("Your volume for the sphere is " + volume);
                cylinderList.add(volume);
                allList.add(volume);
                scObj.nextLine();
            }
            else if (answer.equals("Co"))
            {
                System.out.println("Enter the radius of your Cone: ");
                double radius = scObj.nextDouble();
                System.out.println("Enter the height of your Cone: ");
                double height = scObj.nextDouble();
                double volume = 0.3333333333 * Math.PI * Math.pow(radius,2) * height;
                System.out.println("Your volume for the cone is: " + volume);
                coneList.add(volume);
                allList.add(volume);
                scObj.nextLine();
            }

        }
        System.out.println("Sphere list: " + sphereList);
        System.out.println("Cylinder list: " + cylinderList);
        System.out.println("Cone list: " + coneList);
        System.out.println("All list: " + allList);
    }
}
