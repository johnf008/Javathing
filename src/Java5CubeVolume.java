//Name: ProgrammerJohn
//pgm desc:
///
import java.util.Scanner; //access Scanner class input methods
public class Java5CubeVolume {
    public static void main(String[] args)
    {
        int L, W, H, Vol;
        Scanner scIn = new Scanner(System.in);

        System.out.println("Enter the length: ");
        L = scIn.nextInt();

        System.out.println("Enter the Width: ");
        W = scIn.nextInt();

        System.out.println("Enter the height: ");
        H = scIn.nextInt();

        Vol = L*W*H;

        System.out.println(" The volume of your cube is : "+ Vol + " Cubic Units");
    }

}
