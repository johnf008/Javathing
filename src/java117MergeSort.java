//name: programmerJohn
//pgm desc: Utilize merge sort to sort an array
import java.util.Random;
public class java117MergeSort {
    private static void printArray(int[] numsArray){

        for(int x = 0; x < numsArray.length; x++){
            System.out.println(numsArray[x]);
        }
    }
    //combine the leftHalf and rightHalf arrays
    private static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf){
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0, j = 0, k =0;   //set iterators for left, right and original arrays

        while( i < leftSize && j < rightSize){
            if(leftHalf[i] <= rightHalf[j]){
                inputArray[k] = leftHalf[i];
                i++;
            }
            else{
                inputArray[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        while( i < leftSize){
            inputArray[k] = leftHalf[i];
            i++;
            k++;
        }
        while(j < rightSize){
            inputArray[k] = rightHalf[j];
            j++;
            k++;
        }
    }
    public static void main(String [] args){

        int[] Rnums = new int[100];

        Random rObj = new Random();

        for(int i = 0; i < Rnums.length; i++){
            int rand = rObj.nextInt(1000000);

            Rnums[i] = rand;
        }

        System.out.println("Before Sort");
        printArray(Rnums);

        mergeSort(Rnums);

        System.out.println("After sort");

        printArray(Rnums);
    }

    private static void mergeSort(int[] inputArray){
        int arrayLength = inputArray.length;

        if(arrayLength < 2){
            return;
        }

        int midIndex = arrayLength / 2;

        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[arrayLength - midIndex];

        for(int i = 0; i < midIndex; i++){   //populate leftHalf starting at beginning and only go to the middle of original
            leftHalf[i] = inputArray[i];
        }

        for(int i = midIndex; i < arrayLength; i++){  //populate right half starting in middle until reaching the end of original
            rightHalf[i - midIndex] = inputArray[i];
        }

        mergeSort(leftHalf);   //recursive call
        mergeSort(rightHalf); //recursive call

        merge(inputArray, leftHalf, rightHalf);  //combine
    }
}

