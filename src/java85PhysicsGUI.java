//name: programmerJohn
//pgm desc: demonstrate solving a physics problem: determine the maximum height of a projectile
// time to reach that height & distance traveled
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.*;
public class java85PhysicsGUI extends JFrame implements ActionListener{
    static JTextField t1, t2, t3, t4, t5;
    static JFrame f;
    static JButton b;
    static JLabel l1,l2, l3, l4, l5;
    public static void main(String[] args){
        f = new JFrame("Java 85");

        l1 = new JLabel("Angle");
        l2 = new JLabel("Initial Velocity");

        l3 = new JLabel("Maximum Height (Meters):");
        l4 = new JLabel("Time to Reach (Seconds):");
        l5 = new JLabel("Maximum Distance(Meters):");

        t1 = new JTextField("", 5);
        t2 = new JTextField("", 5);
        t3 = new JTextField("", 20);
        t4 = new JTextField("", 20);
        t5 = new JTextField("", 20);



        b = new JButton("Solve");

        JPanel p = new JPanel();

        java85PhysicsGUI J85 = new java85PhysicsGUI();

        b.addActionListener(J85);


        p.add(l1);
        p.add(t1);

        p.add(l2);
        p.add(t2);

        p.add(b);

        p.add(l3);
        p.add(t3);

        p.add(l4);
        p.add(t4);

        p.add(l5);
        p.add(t5);


        f.add(p);
        f.setSize(385,300);
        f.setVisible(true);

    }
    public void actionPerformed(ActionEvent e){

        String s = e.getActionCommand();

        if(s.equals("Solve")){
            double angle = Double.parseDouble(t1.getText());
            angle = 45 * Math.PI / 180;   //angle in radians

            double velocity = Double.parseDouble(t2.getText());  //velocity in m/s

            double gravity = 9.8;  //acceleration due to gravity

            //calculate maximum height and time to get there
            double time = velocity * Math.sin(angle) / gravity;

            double maxHeight = (Math.pow(velocity,2)) * Math.pow(Math.sin(angle),2) / (2 * gravity);

            double maxDistance = ((Math.pow(velocity,2)) * Math.sin(2*angle)) / gravity;

            t3.setText(Double.toString(maxHeight));

            t4.setText(Double.toString(time));

            t5.setText(Double.toString(maxDistance));
        }
    }


}


