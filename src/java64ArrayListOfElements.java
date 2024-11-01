//name: John F.
//pgm desc: change the following program such only elements which are not gases and metals are rejected
//
import java.util.*;
public class java64ArrayListOfElements {
    public static void main(String[] args){
        String answer;
        Boolean active = true;

        Scanner scIn = new Scanner(System.in);
        ArrayList<String> elementsList = new ArrayList<String>();

        while(active) {
            System.out.println("Enter chemical name or 'x' to exit");
            answer = scIn.nextLine();

            if(answer.equals("x") || answer.equals("X")){
                active = false;
            }
            else {
                System.out.println("Is your element a gas or metal");
                String newAnswer = scIn.nextLine();

                if(newAnswer.equals("No") || newAnswer.equals("no")){
                    System.out.println("Your answer is rejected :(");
                    continue;
                }
                elementsList.add(answer);

                System.out.println("The elements: " + elementsList);

                Collections.sort(elementsList);
                System.out.println("The sorted elements: " + elementsList);
            }
        }
    }
}
