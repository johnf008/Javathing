//name: programmerJohn
// pgm desc: Demonstrate the Insertion Sort Algorithm
public class java119InsertionSort {

    public static void insertionSort(int[] arr){
        int n = arr.length;

        for(int i = 1; i < n; i++){
            int key = arr[i];
            int j = i - 1;

            //move elements of arr[0...i-1] that are greater than
            //key to one position ahead of their current position
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j = j -1;
            }
            arr[j+1] = key;
        }
    }

    //utility method to print an array
    public static void printArray(int[] arr){
        for(int i: arr){
            System.out.println(i + " ");
        }
    }

    public static void main(String[]args){
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original array: ");
        printArray(arr);

        insertionSort(arr);

        System.out.println("Sorted Array: ");
        printArray(arr);
    }
}
