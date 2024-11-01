//name: programmerJohn
//pgm desc: unscramble the code
import java.util.*;
public class java56Mystery {

    public int generateLicense() {
        Random ranObj = new Random();

        int ranNum = ranObj.nextInt(999999999);
        int DriversLicence = ranNum;
        return DriversLicence;
    }

    public static void main(String[] args) {
        Scanner sObj = new Scanner(System.in);
        String Name;

        ArrayList<String> nameList = new ArrayList<String>();

        ArrayList<Integer> licenceList = new ArrayList<Integer>();

        java56Mystery generateLicense = new java56Mystery();

        boolean active = true;

        while (active) {

            System.out.println("Enter a driver name");
            Name = sObj.nextLine();
            nameList.add(Name);

            int licenseNum = generateLicense.generateLicense();

            System.out.println("The returned license: " + licenseNum);
            licenceList.add(licenseNum);

            System.out.println(" ");



        }
    }
}