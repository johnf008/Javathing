//name: ProgrammerJohn
//pgm desc: This program utilizes the "switch - case" control statement to check on car wash choice and the cost for the customer
public class SwitchCase1 {
    public static void main(String[]args)
    {
        String choice = "U";
        double total = 5.00, Bcost = 7.00, Dcost = 10.00, Pcost = 13.00, Ucost = 18.00;   //cost variables for the different carwash options

        switch(choice)        //execute the appropriate block of code based on the choice expression value
        {

            case "B":
                System.out.println("Thank you for selecting a Basic carwash");
                total = total +Bcost;
                System.out.println("Please pay $" + total);
                break;                      //Leaves the switch case after being executed
            case "D":
                System.out.println("Thank you for selecting a Deluxe car wash ");
                total = total + Dcost;
                System.out.println("Please pay $" + total);
                break;         //Leaves the switch case after being executed
            case "P":
                System.out.println("Thank you for selecting a Premium carwash");
                total = total + Pcost;
                System.out.println("Please pay $" + total);
                break;              //Leaves the switch case after being executed
            case "U":
                System.out.println("Thank you for selecting the Ultimate carwash");
                total = total +Ucost;
                System.out.println("Please pay$" + total);
                break;             //Leaves the switch case after being executed
            default:              //The default case is executed when no other case is fulfilled
                System.out.println("No carwash selected; please remove yourself from the premises:");
                break;               //Leaves the switch case after being executed

        }

        System.out.println("Thank you for choosing Mr.Wash's carwash!");
        System.out.println(" ");
        System.out.println("Program output courtesy of Programmer John");

    }
}
