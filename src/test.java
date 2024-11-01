import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        boolean play = true;
        Scanner sObj = new Scanner(System.in);

        while (play) {
            System.out.println("Enter a value between 1-99 or 'Exit': ");
            String input = sObj.nextLine();

            if (input.equals("Exit")) {
                play = false;
            } else {
                try {
                    int num = Integer.parseInt(input);

                    if (num >= 1 && num <= 99) {
                        int Q = 25;
                        int D = 10;
                        int N = 5;
                        int P = 1;

                        int QA = num % Q;
                        int DA = num % D;
                        int NA = num % N;
                        int PA = num % P;

                        if (QA == 0) {
                            int answer = num / Q;
                            System.out.println("The amount of quarters you would have is: " + answer);
                        } else {
                            System.out.println("The amount of quarters you would have is: 0");
                        }
                        if (DA == 0) {
                            int answer = num / D;
                            System.out.println("The amount of dimes you would have is: " + answer);
                        } else {
                            System.out.println("The amount of dimes you would have is: 0");
                        }
                        if (NA == 0) {
                            int answer = num / N;
                            System.out.println("The amount of nickels you would have is: " + answer);
                        } else {
                            System.out.println("The amount of nickels you would have is: 0");
                        }
                        if (PA == 0) {
                            int answer = num / P;
                            System.out.println("The amount of pennies you have is: " + answer);
                        } else {
                            System.out.println("The amount of pennies you have is: 0");
                        }
                    } else {
                        System.out.println("Invalid input. Please enter a value between 1-99 or 'Exit'.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number or 'Exit'.");
                }
            }
        }
        System.out.println("Thank you for using this.");
    }
}
