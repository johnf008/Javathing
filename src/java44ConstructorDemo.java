//name: programmerJohn
// pgm desc: Demonstrate use of Constructor to initialize an object's properties

import java.time.*;
class Appliance
{
    String modelName;
    int serialNum;
    LocalDate lastMaintenance;
    String function;
    boolean Astatus;

    //Constructor to initialize properties for each object created from class Appliance
    Appliance( String model, int sNum, LocalDate mDate, String fx, boolean stat){
        modelName = model;
        serialNum = sNum;
        lastMaintenance = mDate;
        function = fx;
        Astatus = stat;
    }
    void setStatus() {
        System.out.println("Home System Status " + modelName + "-" + function + Astatus);
    }
    void PerformOperation() {
        System.out.println("Home System " + modelName + " performs " + function);
    }
    void check4Maintenance() {
        System.out.println("Home System " + function + " lastMaintenance was " + lastMaintenance);
    }
}
public class java44ConstructorDemo {
    public static void main (String[] args){
        //Setup a date variable

        LocalDate Ldate = LocalDate.parse("2017-08-27");

        //create objects from the appliance class using a constructor to initialize the properties
        Appliance AW = new Appliance("EX_Solar", 55555, Ldate, "SolarElect" , true);
        Appliance AF = new Appliance("AR_Sentry", 99999, Ldate, "Alarm Sys", true);
        Appliance AA = new Appliance("AC_Tempurature", 77777, Ldate, "Temp Unit", true);

        AW.setStatus();
        AW.PerformOperation();
        AW.check4Maintenance();
        System.out.println("....");

        AF.setStatus();
        AF.PerformOperation();
        AF.check4Maintenance();
        System.out.println("...");

        AA.setStatus();
        AA.PerformOperation();
        AA.check4Maintenance();
    }
}
