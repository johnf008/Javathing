//programmerJohn
//pgm desc: demonstrate recursion by reversing a user string
import java.util.Scanner;
public class java106ReverseSentence {
    public static String reverse_sentence(String str){
        //check if str is empty
        if (str.isEmpty()){
            return str;
        }
        else{   //extract the character at 0th index known as the character at beginning
            char ch = str.charAt(0);
            //append character extracted at the end & pass the remaining string to the function
            String reversing = reverse_sentence(str.substring(1)) + ch;
            return reversing;
        }
    }
    public static void main(String[] args){
        Scanner scObj = new Scanner(System.in);

        while(1 == 1) {

            System.out.println("Enter a sentence to be reversed: ");
            String str = scObj.nextLine();

            //initial calling of method to reverse the string
            String rev_str = reverse_sentence(str);

            System.out.println("Original sentence: " + str);
            System.out.println("Sentence in reverse form: " + rev_str);
        }
    }
}
