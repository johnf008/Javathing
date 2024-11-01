//name: John
//pgm desc: Practice making classes with class Bank
//
import java.util.Scanner;
class Bank
{
    private String name;
    private int accountNum;
    private String customerType;
    private String email;

    void openAcct() {System.out.println("You have opened an account.");}
    void closeAcct() {System.out.println("You have closed your account");}
    void deposit() {System.out.println("You have deposited your $. ");}
    void withDraw$(){System.out.println("You have withdrew your $. ");}
    void getLoan(){System.out.println("You have received a loan. ");}
}
public class java23ClassBank {
    public static void main(String[ ] args)
    {
     Bank Cust1 = new Bank();
     Scanner scIn = new Scanner(System.in);
     boolean sysOn = true;

     while(sysOn)
     {
         System.out.println(" Make a selection: O-Open Account/ C- Close Account/ D- Deposit/ W- Withdraw/ G- Get Loan");
         String choice = scIn.nextLine();

         switch(choice)
         {
             case"O": Cust1.openAcct();
             break;
             case"C" :Cust1.closeAcct();
             break;
             case"D" :Cust1.deposit();
             break;
             case"W" : Cust1.withDraw$();
             break;
             case"G": Cust1.getLoan();
             break;
             default: System.out.println("Invalid selection. Please try again. ");
         }
     }

    }
}
