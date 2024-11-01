//name: programmerJohn
//pgm desc: demonstrate Tower of Hanoi using recursion
import java.io.*;
import java.math.*;
import java.util.*;
public class java108RecursionTower {
    static void towerOfHanoi(int n, char Arod, char Crod, char auxRod){
        if (n == 0){
            return; //leaver recursion
        }
        towerOfHanoi(n-1, Arod, auxRod, Crod);

        System.out.println("Move disk " + n + " from rod "
                            + Arod + " to rod " + Crod);
        towerOfHanoi(n - 1, auxRod, Crod, Arod);
    }
    public static void main(String[] args){
        int N = 3; //number of disks to be moved
        //A, B, C are the names of the rods
        towerOfHanoi(N, 'A', 'C', 'B');
    }
}
