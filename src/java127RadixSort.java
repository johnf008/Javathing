//name: programmerJohn
//pgm desc: use radix sort to sort an array
import java.util.Arrays;
public class java127RadixSort {

    //method to get maximum value in array
    public static int getMax(int[] arr, int n){
        int max = arr[0];

        for(int i = 1; i < n; i++){

            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    //method to perform counting sort based on the digit represented by exp
    public static void countSort(int[] arr, int n, int exp){
        int[] output = new int[n];
        int[] count = new int[10];
        Arrays.fill(count,0);

        //store count of occurrences in count[] array
        for(int i = 0; i < n; i++){
            count[(arr[i] / exp) % 10]++;
        }
        //change count[i] so that it contains the actual position of this digit in output[] array
        for(int i = 1; i < 10; i++){
            count[i] += count[i - 1];
        }

        //build the output array

        for(int i = n - 1; i >= 0; i--){
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];

            count[(arr[i] / exp) % 10]--;
        }

        //copy the output array to arr[], so that arr[] contains sorted numbers according to current digit
        System.arraycopy(output, 0, arr, 0, n);
    }

    //main standalone method to sort an array using Radix sort
    public static void radixSort(int[] arr, int n){
        int max = getMax(arr,n);

        //perform counting sort for every digit
        for(int exp = 1; max / exp > 0; exp *= 10){
            countSort(arr, n, exp);
        }
    }

    //utility method to print an array
    public static void printArray(int[] arr, int n){
        for(int j : arr){
            System.out.print(j + " ");
        }
    }

    public static void main(String[] args){
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};

        int n = arr.length;
        radixSort(arr,n);
        printArray(arr, n);
    }
}
