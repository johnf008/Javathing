//name:ProgrammerJohn
//pgm desc: Objects are created from class  book adn initialized with a constructor
//
import javax.imageio.plugins.tiff.BaselineTIFFTagSet;
import java.util.Scanner;

class Book
{
    String title;
    int bookNum;
    String author;

    Book(String Btitle, int Bnum, String Bauthor)      //constructor method which initializes objects created from class book
    {
        title = Btitle;
        bookNum = Bnum;
        author = Bauthor;
    }
    void checkIn(){ System.out.println("This book: " + title + " has now been checked in.");}

    void checkOut(){System.out.println("This book: " + title + " is being checked out. ");}

}
public class java39bookDriver
{
    public static void main(String[] args)
    {
        Scanner scObj = new Scanner(System.in);
        int bookNum;
        boolean active = true;
        Book b1 = new Book("Painted house", 123, "John Grisham");
        Book b2 = new Book("Angels & Demons", 456, "Dan Brown");
        Book b3 = new Book("last templar", 789, "Raymond Khoury");
        Book b4 = new Book("The Great Bridge", 805, "David mcCullough");

        while(active)
        {
            System.out.println("Welcome to X library  - please enter your book #: ");
            bookNum = scObj.nextInt();

            System.out.println("You entered: " + bookNum);

            if(bookNum == 123)
            {
                b1.checkOut();
                b1.checkIn();
            } else if (bookNum == 456)
            {
                b2.checkOut();
                b1.checkIn();
            } else if (bookNum==789)
            {
                b3.checkOut();
                b3.checkIn();
            } else if (bookNum==805)
            {
                b4.checkOut();
                b4.checkIn();
            }
            else
            {
                System.out.println("Invalid entry; please try again");
            }
        }


    }
}
