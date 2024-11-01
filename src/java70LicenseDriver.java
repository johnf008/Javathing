//name: programmerJohn
//pgm desc: Generate the user's license plate #

import java.util.*;     //to access Scanner & Random class methods

class driversLicense2{
    String licenseId;
    String driverName;
    String state;

    public int generateLicense()
    {
        int randomNum = 0;
        Random ranObj = new Random();

        randomNum = ranObj.nextInt(9999);
        return randomNum;
    }

    public String generateRandomLetters()
    {
        Random rObj = new Random();
        String abcLetters = "abcdefghijklmnopqrstuvwxyz";

        System.out.println("Generate random letters");

        char l1 = (char) (rObj.nextInt(26) + 'a');
        char l2 = (char) (rObj.nextInt(26) + 'a');
        char l3 = (char) (rObj.nextInt(26) + 'a');
        char l4 = (char) (rObj.nextInt(26) + 'a');

        String randomLetter = Character.toString(l1) + Character.toString(l2) + Character.toString(l3) + Character.toString(l4);
        return randomLetter;
    }

    public String generateFullPlate(int rNum, String randomLetters){
        System.out.println("Concatenate #s and letters to form full plate");

        String licenseId = rNum + "*" + randomLetters;

        return licenseId;
    }
}
public class java70LicenseDriver {
    public static void main(String [] args){
        boolean active = true;
        String dName;
        int dLicense;

        Scanner Input = new Scanner(System.in);

        ArrayList<String> nameList = new ArrayList<String>();
        ArrayList<Integer> licenseList = new ArrayList<Integer>();

        driversLicense2 dL = new driversLicense2();

        while (active) {
            System.out.println("Enter a driver name: ");
            dName = Input.nextLine();

            nameList.add(dName);

            String letters = dL.generateRandomLetters();

            dLicense = dL.generateLicense();

            String fullPlate = dL.generateFullPlate(dLicense, letters);

            System.out.println(" The returned licenseID : " + dLicense);

            System.out.println("The full license plate: " + fullPlate);

            licenseList.add(dLicense);
        }
    }
}
