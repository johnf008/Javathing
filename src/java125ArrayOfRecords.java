//name:programmerJohn
//pgm desc: demonstrate creating 1 million inventory records
import java.util.Random;

class InventoryRecord{
    String id;
    String name;
    int quantity;
    double price;

    //constructor to initialize objects created from class
    public InventoryRecord(String id, String name, int quantity, double price){
        this.id = id;
        this.name = name;
        this.quantity =quantity;
        this.price = price;
    }
}
public class java125ArrayOfRecords {
    public static void main(String[] args){
        int numRecords = 1000000;

        //create an array of class InventoryRecords
        InventoryRecord[] inventoryRecords = new InventoryRecord[numRecords];

        generateInventoryRecords(inventoryRecords);

        //sort the records later as needed

    }

    public static void generateInventoryRecords(InventoryRecord[] inventory){
        Random random = new Random();

        for(int i = 0; i < inventory.length; i++){
            String id = "ID" + (i + 1);
            String name = "Item" + random.nextInt(10000);
            int quantity = random.nextInt(1000) + 1; //quantity between 1 and 1000

            double price = Math.round(random.nextDouble() * 100 * 100.0) / 100.0; //price between 0.000 and 100.0

            //setup and initialize with constructor each object record
            inventory[i] = new InventoryRecord(id,name,quantity,price);

            //prepare for printing
            String iRecord = inventory[i].id + inventory[i].name +
                    inventory[i].quantity + "$" + inventory[i].price;
            System.out.println("InventoryRecord: " + i + " " + iRecord);
        }
    }
}
