//name: programmerJohn
//pgm desc: using Swing GUI, input user name; generate random #; attach user name with # & display
import java.awt.event.*;//access standard GUI widgets & components
import javax.swing.*;  //access extended gui widgets & components
import java.util.*;
public class java73GUIGenerateUserID implements ActionListener{
    //setup objects from widget classes
    static JTextField ETFuser;  //entry text field for user name
    static JFrame f;
    static JButton b;
    static JLabel Lname, Lid;

    public static void main(String[]args){    //create objectrs from widdget classes
        f = new JFrame("create UserID");

        b= new JButton("create UserID");

        //.....

        java73GUIGenerateUserID Jobj = new java73GUIGenerateUserID();   //create object from "Java73" class

        b.addActionListener(Jobj);   //enable action Listener event method to button w/J77obj
        //...

        Lname = new JLabel("name");
        Lid = new JLabel("User###");

        ETFuser = new JTextField("name", 8);   //create entry text field object for name

        JPanel p = new JPanel();   //create p object from JPanel class

        //add widgets to the panel
        p.add(ETFuser);
        p.add(b);
        p.add(Lname);
        p.add(Lid);

        //add panel to
        f.add(p);

        f.setSize(500,300);  //set frame dimensions
        f.setVisible(true); //make frame visible



    }
    public void actionPerformed(ActionEvent e){
        String s = e.getActionCommand(); //obtain event command (button text) using method

        if(s.equals("create UserID")){
            String userID = ETFuser.getText();   //get name input from entry field
            Random ranObj = new Random();

            int rNum = ranObj.nextInt(9999);

            userID = userID + rNum;

            Lid.setText(userID);
        }

    }
}
