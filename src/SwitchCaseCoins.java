//ProgrammerJohn
//pgm desc: setup string array; create Random class object; use
//traditional for loop; demonstrate switchCase control
//
import java.util.Random;
public class SwitchCaseCoins {
    public static void main(String[] args) {
        String[] CoinsArray = {"Cent", "Nickel", "Dime", "Quarter", "Dollar"};
        Random rObj = new Random();

        for (int i = 0; i <= 20; i++) {
            int rNum = rObj.nextInt(4); // generate random # between 0 & 5
            String coin = CoinsArray[rNum];
            System.out.println("the random coin selected: " + coin);
            switch (coin) {
                case "Cent":
                    System.out.println("the random coin selected is a cent worth $: " + 0.01);
                    break;
                case "Nickel":
                    System.out.println("the random coin selected is a cent worth $: " + 0.05);
                    break;
                case "Dime":
                    System.out.println("the random coin selected is a cent worth $: " + 0.10);
                    break;
                case "Quarter":
                    System.out.println("the random coin selected is a cent worth $: " + 0.25);
                    break;
                case "Dollar":
                    System.out.println("the random coin selected is a cent worth $: " + 1.00);
                    break;
                default:
                    System.out.println("no random coin selected ");
                    break;
            }
        }
    }
}
