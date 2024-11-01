//name: programmerJohn
//pgm desc: sort array, find sum, find min, find max

import java.util.Arrays;
import java.util.Random;

public class java101 {
    public static void main(String[] args) {

        int e = 100;
        int[] ray = {956, 214, 713, 972, 817};
        int[] ray2 = new int[e];
        int sum = 0;
        Random rand = new Random();


        for (int i = 0; i < e; i++){
            ray2[i] = rand.nextInt(1000);

        }

        int a1 = ray.length;
        int b1 = ray2.length;

        int c1 = a1 + b1;

        int[] c = new int[c1];

        System.arraycopy(ray, 0, c, 0, a1);
        System.arraycopy(ray2, 0, c, a1, b1);

        System.out.println("array before sorting");
        for (int iv : c){
            System.out.println(iv);
        }

        Arrays.sort(c);

        System.out.println("Array after sorting");

        for(int iv: c){
            System.out.println(iv);
        }

        for(int iv: c){
            sum = iv + sum;
        }
        System.out.println("Array total sum: " + sum);

        System.out.println("Min: ");
        System.out.println(c[0]);

        System.out.println("Max: ");
        System.out.println(c[c.length - 1]);
    }
}