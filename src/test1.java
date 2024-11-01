import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        boolean play = true;
        Scanner sObj = new Scanner(System.in);
        while (play)
        {
            System.out.println("enter a number: ");
            int num = sObj.nextInt();
            int Qcount = 0;
            int Dcount = 0;
            int Ncount = 0;
            int Pcount = 0;

            while(num > 0) {
                if (num >= 25)
                {
                    Qcount += 1;
                    num = num - 25;

                }
                else if (num >= 10)
                {
                    Dcount += 1;
                    num = num - 10;

                }
                else if (num >= 5)
                {
                    Ncount += 1;
                    num = num - 5;

                }
                else if (num >= 1)
                {
                    Pcount += 1;
                    num = num - 1;

                }

            }
            System.out.println("quarters: " + Qcount);
            System.out.println("dimes: " + Dcount);
            System.out.println("nickels: " + Ncount);
            System.out.println("pennies: " + Pcount);
        }
    }
}