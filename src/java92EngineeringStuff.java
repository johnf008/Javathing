//name: programmerJohn
//pgm desc: demonstrate calculating the centripedal force and circular motion of an object

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.*;
public class java92EngineeringStuff extends JFrame implements ActionListener{
    static JTextField t1, t2, t3, t4, t5;
    static JFrame f;
    static JButton b,b2;
    static JLabel l1,l2, l3, l4, l5,l6,l7,l8;

    public static void main(String[] args){
        f = new JFrame("Object's Centripedal Force & Circular Motion Path");

        l1 = new JLabel("Mass(kg)");
        l2 = new JLabel("velocity(m/s)");

        l3 = new JLabel("Radius");
        l4 = new JLabel("Centripedal Force");
        l5 = new JLabel("Circular Path");

        l6 = new JLabel("Meters");
        l7 = new JLabel("Newtons            ");
        l8 = new JLabel("Meters");

        t1 = new JTextField("", 5);
        t2 = new JTextField("", 5);
        t3 = new JTextField("", 20);
        t4 = new JTextField("", 20);
        t5 = new JTextField("", 20);



        b = new JButton("Enter");
        b2 = new JButton("Reset");

        JPanel p = new JPanel();

        java92EngineeringStuff J92 = new java92EngineeringStuff();

        b.addActionListener(J92);
        b2.addActionListener(J92);


        p.add(l1);
        p.add(t1);

        p.add(l2);
        p.add(t2);

        p.add(b);

        p.add(l3);
        p.add(t3);
        p.add(l6);

        p.add(l4);
        p.add(t4);
        p.add(l7);

        p.add(l5);
        p.add(t5);
        p.add(l8);

        p.add(b2);


        f.add(p);
        f.setSize(1285,300);
        f.setVisible(true);

    }
    public void actionPerformed(ActionEvent e){

        String s = e.getActionCommand();

        if(s.equals("Enter")){
            double mass = Double.parseDouble(t1.getText());
            double velocity = Double.parseDouble(t2.getText());

            double gravity = 9.81;
            double radius = (velocity * velocity) / (gravity * mass);

            double centriForce = mass * (velocity * velocity) / radius;

            double pi = Math.PI;

            double circumference = 2 * pi * radius;

            t3.setText(Double.toString(radius));
            t4.setText(Double.toString(centriForce));
            t5.setText(Double.toString(circumference));
        }
        else if(s.equals("Reset")){
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
        }
    }


}


