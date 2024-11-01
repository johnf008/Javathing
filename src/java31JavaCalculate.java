//name: John Flores
//pgm desc: Simulate a calculator via command line input
import java.util.Scanner;              //access Scanner class form the java utility package

class calculator                // set up the calculator class blueprint
{
    String operation;       //declare instance variables for teh calculator class
    String keypad;
    double sum, diff, prod, quo;

    public double addMethod(double n1, double n2)       //class method to add numbers
    {
        sum = n1 + n2;
        return sum;
    }
    public double subMethod(double n1, double n2)
    {
        diff = n2 - n1;
        return diff;
    }
    public double multMethod(double n1, double n2)      //class method to multiply two numbers and return the product
    {
        prod = n1 * n2;
        return prod;
    }
    public double divMethod(double n1, double n2)
    {
        quo = n1/n2;
        return quo;
    }
}
public class java31JavaCalculate {
    public static void main(String[] args)           //main method where JVM begins execution
    {
        double num1, num2, result;          //declare local variables
        int choice;
        boolean play = true;                    //declare and initialize local boolean variable
        String response;

        Scanner scIN = new Scanner(System.in);           //create instance from scanner class for input purposes

        while(play)             //begin loop until boolean variable is false

        {
            System.out.println("Enter a number: ");              //prompt user for data
            num1 = scIN.nextDouble();                 //obtain decimal input value from the user

            System.out.println("Enter another number: ");
            num2 = scIN.nextInt();

            System.out.println("Choose 1=add, 2 = subtract, 3 = divide, or 4 = multiply");
            choice = scIN.nextInt();

            calculator cal = new calculator();          //create an instance of calculator object

            switch(choice)          //Check value of choice variable
            {
                case 1:
                    result = cal.addMethod(num1,num2);
                    System.out.println("The result of the add is " + result);
                    break;

                case 2:
                    result = cal.subMethod(num1,num2);         //call method to calculate the difference between two numbers
                    System.out.println(" The result of the sub is " + result);
                    break;
                case 3:
                    result = cal.divMethod(num1,num2);
                    System.out.println("The result of the div is " + result);               //display division result output to user
                    break;
                case 4:
                    result = cal.multMethod(num1, num2);
                    System.out.println("The result of the mult is " + result);
                    break;                 //exit loop when choice case block is executed
                default:
                    System.out.println("No selection made");
            }

            scIN.nextLine();                //clear the input stream
            System.out.println("Press enter to continue or 'x' to exit: ");       //prompt user if they want to continue
            response = scIN.nextLine();
            if(response.equals("x" ) || response.equals("X"))          //check user response on whether they want to continue
            {
                play = false;                   //set boolean variable so loop condition will not be set
                System.out.println("App powering off");
            }

        }      //end of loop
    }

}

