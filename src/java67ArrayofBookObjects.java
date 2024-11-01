//name: John
//pgm desc: practice array of book objects
class Books{
    String title;
    String author;
}
public class java67ArrayofBookObjects {

        public static void main(String[] args){
        Books[] myBooks = new Books[3];
        int x = 0;
        //
        myBooks[0] = new Books(); //create books objects from class books
        myBooks[1] = new Books();
        myBooks[2] = new Books();
        //
        myBooks[0].title = "Angels & Demons";
        myBooks[0].author = "Dan Brown";
        myBooks[1].title = "Enemy of the State";
        myBooks[1].author = "Michael Creighton";
        myBooks[2].title = "Found";
        myBooks[2].author = "Erin Kinsley";
        //
        while( x < 3){
            System.out.println(myBooks[x].title);
            System.out.println("by ");
            System.out.println(myBooks[x].author);
            x = x+1;
        }
    }
}
