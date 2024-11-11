//name: programmerJohn
//pgm desc: practice using hashmaps
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
public class java131HashMapPassCodes {
    public static void main(String[] args){
        Scanner scObj = new Scanner(System.in);
        Random rand = new Random();

        String name;
        String gender;
        int number;

        HashMap<String, Integer> hmap = new HashMap<String, Integer>();

        for(int i = 0; i < 10; i++){
            System.out.println("Enter your name: ");
            name = scObj.nextLine();

            System.out.println("Select 'm' for male or 'f' for female: ");
            gender = scObj.nextLine();


            number = rand.nextInt(10000, 99999);


            if (gender.equals("m") && number % 2 == 0){
                number += 1;
            }
            else if(gender.equals("f") && number % 2 > 0 ){
                number += 1;
            }

            hmap.put(name, number);

        }
        hmap.forEach ( (k,v) -> System.out.println(k + " : " + v));

    }
}
