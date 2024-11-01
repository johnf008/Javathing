//name: John Flores
//pgm desc: Print triangle made of stars
import java.util.*;
public class java102 {
    public static void printInvertTriangle(int n, int i){
        //exit condition
        if(n < 1) {
            return;
        }

        if (i <= n){

            System.out.print("* ");

            //recursive call to print remaining stars
            printInvertTriangle(n,i + 1);
        }
        else{

            //next line
            System.out.println();

            //recursive call to print stars in remaining rows
            printInvertTriangle(n - 1, 1);
        }

    }
    public static void main(String[] args){
        Scanner scObj = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int n = scObj.nextInt();

        printInvertTriangle(n, 1);

    }
}
