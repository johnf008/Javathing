//programmerJohn
//pgm desc: Demonstrate the selection sort algorithm
public class java118SelectionSort {

    public static void SelectSort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            int index = i;

            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[index]){
                    index = j;   //searching for lowest index
                }
            }
            //swap process
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }

    public static void main(String[] args){
        int[] arr1 = {9,14,3,72,43,55,112,85,22};

        System.out.println("Before selection sort");
        for(int i: arr1){
            System.out.print(i + " ");
        }
        System.out.println();

        SelectSort(arr1);    //send out array of numbers to be sorted

        System.out.println("After Sort");
        for(int x: arr1){
            System.out.print(x + " ");
        }
    }
}
