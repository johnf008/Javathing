// Programmer John
//pgm desc: Input from user using scanner class
//
import java.util.Scanner;

public class Java4Scanner {
    public static void main(String[] args)
{
    String Uname;
    int Unumber;

    Scanner inObj = new Scanner(System.in);
    boolean play = true;
    String leftOvers;
    
    while(play)
    {

    
    System.out.println("Enter your name: ");
    Uname = inObj.nextLine();

    System.out.println("Enter a number: ");
    Unumber = inObj.nextInt();

    leftOvers = inObj.nextLine();   //consume any leftover data or newiline input
        
    System.out.println("Welcome to java " + Uname + ". Your favorite # is " + Unumber);

    

    }
}
}