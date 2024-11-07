//name: programmerJohn
//pgm desc: practice using the hashmap data structure
import java.util.*;
public class java130HashMap {
    public static void main(String[] args) {
        //create empty hashmap by creating object of String & Integer type from HashMap class
        HashMap<String, Integer> hmap = new HashMap<String, Integer>();

        //add elements using put() method
        hmap.put("Albert", 12345);
        hmap.put("Asia", 67892);
        hmap.put("Owen", 65438);
        hmap.put("Juan", 98765);
        hmap.put("Jocelyn", 87654);
        hmap.put("Isaac", 65432);
        hmap.put("Zach", 128765);
        hmap.put("Emma", 56473);
        hmap.put("Sam", 98896);
        hmap.put("Aaron", 34216);

        System.out.println("The size of the map " +hmap.size());
        System.out.println(hmap);

        String user = "jon";

        //print the key and value if the key is present
        if( hmap.containsKey(user)){
            Integer id = hmap.get(user);
            System.out.println("The value for " + user + " is " + id);
        }
        //use .forEach() method with lambda expression
        hmap.forEach ( (k,v) -> System.out.println(k + " : " + v));
    }
}