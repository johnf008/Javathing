//name:John
//pgm desc: Create an arraylist that contains randomly generated license plate(eg. "xyz1234)
// the format is three letters followed by a 4 digit number
import java.util.*;
public class java34RandomLicesnsePlate {
    public static void main(String[] args) {
        boolean play = true;
        ArrayList<String> licensePlates = new ArrayList<String>();

        while (play) {
            Random rObj = new Random();
            Scanner sObj = new Scanner(System.in);

            char l1 = (char) (rObj.nextInt(26) + 'a');
            char l2 = (char) (rObj.nextInt(26) + 'a');
            char l3 = (char) (rObj.nextInt(26) + 'a');

            String letters = Character.toString(l1) + Character.toString(l2) + Character.toString(l3);

            System.out.println("Random letters: " + letters);

            int rNum1 = rObj.nextInt(1000, 9999);   // generate integer

            String nums = Integer.toString(rNum1);
            String complete = letters + nums;
            System.out.println("License plate: " + complete);
            licensePlates.add(complete);

            System.out.println("Press 'x' to continue or enter to continue");

            String choice = sObj.nextLine();

            if (choice.equals("x") || choice.equals("X")) {
                play = false;
            }

        }

        for (int j = 0; j < licensePlates.size(); j++)
        {
            System.out.println("License plate: " + licensePlates.get(j));

        }
    }
}