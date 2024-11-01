//programmerJohn
//demonstrate Merge sorting an array of objects

import java.util.Arrays;

//implementing the "Comparable" interface enables natural ordering of objects of class;
// the interface permits the objects of a class to compared to each other
class InventoryItem implements Comparable<InventoryItem>{

    private String name;
    private int quantity;

    public InventoryItem(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }

    public String getName(){
        return name;
    }

    public int getQuantity(){
        return quantity;
    }

    //the compareTo() method returns a negative integer is an object is considered less than the other object
    //it returns a zero if the objects are considered equal
    // a positive integer if this object is considered greater than the other object
    @Override
    public int compareTo(InventoryItem other){
        return Integer.compare(this.quantity, other.quantity);
    }

    @Override
    public String toString(){
        return name + " (Quantity: " + quantity + ")";
    }

}
public class java126MergeSortObjects {

    public static void mergeSort(InventoryItem[] arr){
        if (arr == null || arr.length <= 1){
            return;
        }

        int mid = arr.length / 2;
        InventoryItem[] left = Arrays.copyOfRange(arr, 0, mid);
        InventoryItem[] right = Arrays.copyOfRange(arr, mid, arr.length);

        mergeSort(left);
        mergeSort(right);

        merge(arr, left, right);
    }

    private static void merge(InventoryItem[] arr, InventoryItem[] left, InventoryItem[] right){

        int i = 0, j = 0, k = 0;

        while(i < left.length && j < right.length){
            //the comparison of objects will return an integer of -1, 0, or 1
            if(left[i].compareTo(right[j]) <= 0){
                arr[k++] = left[i++];
                }
             else{
                arr[k++] = right[j++];
            }
        }

        while(i < left.length){
            arr[k++] = left[i++];
        }

        while(j < right.length){
            arr[k++] = right[j++];
        }
    }

    public static void main(String[] args){
        InventoryItem[] inventory = {
                new InventoryItem("laptop", 50),
                new InventoryItem("samsungphone", 75),
                new InventoryItem("iphone", 100),
                new InventoryItem("googlephone", 40),
                new InventoryItem("Tablet", 30),
                new InventoryItem("Ipad", 60),
                new InventoryItem("airPods", 80),
                new InventoryItem("playstation5", 25)
        };

        System.out.println("Original inventory");
        printInventory(inventory);

        mergeSort(inventory);

        System.out.println("\nsorted inventory (by quantity): ");
        printInventory(inventory);
    }

    private static void printInventory(InventoryItem[] inventory){
        for(InventoryItem item : inventory){
            System.out.println(item);
        }
    }
}
