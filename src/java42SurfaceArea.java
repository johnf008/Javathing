//name:ProgrammerJohn
//pgm desc: Ask for a shape and calculate surface area
import java.util.*;
import java.lang.Math.*;

public class java42SurfaceArea
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
                double surfaceArea = (4 * Math.PI) * (Math.pow(radius,2));
                System.out.println("Your surface are for the sphere is: " + surfaceArea);
                sphereList.add(surfaceArea);
                allList.add(surfaceArea);
                scObj.nextLine();
            }
            else if (answer.equals("Cy"))
            {
                System.out.println("Enter the radius of your Cylinder: ");
                double radius = scObj.nextDouble();
                System.out.println("Enter the height of your cylinder: ");
                double height = scObj.nextDouble();
                double surfaceArea = ((2 * Math.PI) * Math.pow(radius,2)) + (2 * Math.PI * radius * height);
                System.out.println("Your surface area for the sphere is " + surfaceArea);
                cylinderList.add(surfaceArea);
                allList.add(surfaceArea);
                scObj.nextLine();
            }
            else if (answer.equals("Co"))
            {
                System.out.println("Enter the radius of your Cone: ");
                double radius = scObj.nextDouble();
                System.out.println("Enter the slant height of your Cone: ");
                double slantHeight = scObj.nextDouble();
                double surfaceArea = (Math.PI * radius * slantHeight) + (Math.PI * (Math.pow(radius,2)));
                System.out.println("Your surface area for the cone is: " + surfaceArea);
                coneList.add(surfaceArea);
                allList.add(surfaceArea);
                scObj.nextLine();
            }

        }
        System.out.println("Sphere list: " + sphereList);
        System.out.println("Cylinder list: " + cylinderList);
        System.out.println("Cone list: " + coneList);
        System.out.println("All list: " + allList);
    }
}
