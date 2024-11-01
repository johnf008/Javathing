//name: programmerJohn
//pgm desc: Calculate Kinetic Energy in a GUI
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.*;

public class java82GuiKineticEnergy extends JFrame implements ActionListener {
    static JTextField t1, t2, t3;
    static JFrame f;
    static JButton b;
    static JLabel l1,l2, l3;
    public static void main(String[] args){
        f = new JFrame("Kinetic Energy Calculator");

        l1 = new JLabel("Mass (kg): ");
        l2 = new JLabel("Velocity (m/s): ");

        l3 = new JLabel("Kinetic Energy (J): ");


        t1 = new JTextField("", 5);
        t2 = new JTextField("", 5);
        t3 = new JTextField("", 5);


        b = new JButton("Solve");

        JPanel p = new JPanel();

        java82GuiKineticEnergy J82 = new java82GuiKineticEnergy();

        b.addActionListener(J82);


        p.add(l1);
        p.add(t1);

        p.add(l2);
        p.add(t2);

        p.add(b);

        p.add(l3);
        p.add(t3);

        f.add(p);
        f.setSize(500,500);
        f.setVisible(true);

    }
    public void actionPerformed(ActionEvent e){

        String s = e.getActionCommand();

        if(s.equals("Solve")){
            double mass = Double.parseDouble(t1.getText());
            double velocity = Double.parseDouble(t2.getText());

            double kineticEnergy =  0.5 * (mass* (Math.pow(velocity,2)));

            t3.setText(Double.toString(kineticEnergy));

        }
    }


}
