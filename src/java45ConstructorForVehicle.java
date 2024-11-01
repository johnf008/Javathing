//name: John
//pgm desc: Set up a constructor for the class Vehicle
class Vehicle{
    int wheels;
    int speed;
    int time;
    String type;
    //

    Vehicle (int w, String t, int s)  //constructor to initialize instance variables
    {
        wheels = w;
        type = t;
        speed = s;
    }
    //
    int getTime(int distance)   //method to calc time to cover distance
    {
        time = distance / speed;
        System.out.println("Vehicle: " + type + " time to cover distance: " + time);
        return time;
    }
}
//
public class java45ConstructorForVehicle {
    public static void main (String [] args){
        int T;

        Vehicle v1 = new Vehicle(2, "mcycle", 120);
        T = v1.getTime(2500);
        System.out.println("The elapsed travel time: " + v1.type + T);
        //
        Vehicle v2 = new Vehicle(4, "car", 160);
        v2.getTime(2500);
        //
        Vehicle v3 = new Vehicle(18, "truck", 80);
        v3.getTime(2500);
        //

    }
}
