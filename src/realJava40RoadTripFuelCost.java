//name: John
//pgm desc: Calculate round trip cost to fuel
//
import java.util.*;
public class realJava40RoadTripFuelCost {
    public static void main(String [] args){
        Scanner sObj = new Scanner(System.in);

        System.out.print("Enter the destination miles: ");
        double miles = sObj.nextDouble();

        System.out.print("Enter the price per gallon: ");
        double pricePerGallon = sObj.nextDouble();

        System.out.print("Enter the miles per gallon: ");
        double MPG = sObj.nextDouble();

        double totalGallons =  miles / MPG;
        double fuelCost = totalGallons * pricePerGallon;

        double roundTrip = findFuel(fuelCost);

        System.out.println("Given " + miles + " miles and " + MPG + " mpg and "+ pricePerGallon + " price per gallon" + " then the " +
                "total fuel cost for the round trip is " + roundTrip );
    }

    public static double findFuel(double fuelCost) {
        double roundTrip = fuelCost * 2;
        return roundTrip;
    }
}
