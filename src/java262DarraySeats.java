//name: John Flores
//pgm desc: Make a 2d Array to show seats
//
import java.util.*;
public class java262DarraySeats
{
    public static void main(String[ ] args)
    {
        Scanner scIN = new Scanner(System.in);

        boolean play = true;
        int row, col;
        String answer;

        String [] [] seats=  new String[3] [5];

        row = 3;
        col = 5;
        while(play)
        {

            for (int x = 0; x < row; x++)
            {
                for(int y = 0; y<col; y++)
                {
                    seats[x][y] = " empty ";
                    System.out.print(seats[x][y]);
                }
                System.out.println(" ");
            }
            for(int k = 0; k < 3; k++)
            {
                System.out.println(" ");
            }
            seats[1][3] = "Johnny";

            for (int x = 0; x< row; x++)
            {
                for(int y = 0; y < col; y++)
                {
                    System.out.print(seats[x][y]);
                }
                System.out.println(" ");
            }
            System.out.println("Press enter to continue: ");
            answer = scIN.nextLine();
        }
    }
}
