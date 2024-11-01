//name: John
//gm desc - Determine the area of a triangle, give the base and height data 5 time;
//note the formula: area of a triangle = base * height/2
import java.util.Arrays;
import java.util.Scanner;
public class java24convertFromPython
{
    public static void main(String[]args)
    {
        int[] aList = new int[5];    // declare the list of areas computed
        Scanner sObj = new Scanner(System.in);

        for(int x = 0; x<5; x++)
        {
            System.out.println("Enter the base of the triangle: ");
            int base = sObj.nextInt();

            System.out.println("Enter the height of the triangle: ");
            int height = sObj.nextInt();

            if (height < base)
            {
                System.out.println("Height must be greater than base. ");
            }
            else
            {
                int area = base * height / 2;
                System.out.println("The area of your triangle is: " + area + " square units");
                aList[x]= area;
            }
        }
        //End of for loop
        System.out.println("The list of areas: " + Arrays.toString(aList));
    }
}
