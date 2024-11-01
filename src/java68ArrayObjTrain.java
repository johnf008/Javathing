//name:ProgrammerJohn
//pgm desc: demonstrate creating and using an array of objects and enhanced for loop to traverse
//
import java.sql.SQLOutput;
import java.util.*;
class TrainCar {
    String company;
    String productUnit;
    boolean full;
    String contents;

    TrainCar(String n, String cf, boolean tf, String product){
        company = n;
        productUnit = cf;
        full = tf;
        contents = product;
    }

    public void setTrainCarStatus(boolean tf){
        full = tf;
    }
    public void setTrainCarContents(String product){
        contents = product;
    }
    public String getTrainInfo() {
        String companyInfo = this.company + " " + this.productUnit + " " + this.full + " " + this.contents;
        return companyInfo;
    }

}
public class java68ArrayObjTrain {
    public static void main(String[] args){
        int size = 20;
        TrainCar[] Train = new TrainCar[size];  //declaring array of traincar objects of certain size

        Scanner scObj = new Scanner(System.in);

            System.out.println("Enter Company: ");
            String company = scObj.nextLine();

            System.out.println("Enter Contents" );
            String contents = scObj.nextLine();

            System.out.println("Enter number of cars: ");
            int number = scObj.nextInt();

        //use a class constructor to initialize each newly declared array of elements
        Train[0] = new TrainCar("Burlenton Northern", "cubicFeet", true, "farm commodity");
        Train[1] = new TrainCar("SantaFe", "pounds", true, "manufacturing");
        Train[2] = new TrainCar("ExxonMobil", "Gallons", true, "petrol");
        Train[3] = new TrainCar("available", "cubicFeet", false, "unknown");

        int value = 0;
        int nextValueInLoop = 4;
        for(int y = 4; y < nextValueInLoop+number; y++){
            Train[y] = new TrainCar(company, "cubicFeet", true, contents);
            value = y;
        }
        int realValue = value + 1;

        //use traditional for loop to initialize remaining railcar objects
        for(int x = realValue; x < size; x++){
            Train[x] = new TrainCar("avaliable", "cubicFeet", false, "unKnown");

        }

        //use enhanced for loop to traverse and print array of traincar objects;
        //iterator variable temporarily holds references info to the current object in the array
        for(TrainCar TC: Train) {
            if (TC != null) {
                System.out.println("TrainCar: " + TC.getTrainInfo());
            }
        }

    }
}
