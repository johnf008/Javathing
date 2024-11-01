//name: ProgrammerJohn
// pgm desc - demonstrate using static methods
//
import java.util.*;
public class java36staticMethods
{

    public static void hello(String n)              //the static method is not part of an instance or object
    {
        System.out.println("Hello and welcome to Mars " + n);
    }

    public static int findSquare(int num)             //static methods can return a value back to collar
    {
        int n2 = num * num;
        return n2;
    }

    public static void main(String[] args)
    {
        String name;
        int num, n2;

        Scanner scObj = new Scanner(System.in);

        System.out.println("Enter your name: ");
        name = scObj.nextLine();

        hello(name);        //call / invoke the hello() static method

        System.out.println("Enter a number to square: ");
        num = scObj.nextInt();

        n2 = findSquare(num);       //call / invoke the findSquare() static methods and expect a return value
        System.out.println("The number squared is: " + n2) ;
    }
}
