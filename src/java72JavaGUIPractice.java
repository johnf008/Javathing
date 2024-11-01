//name: programmerJohn
//pgm desc: Demonstrate creating a GUI with widgets from Java Swing class

import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class java72JavaGUIPractice extends JFrame implements ActionListener {

    //setup standalone reference variables from widget classes
    static JTextField t;
    static JFrame f;
    static JButton b; //setup button
    static JLabel l;

    public static void main(String[] args){
        //create objects from widget classes
        f = new JFrame("Random#Generator");
        l = new JLabel("Press the button to generate random #");
        b = new JButton("generate");

        //..............
        java72JavaGUIPractice Jobj = new java72JavaGUIPractice();  //create object from java9gui class

        b.addActionListener(Jobj);   //enable actionListener event method to button w j9 object
        //......
        t = new JTextField(" ", 5);   //create text field object using 5 cols

        JPanel p = new JPanel();    //create p object from Jpanel class
        //add widget to the panel
        p.add(l);
        p.add(b);
        p.add(t);
        //add panel to frame
        f.add(p);

        f.setSize(400,300);  //set frame dimensions
        f.setVisible(true);  //make frame visible

    }
    //if button is pressed, automatically invoke the following method with noted parameter
    public void actionPerformed(ActionEvent e){
        String s = e.getActionCommand();   //obtain the event command from the mthod

        if (s.equals("generate")){
            Random rObj = new Random();
            int rNum = rObj.nextInt(999);

            String randNUm = Integer.toString(rNum);

            String randNum = Integer.toString(rNum);
            //set the text of the field to the random #
            t.setText(randNum);
        }
    }
}

