import java.util.*;

//name:John
//pgm desc: unscramble the code
public class java63Unscramble {
    public static void main(String[] args) {
        Scanner scObj = new Scanner(System.in);
        boolean play = true;

        while (play) {
            //get temperature in celcius from user
            System.out.println("Enter temperature in Celcius: ");
            double celcius = scObj.nextDouble();

            double farenheit = (celcius * 9.0 / 5.0) + 32;  //convert to farenheit
            //demonstrate using wrapper class
            //covert both values to strings
            String farenheitStr = Double.toString(farenheit);
            String celciusStr = Double.toString(celcius);

            System.out.println(celciusStr + " degrees Celcius is equal to " + farenheitStr + " degrees Farenheit");

        }
    }
}
