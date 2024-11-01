//programmer John
//pgm desc: create gui for wild card
import java.awt.event.*;
import javax.swing.*;

public class java75GUIWildCard extends JFrame implements ActionListener {

    //setup objects from widget classes
    static JTextField t,t2,t3;
    static JFrame f;
    static JButton b;
    static JLabel l;
    static JLabel l1;
    static JLabel l2;
    static JLabel l3;
    static JLabel l4;

    public static void main (String [] args){  //create objects from widget classes
        f = new JFrame("Wild Card GUI");

        l = new JLabel("");

        l1 = new JLabel("Month (1-12)");
        l2 = new JLabel("Day (Monday-Sunday)");
        l3 = new JLabel("Moon Status (True / False)");

        l4 = new JLabel("");

        b = new JButton("Find");
        //...
        java75GUIWildCard J75obj = new java75GUIWildCard();  //create object from java75 class

        b.addActionListener(J75obj);
        //..
        t = new JTextField("", 6);
        t2 = new JTextField("", 6);
        t3 = new JTextField("", 6);

        JPanel p = new JPanel();  //create p object from Jpanel class
        //add widgets to panel
        p.add(l1);
        p.add(t);

        p.add(l2);
        p.add(t2);

        p.add(l3);
        p.add(t3);


        p.add(b);

        p.add(l);
        p.add(l4);
        //add panel to frame
        f.add(p);

        f.setSize(500,300); //set frame dimension
        f.setVisible(true);  //obtain the event command from method

    }
    //if button is pressed, automatically execute the following method w/ parameter
    public void actionPerformed(ActionEvent e){

        String s = e.getActionCommand(); //obtain the event command from method

        if(s.equals("Find"))
        {
            int month = Integer.parseInt(t.getText());
            String weekday = t2.getText();
            boolean fullmoon = Boolean.parseBoolean(t3.getText());

            l.setText("You are playing Fizzbin during month " + month + ", on a " + weekday + ", with fullmoon = " + fullmoon);

            if (month % 2 == 0 && weekday.equalsIgnoreCase("Monday")){
                l4.setText("Wild card is Ace");

            }
            else if(month % 2 != 0 && fullmoon){
                l4.setText("Wild card is King");

            }
            else if (weekday.equals("Saturday") || weekday.equalsIgnoreCase("Sunday")){
                l4.setText("Wild card is Queen");

            }
            else if (month <= 3 || !fullmoon && weekday.equalsIgnoreCase("Wednesday")){
                l4.setText("Wild card is Jack");

            }
            else{
                l4.setText("Wild card is 2");
            }
        }
    }
}
