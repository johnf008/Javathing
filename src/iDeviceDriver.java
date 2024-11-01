//Name: John
//pgm desc: This program sets up a class of home wifi  enabled devices; objects are created
//                           in order to control setting
class iDevice                     //IOT- Internet of Things - wifi enabled devices
{
    String model;            // instance variables or attributes of an IOT device
    boolean status;

    void setStatus(boolean value)                      //method to set status on device
    {
        status = value;
        System.out.println(" The status of " + model + " is now " + status);
    }
}
public class iDeviceDriver
{
    public static void main(String[]args)
    {
        System.out.println("Device Mgmt System");

        iDevice fridge = new iDevice();  //create object fridge from class iDevice
        fridge.model = "MayTag2400";           //initialize model name for object fridge
        fridge.setStatus(true);             //call/invoke setStatus method for object

        iDevice AirCon = new iDevice();
        AirCon.model = "AC Rheem1200";
        AirCon.setStatus(false);

        iDevice elights = new iDevice();
        elights.model = "EverLites500";
        elights.setStatus(true);
    }
}
