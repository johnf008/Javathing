import java.util.Scanner;
public class testcode314159 {
    public static void main(String[] args){
        // create Scanner to gather user input
        Scanner input = new Scanner(System.in);

        // create integer variable that will hold the user's input
        int userNum = 1;

        // outer loop to prompt user for input number
        do{
            // get input from the user, validating that they entered an integer
            System.out.print("Enter an integer number or 0 to quit: ");
            if (input.hasNextInt())
            {
                // user has entered  number, get it from input stream
                userNum =  input.nextInt();
                input.nextLine(); // good practice to clear remaining stream


                System.out.println("hi");





            }
            else if (userNum <= 0){
                continue;
            }
            else
            {
                System.out.println("Oops! Please enter an integer.");
                input.nextLine();   // flush bad data
                userNum = 1;  // ensure the do-while loop keeps going
            }

        }while(userNum > 0);
        // continue while user's input is greater than 0

        input.close();
        System.out.println("Done!");
    }
}
