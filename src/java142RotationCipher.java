import java.lang.reflect.Array;
import java.util.*;
public class java142RotationCipher {
    public static void main(String[] args){
        Scanner scObj = new Scanner(System.in);

        int key = 0;
        String input = "";

        String finalWord = "";



        HashMap<Integer, String> alphabet = new HashMap<Integer, String>();


        System.out.println("Enter message: ");
        input = scObj.nextLine();

        char[] input_array = input.toCharArray();


        System.out.println("Enter key: ");
        key = scObj.nextInt();

        int value =0;

        for (char ch = 'a'; ch <= 'z'; ++ch) {
            alphabet.put(value, String.valueOf(ch));
            value += 1;
        }


        System.out.println(alphabet);

        int index = 0;
        String letter;

        String new_letter = "";

        int index_of_letter = 0;

        char real_letter = ' ';


        for(int i = 0; i < input_array.length; i++) {
            for (int index_of_alphabet = 0; index_of_alphabet <= alphabet.size(); index_of_alphabet++) {

                char letter_input = input_array[index_of_letter];


                letter = alphabet.get(index_of_alphabet);

                real_letter = letter.charAt(0);


                if((Character.toString(letter_input)).equals(" ")){
                    new_letter = " ";

                    finalWord = finalWord + new_letter;

                    index = 0;

                    index_of_letter += 1;

                    index_of_alphabet = 0;

                    break;
                }

                System.out.println("The letter in the alphabet is " + real_letter + " and the letter inside of the input is " + letter_input);

                if (real_letter == letter_input) {

                    index += key;

                    if(index > 25){
                        index = index - 26;
                    }

                    new_letter = alphabet.get(index);


                    System.out.println("New letter is: " + new_letter);


                    finalWord = finalWord + new_letter;

                    index = 0;

                    index_of_letter += 1;

                    index_of_alphabet = 0;

                    System.out.println("The index of the array in outer for loop is " + i);

                    break;

                } else {
                    index += 1;
                }


            }
        }
        System.out.println(finalWord);
    }
}
