//ProgrammerJohn
//Pgm desc - Input odd numbers into an odd array, and even numbers into an even array.
import java.util.Scanner;
public class Java6Scanner2 {
    public static void main(String[] args){

        int evenCount = 0, oddCount = 0, num = 0, rem = 0, size = 5;
        int[] evenArray = new int[size];
        int[] oddArray = new int[size];
        boolean play = true;
        String answer;

        Scanner sObj = new Scanner(System.in);

        while (play){
            System.out.println("Enter a number: ");
            num = sObj.nextInt();
            rem = num%2;                      //divide by 2 and store remainder

            if (rem == 0)                  //remainder is 0 thus we have even #
            {

                evenArray[evenCount] = num;
                evenCount++;
                if(evenCount == size)
                    play = false;
            }
            else
            {

                oddArray[oddCount] = num;
                oddCount++;
                if(oddCount == size)
                    play = false;
            }
        }
        ///......outside of the sloop

        System.out.println("Array details follow: ");

        //use enhance for loop to access and print out each element in the arrays
        for(int x: evenArray){
            System.out.println("evenArray element: " + x);
        }

        for(int y : oddArray){
            System.out.println("oddArray element: " + y);

        }
    }

}
