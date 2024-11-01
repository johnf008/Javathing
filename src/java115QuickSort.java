//programmerJohn
//pgm desc: Demonstrate use of the quick sort algorithm
import java.util.Random;
public class java115QuickSort {

    private static void printArray(int[] numbers) {
        System.out.println("Inside print method");
        for (int x : numbers) {
            System.out.println(x);
        }
    }

        //sorting method will sort initial array then recursively sort sub arrays with range info
        private static void Qsort(int[] numbers, int lowNdex, int highNdex){

            if( lowNdex >= highNdex){
                return;
            }
            //int pivot = numbers[highNdex];
            //int leftPointer = numbers[lowNdex];
            //int rightPointer = numbers[highNdex];

            //double loop will serve to traverse the leftpointer from left to right of the array; portioning array
            int pivot = highNdex;
            int leftPointer = lowNdex;
            int rightPointer = highNdex;

            while(leftPointer < rightPointer){

                while(numbers[leftPointer] <= numbers[pivot] && leftPointer < rightPointer){
                    leftPointer++;       //traverse pointer to the right of the array
                }

                while(numbers[rightPointer] >= numbers[pivot] && leftPointer < rightPointer){
                    rightPointer--;    //traverse pointer to the left of the array
                }
                swap(numbers,leftPointer, rightPointer);

                System.out.println("Inside Qsort");
            }

            swap(numbers,leftPointer,highNdex);

            Qsort(numbers, lowNdex, leftPointer - 1);   //recursive call leftsubarray partition
            Qsort(numbers, leftPointer + 1, highNdex); //recursive call rightsubarray partition

        }
        private static void swap(int[] array, int Ndex1, int Ndex2){
            int temp = array[Ndex1];
            array[Ndex1] = array[Ndex2];
            array[Ndex2] = temp;

            System.out.println("Inside swap method");
        }

        public static void main(String[] args){
        int[] nums = new int[20];

        Random rand = new Random();

        for(int x = 0; x < nums.length; x++){
            nums[x] = rand.nextInt(100);
        }

        System.out.println("Before array Qsort");
        printArray(nums);

        Qsort(nums, 0, nums.length - 1);

        System.out.println("After array Qsort");
        printArray(nums);
        }
    }

