//name:programmerJohn
//pgm desc: make a gui of java 78
//
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
public class java79GUIofjava78 extends JFrame implements ActionListener {

    static JLabel l1,l2,l3,l4,l5;
    static JTextField t1,t2;
    static JFrame f;
    static JButton b;
    public static String randomAnimal;

    public static void main(String[] args){
        java79GUIofjava78 j79 = new java79GUIofjava78();

        f = new JFrame("Animal Guessing Game");

        l1 = new JLabel("Guess");
        t1 = new JTextField("", 20);

        l2 = new JLabel("dog, cat, rabbit, panda, zebra, meerkat");

        b = new JButton("Submit");
        b.addActionListener(j79);

        l3 = new JLabel("5");
        l3.setVisible(false);

        l5 = new JLabel("You have 5 guesses");
        l4 = new JLabel("Message");
        t2 = new JTextField("Good luck", 22);

        JPanel p = new JPanel();

        p.add(l1);
        p.add(t1);

        p.add(l2);

        p.add(b);

        p.add(l3);
        p.add(l5);


        p.add(t2);
        p.add(l4);

        f.add(p);
        f.setSize(350,500);
        f.setVisible(true);

        String animals[] = {"dog", "cat", "rabbit", "panda", "zebra", "meerkat"};
        //list animal
        Random random = new Random();

        int length = random.nextInt(animals.length) ;

        //pick random animal
        randomAnimal = animals[length];

    }

    public void actionPerformed(ActionEvent e){
        String s = e.getActionCommand();
        if(s.equals("Submit")){
            int guesses = Integer.parseInt(l3.getText());

            if(guesses > 0){
                String guess = t1.getText();
                guess = guess.toLowerCase();

                if(guess.equals(randomAnimal)){
                    t2.setText("You guesses the correct animal: " + randomAnimal);
                }
                else{
                    if(guesses > 0){
                        guesses -=1;
                        if(randomAnimal.charAt(0) == guess.charAt(0)){
                            t2.setText("Starts with the same letter");
                        }
                        else{
                            t2.setText("Try again");
                        }
                    }

                }
            }

            if(guesses == 0){
                t2.setText("Out of guesses. Correct Animal: " + randomAnimal);
            }

            l3.setText(Integer.toString(guesses));
            l5.setText("You have " + guesses + " guesses");
        }
    }



}
