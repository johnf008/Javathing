//name: ProgrammerJohn
//pgm desc: Convert fluid measurements
//
import java.util.*;
public class java35covertPythonProgram
{
    public static void main(String[]args)
    {
        double literXRate = 3.79;
        int ounceXRate = 128;

        ArrayList<Double> gallon_Array = new ArrayList<Double>();
        ArrayList<Double> liters_Array = new ArrayList<Double>();
        ArrayList<Double> ounces_Array = new ArrayList<Double>();
        ArrayList<Double> all_List = new ArrayList<Double>();

        Scanner scIN = new Scanner(System.in);

        boolean play;
        while(true) {
            System.out.println("Enter a gallon amount or 'exit': ");
            String answer = scIN.nextLine();

            if (answer.equals("exit") || answer.equals("Exit"))
            {
                break;}
            double gallon = Integer.parseInt(answer);

            double liters = gallon * literXRate;
            double ounces = gallon * ounceXRate;

            System.out.println("Here is the conversion you asked for,");
            System.out.println("in " + gallon + " gallons");
            System.out.println("there are " + liters + " liters");
            System.out.println("and there are " + ounces + " ounces");

            //create lists from input and conversion values
            gallon_Array.add(gallon);
            liters_Array.add(liters);
            ounces_Array.add(ounces);

            all_List.add(gallon);
            all_List.add(liters);
            all_List.add(ounces);
        }
        //end of while loop
        System.out.println("Gallon Array: " + gallon_Array);
        System.out.println("Liters Array: " + liters_Array);
        System.out.println("Ounces Array: " + ounces_Array);
        System.out.println("All array: " + all_List);
    }
}
