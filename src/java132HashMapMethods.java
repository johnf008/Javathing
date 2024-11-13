//name: programmerJohn
//pgm desc: demonstrate setting up a HashMap (table) data structure and accessing it using its various methods
import java.util.HashMap;
import java.util.Map;         //use this library class method to iterate through the hashmap

public class java132HashMapMethods {
    public static void main(String[] args) {
        //create Hashmap
        HashMap<String, Double> QBratings = new HashMap<>();

        //add players and their averages as keys-values to the HashMap table
        QBratings.put("TomBrady", 97.1);
        QBratings.put("JoeMontana", 92.3);
        QBratings.put("PaytonManning", 96.5);
        QBratings.put("PatrickMahomes", 105.7);
        QBratings.put("AaronRodgers", 103.6);
        QBratings.put("DanMarino", 86.4);
        QBratings.put("BrettFavre", 86.0);
        QBratings.put("DrewBrees", 98.7);
        QBratings.put("RogerStaubach", 83.4);
        QBratings.put("SteveYoung", 96.8);

        //display the hashMap
        System.out.println("QB ratings: " + QBratings);

        //get the size of the HashMap
        System.out.println("\n number of QuarterBacks: " + QBratings.size());

        //accessing the key values using hte key data as an argument for the .get() method
        System.out.println("\nDanMarino's rating: " + QBratings.get("DanMarino"));

        //check if  a key exists providing the key as an argument in the .containsKey() method
        String QB = "JoeMontana";

        if(QBratings.containsKey(QB)){
            System.out.println(QB + " rating: " + QBratings.get(QB));
        }
        else{
            System.out.println(QB + " is not in the database");
        }

        //updating a value
        QBratings.put("TomBrady", 79.07);
        System.out.println("TomBrady's updated rating: " + QBratings.get("TomBrady"));

        //removing a key value pair or element providing the key as an argument in the .remove() method
        QBratings.remove("SteveYoung");

        //iterating through the hashmap
        System.out.println("\n all the QB and ratings");

        for(Map.Entry<String, Double> entry : QBratings.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


        //getting all the keys
        System.out.println("\n ALL QBs: " + QBratings.keySet());

        //getting all the values
        System.out.println("All ratings: " + QBratings.values());

        //getting size of the HashMap
        System.out.println("\n number of QuarterBacks: " + QBratings.size());

        //check if the hashmap is empty
        System.out.println("is the hashmap empty?" + QBratings.isEmpty());

        //clearing the hashmap
        QBratings.clear();
        System.out.println("\n After clearing: " + QBratings);
    }
}
//how on earth does git work ;-;