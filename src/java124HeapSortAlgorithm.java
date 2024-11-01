//name: programmerJohn
//pgm desc: demonstrate the Heap Sort algorithm
public class java124HeapSortAlgorithm {

    public void sort(int[] arr){
        int n = arr.length;

        //build max heap
        for(int i = n / 2-1; i >= 0; i--){
            heapify(arr,n,i);
        }
        //extract elements from heap 1 by 1
        for(int i = n-1; i > 0; i--){
            //move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;


            //heapify the reduced heap
            heapify(arr,i,0);
        }
    }
    private void heapify(int[] arr, int n, int i){
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        //if left child is larger than root
        if(left < n && arr[left] > arr[largest]){
            largest = left;
        }

        if(right < n && arr[right] > arr[largest]){
            largest = right;
        }
        //if largest is not root
        if(largest != i){
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            //Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }
    public void printArray(int[] arr){
        for(int i: arr){
            System.out.print(String.format("%,d", i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] arr = {176232345, 871234571, 14598643, 324578655, 123854326, 79753689};

        java124HeapSortAlgorithm heapSort = new java124HeapSortAlgorithm();

        System.out.println("Original array: ");
        heapSort.printArray(arr);

        heapSort.sort(arr);

        System.out.println("Sorted array: ");
        heapSort.printArray(arr);
    }
}
