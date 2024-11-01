//name: programmerJohn
//pgm desc: demonstrate Recursion algorithm to make repeated calls to the same method within the same method
// however, do not include an escape condition which results in a "stack overflow error"
public class java103 {
    public static void whatsUp() {
        System.out.println("What's up");
        whatsUp();
    }
    public static void main(String[]args){
        whatsUp();
    }
}
