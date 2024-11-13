//name: programmerJohn
//pgm desc: demonstrate setting up a HashMap (table) data structure and accessing it using its various methods
import java.util.HashMap;
import java.util.Map;         //use this library class method to iterate through the hashmap
import java.util.Scanner;

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

        boolean play = true;
        Scanner scObj = new Scanner(System.in);
        String answer = new String();

        while (play) {

            //display the hashMap
            System.out.println("QB ratings: " + QBratings);
            String choice = "";
            Double score = 0.0;

            System.out.println("Choose: 'add' 'update' 'find' 'remove' 'display all' 'clear all'");
            answer = scObj.nextLine();
            answer.toLowerCase();

            if (answer.equals("add")){
                System.out.println("Type who you want to add: ");
                choice = scObj.nextLine();

                System.out.println("Type the score of the player " + choice);
                score = scObj.nextDouble();

                QBratings.put(choice, score);

                scObj.nextLine();

            }
            else if(answer.equals("update")){
                System.out.println("Type the player's score you want to update you want to update: ");
                choice = scObj.nextLine();

                System.out.println("Enter the updated score: ");
                score = scObj.nextDouble();

                QBratings.put(choice, score);

                scObj.nextLine();

            }
            else if (answer.equals("find")){
                System.out.println("Choose the person you want to see if they're in the database: ");
                choice = scObj.nextLine();

                if(QBratings.containsKey(choice)){
                    System.out.println(choice + " has a rating of: " + QBratings.get(choice));

                }
                else{
                    System.out.println(choice + " isn't in the database");
                }
                continue;
            }
            else if (answer.equals("remove")){
                System.out.println("Choose the player you want to remove: ");

                choice = scObj.nextLine();
                QBratings.remove(choice);

                continue;
            }
            else if (answer.equals("display all")){
                for(Map.Entry<String, Double> entry : QBratings.entrySet()){
                    System.out.println(entry.getKey() + " : " + entry.getValue());
                }

                scObj.nextLine();

                continue;
            }
            else if (answer.equals("clear all")){
                QBratings.clear();
                System.out.println("After clearing: " + QBratings);

                scObj.nextLine();

                continue;
            }
            else{
                System.out.println("Not an option");
            }
        }
    }
}
//how on earth does git work ;-;