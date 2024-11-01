//name: programmerJohn
//pgm desc: demonstrate using Wrapper classes and Math methods
import java.util.Scanner;
public class java62WrappperPracticeWithMathMethods {
    public static void main(String[] args){
        Scanner scObj = new Scanner(System.in);

        //get user input for a double value
        System.out.println("Enter the cost for your favorite sneakers in dollars and cents: ");

        String doubleStr = scObj.nextLine();      //get user input into a string primitive value

        //convert user input string with a Double wrapper and place it in a double primitive variable
        double doubleValue = Double.parseDouble(doubleStr);  //convert user input string with a Double wrapper

        //

        System.out.println("Enter the amount of money your favorite car costs: ");

        String intStr = scObj.nextLine();

        //convert input string with a Integer wrapper and place in a int primitive variable
        int intValue = Integer.parseInt(intStr);

        //perform various calculation with available MAth methods
        double squaredValue = Math.pow(doubleValue, 2);

        int roundedValue = (int)Math.round(doubleValue); //convert value with typeCasting

        double squareRoot = Math.sqrt(intValue);

        int maxValue = Math.max(intValue, roundedValue);

        //convert integer to binary string
        String binaryStr = Integer.toBinaryString(intValue);

        //display results
        System.out.println("Sneaker cost Double value squared: " + squaredValue);
        System.out.println("sneaker cost Double value rounded: " + roundedValue);
        System.out.println("Square root of integer value - car cost: " + squareRoot);
        System.out.println("Maximum value of both inputs: " + maxValue);
        System.out.println("car cost Integer value in binary: " + binaryStr);

    }
}
