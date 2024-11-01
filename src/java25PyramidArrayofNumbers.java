//name: John
//pgm desc: Print a number pyramid
//
import java.util.*;
public class java25PyramidArrayofNumbers
{
    public static void main(String[] args)
    {
        Scanner scObj = new Scanner(System.in); //create object from Scanner input class blueprint

        int x = 0, Plevel;
        boolean play = true;

        while(play)
        {
            System.out.println("Enter how many pyramid levels you would like to see: ");
            Plevel = scObj.nextInt();

            //outer loop for rows
            for(int i = 1; i<= Plevel; i++)
            {
                x = i - 1;

                //inner loop fo "i th" row printing
                for(int j = i; j <= Plevel - 1; j++)
                {
                    System.out.print(" ");     // print number space

                    System.out.print("  ");     // print space between numbers
                }

                //pyramid printing
                for(int j = 0; j <= x; j++) {
                    //System.out.print( (i+j)  < 10 ? (i+j) + " ":   (i+j)   + " ");

                    if ((i + j) < 10) {
                        System.out.print((i + j) + "  ");       //print value and spacing of 2
                    } else {
                        System.out.print((i + j) + " ");       //print value and spacing of 1
                    }
                }
                    for(int j = 1; j <= x; j++)
                    {
                        //System.out.print ((i+x-j)  <10  ?(i+x-j) + "  " : (i+x-j_ + "  "_;
                        if((i+x - j) < 10)
                        {
                            System.out.print( (i+x-j) + "  ");   //print value spacing of 2
                        }
                        else
                        {
                            System.out.print( (i+x-j) + " ");    //print value and spacing of 1
                        }
                    }
                    //end of one row: new line follows
                    System.out.println();



            }
        }
        // end of while loop
    }
}
