//programmerJohn
//pgm descL demonstrate the algorithm of bubble sort to sort an array of integers

import java.util.ArrayList;
import java.util.Random;
public class java111BubbleSortOne {
    static void setupArray(ArrayList<Integer> Nums){
        Random rNum = new Random();

        for (int i = 0; i< 10; i++){
            int rand = rNum.nextInt(100);
            Nums.add(i, rand);
        }
    }

    static void swap (ArrayList<Integer> N, int ndex){
        int small, big;

        small = N.get(ndex + 1);

        big = N.get(ndex);

        N.set(ndex, small);
        N.set((1 + ndex), big);
    }


    public static void main(String[] main){
        int size = 10;
        ArrayList<Integer> Numbers = new ArrayList<Integer>();

        setupArray(Numbers);
        System.out.println("The array of unsorted numbers: ");
        for(int z: Numbers)
        {
            System.out.println(z);
        }

        int y = 0;

        for (int x = 1; x < Numbers.size(); x++){

            for (y = 0; y < Numbers.size() - 1; y++){

                if (Numbers.get(y) > Numbers.get(y + 1)){
                    swap(Numbers, y);
                }
            }
        }
        System.out.println("The array of sorted numbers: ");

        System.out.println(Numbers);
        for (int z: Numbers){
            System.out.println(z);
        }
    }
}
