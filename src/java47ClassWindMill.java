//name:John Flores
//pgm desc: Set up a class windMill
//
import java.util.*;

class windmill {
    String Coordinates;
    int outputKW;
    String Id;
    boolean powerStatus;

    windmill (String coord, int kw, String id, boolean ps ) //constructor to initialize each windmill
    {
        Coordinates = coord;
        outputKW = kw;
        Id = id;
        powerStatus = ps;
    }

    public void setPower (boolean power)
    {
        String status;

        if (power)
            status = "ON";
        else status = "OFF";

        System.out.println("Setting power " + status + " to windmill# " + Id + " at location " + Coordinates);
    }
    public int getKW(){
        Random rand = new Random();
        int KWreading;

        KWreading = rand.nextInt(999999);
        return KWreading;
    }
} //end of blueprint
public class java47ClassWindMill {
    public static void main(String [] args){
        int KWoutput;
        ArrayList<Integer> wmKWreadings = new ArrayList<Integer>();

        windmill wm1 = new windmill("address", 0, "rgv1", false); //create objects from class windmill blueprint
        windmill wm2 = new windmill("address", 0, "rgv2", false);

        wm1.setPower(true);
        wm2.setPower(true);

        KWoutput = wm1.getKW();
        System.out.println("The KW output for " + wm1.Id + " is " + KWoutput);
        wmKWreadings.add(KWoutput);   //add KW reading to Array List

        KWoutput = wm2.getKW();
        System.out.println("The KW output for " + wm2.Id + " is " + KWoutput);
        wmKWreadings.add(KWoutput);    //add KW reading to Array List

        wm1.setPower(false);
        wm2.setPower(false);

        for(int k: wmKWreadings){
            System.out.println("The KW reading log: " + k);
        }

    }
}
