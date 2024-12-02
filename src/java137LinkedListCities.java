//name: programmerJohn
//pgm desc: demo use prebuilt linked list library
import java.util.LinkedList;
public class java137LinkedListCities {
    public static void main(String[] args){

        LinkedList citiesList = new LinkedList();

        //adding to linked list
        citiesList.add("austin");
        citiesList.addFirst("bakersfield");
        citiesList.addLast("houston");
        citiesList.add(2, "dallas");
        citiesList.add("boulder");
        System.out.println("Adding to linked list: ");
        System.out.println(citiesList);

        //accessing Linked List items
        System.out.println("Accessing linked list");
        System.out.println(citiesList.get(2));
        System.out.println(citiesList.getLast());
        System.out.println(citiesList.contains("austin"));

        //deleting from the Linked List
        System.out.println("Linked list after deletions");
        citiesList.remove();
        citiesList.remove(2);
        citiesList.removeLast();
        System.out.println(citiesList);
        citiesList.remove("dallas");
        System.out.println(citiesList);
    }
}
