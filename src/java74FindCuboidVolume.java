//programmer John
//pgm desc: calculate the volume of cuboid with 3 inputs
import java.awt.event.*;
import javax.swing.*;

public class java74FindCuboidVolume extends JFrame implements ActionListener {

    //setup objects from widget classes
    static JTextField t,t2,t3;
    static JFrame f;
    static JButton b;
    static JLabel l; //setup 3 buttons
    static JLabel l1;
    static JLabel l2;
    static JLabel l3;

    public static void main (String [] args){  //create objects from widget classes
        f = new JFrame("Find Cuboid Volume");

        l = new JLabel("");

        l1 = new JLabel("Length");
        l2 = new JLabel("Width");
        l3 = new JLabel("Height");

        b = new JButton("Calculate");
        //...
        java74FindCuboidVolume J74obj = new java74FindCuboidVolume();  //create object from java74 class

        b.addActionListener(J74obj);  //enable actionListener event method to button w/ j74obj
        //..
        t = new JTextField("", 6);  //create length textfield object
        t2 = new JTextField("", 6);  //create width textfield object
        t3 = new JTextField("", 6); //create height texrtfield object

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
        //add panel to frame
        f.add(p);

        f.setSize(500,300); //set frame dimension
        f.setVisible(true);  //obtain the event command from method

    }
    //if button is pressed, automatically execute the following method w/ parameter
    public void actionPerformed(ActionEvent e){

        String s = e.getActionCommand(); //obtain the event command from method

        if(s.equals("Calculate"))
        {
            int len = Integer.parseInt(t.getText());  //get length input
            int wid = Integer.parseInt(t2.getText()); //get width input
            int height = Integer.parseInt(t3.getText());   //get height input

            int volume = len * wid * height;

            String vol = Integer.toString(volume);

            String full = vol + " volume";
            l.setText(full);
        }
    }
}
