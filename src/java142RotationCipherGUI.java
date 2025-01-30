//name:programmerJohn
//pgm desc: create a gui for a shifting cipher
import java.awt.event.*;//access standard GUI widgets & components
import javax.swing.*;  //access extended gui widgets & components
import java.util.*;
public class java142RotationCipherGUI implements ActionListener{
    static JTextField entryField, keyField, outputField;
    static JFrame f;
    static JButton submitButton, resetButton;
    static JLabel label1, label2, label3;

    public static void main(String[] args){
        f = new JFrame("Rotational Cipher");

        submitButton = new JButton("Submit");
        resetButton = new JButton("Reset");

        java142RotationCipherGUI java142 = new java142RotationCipherGUI();
        submitButton.addActionListener(java142);
        resetButton.addActionListener(java142);

        label1 = new JLabel("Enter phrase");
        entryField = new JTextField("", 8);

        label3 = new JLabel("Enter key");
        keyField = new JTextField("", 8);

        label2 = new JLabel("Output");
        outputField = new JTextField("", 8);



        JPanel p = new JPanel();

        p.add(label1);
        p.add(entryField);


        p.add(label3);
        p.add(keyField);

        p.add(submitButton);

        p.add(label2);
        p.add(outputField);
        p.add(resetButton);

        f.add(p);

        f.setSize(500, 300);
        f.setVisible(true);


    }

    public void actionPerformed(ActionEvent e){
        String s = e.getActionCommand();

        if(s.equals("Submit")){
            int key = 0;
            String input = "";

            String finalWord = "";



            HashMap<Integer, String> alphabet = new HashMap<Integer, String>();


            System.out.println("Enter message: ");
            input = entryField.getText();

            char[] input_array = input.toCharArray();


            System.out.println("Enter key: ");
            key = Integer.parseInt(keyField.getText());

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
            outputField.setText(finalWord);
        }
        else if(s.equals("Reset")){
            entryField.setText("");
            keyField.setText("");
            outputField.setText("");
        }
    }
}
