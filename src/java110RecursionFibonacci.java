//name: John
//pgm desc: demonstrate Fibonacci sequence using recursion
import java.io.*;
public class java110RecursionFibonacci {
    public static void main(String[] args){

        int n = 10;
        System.out.println("The " + n + " nth number in the Fibonacci sequence is: " + Fib(n));
    }
    private static int Fib(int n){
        if (n <= 1){
            return n;
        }
        //recursion call
        return (Fib(n-1) + Fib(n-2));
    }
}
