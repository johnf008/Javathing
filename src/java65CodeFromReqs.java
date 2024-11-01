//name: john f
//pgm desc:find the necessary calculations and print them
import java.util.*;
import java.util.Random;

public class java65CodeFromReqs {
    public static void main(String[] args) {
        ArrayList<Integer> randomList = new ArrayList<Integer>();
        boolean play = true;
        Random rObj = new Random();
        Scanner scObj = new Scanner(System.in);

        while (play) {
            randomList.clear();
            int maximum = 0;

            for (int i = 0; i < 10; i++) {
                randomList.add(rObj.nextInt(901) + 100);
            }

            for(Integer j: randomList){
                if(j >= maximum){
                    maximum = j;
                }
            }

            int minimum = 999999;
            for(Integer k: randomList){
                if(k <= minimum){
                    minimum = k;
                }
            }

            int range = maximum - minimum;

            int total = 0;
            for(Integer l: randomList){
                total = total + l;
            }
            int average = total / 10;

            System.out.println("Minimum: " + minimum +
                    " Maximum: " + maximum +
                    " Range: " + range +
                    " Average: "+ average);

            System.out.println("Full list: " + randomList);
            System.out.println("Press x to exit or anything else to continue: ");

            String answer = scObj.nextLine();

            if (answer.equals("x") || answer.equals("X")){
                break;
            }
        }
        
    }
}
