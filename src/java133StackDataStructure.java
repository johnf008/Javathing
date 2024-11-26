//name: programmerJohn
//pgm desc: demonstrate using the built in stack data structure class from java library
import java.util.Stack;
import java.util.Scanner;

public class java133StackDataStructure {

    public static void main(String[] args){
        Scanner scObj = new Scanner(System.in);

        //create a stack of strings
        Stack <String> books = new Stack<>();

        //push elements unto the stack
        books.push("Da Vinci Code");
        books.push("State of Fear");
        books.push("The Last Symbol");
        books.push("Next");
        books.push("Inferno");

        //determine the size of the Stack
        int bookCount = books.size();

        System.out.println("The number of book is " + bookCount);

        //print the stack
        System.out.println("Stack of books: " + books);

        //Access the top element without removing it
        String topBook = books.peek();

        System.out.println("The book at the top of the Stack: " + topBook);

        //check if a particular book exists in the Stack; the search method return a positive # if
        System.out.println("Enter the title of a book: ");
        String popularBook = scObj.nextLine();
        //String popularBook = "Next";

        if(books.search(popularBook) > 0){
            System.out.println("Yes, the book " + popularBook + " is available");
        }
        else{
            System.out.println("Book not found but it will be added ");
            books.push(popularBook);
            System.out.println("Stack of books: " + books);
        }

        //if stack is not empty, pop elements from the stack; the stack employs a "Last in first out" system
        while( !(books.isEmpty())){
            String book = books.pop();

            System.out.println("Removed book: " + book);
        }
    }
}
