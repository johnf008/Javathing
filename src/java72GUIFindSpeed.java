import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//name: ProgrammerJohn
//pgm desc: practice guis
public class java72GUIFindSpeed extends JFrame implements ActionListener {
    //setup objects from widget classes
    static JTextField txDistance, txTime, txSpeed;
    static JFrame f;
    static JButton bCalc;   //setup 1 button
    static JLabel lSpeed;

    public static void main(String[] args){   //create objects from widget classes
        f = new JFrame("Find Speed given distance and time");
        lSpeed = new JLabel("speed (m/h)");
        bCalc = new JButton("calc Speed");

        //....
        java72GUIFindSpeed J72obj = new java72GUIFindSpeed(); //create object from J72GUI

        bCalc.addActionListener(J72obj);
        //........
        txDistance = new JTextField("distance", 8); //create distance textfield object
        txTime = new JTextField("time", 8);   //create time textfield object
        txSpeed = new JTextField("", 8);   //create speed textfield object
        //
        JPanel p = new JPanel();  //create p object from JPanel class


        //add widgets to the panel
        p.add(txDistance);
        p.add(txTime);
        p.add(bCalc);
        p.add(txSpeed);
        p.add(lSpeed);

        //add panel to the frame
        f.add(p);

        f.setSize(400,300);  //set frame dimensions
        f.setVisible(true);    //make frame visible

    }
    //if button is pressed, automatically execute the following method w/ parameter
    public void actionPerformed(ActionEvent e){
        String s = e.getActionCommand();    //obtain the event command(button text) from the method

        if(s.equals("calc Speed")){

            int dist = Integer.parseInt(txDistance.getText()); //get distance input
            int time = Integer.parseInt(txTime.getText()); //get time input

            double speedX = dist / time;   //calc speed...possible execution if time is 0 !

            String speed = Double.toString(speedX);

            txSpeed.setText(speed);

        }
    }

}
