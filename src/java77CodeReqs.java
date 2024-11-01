//name: Programmer JOhn
// Calculate distance
//

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.*;

public class java77CodeReqs extends JFrame implements ActionListener {
    static JTextField t1, t2, t3, t4, t5;
    static JFrame f;
    static JButton b;
    static JLabel l1,l2, l3, l4;
    public static void main(String[] args){
        f = new JFrame("Java 77");

        l1 = new JLabel("x1");
        l2 = new JLabel("y1");

        l3 = new JLabel("x2");
        l4 = new JLabel("y2");

        t1 = new JTextField("", 5);
        t2 = new JTextField("", 5);
        t3 = new JTextField("", 5);
        t4 = new JTextField("", 5);

        t5 = new JTextField("", 25);

        b = new JButton("Solve");

        JPanel p = new JPanel();

        java77CodeReqs J77 = new java77CodeReqs();

        b.addActionListener(J77);


        p.add(l1);
        p.add(t1);

        p.add(l2);
        p.add(t2);

        p.add(l3);
        p.add(t3);

        p.add(l4);
        p.add(t4);

        p.add(b);

        p.add(t5);

        f.add(p);
        f.setSize(500,800);
        f.setVisible(true);

    }
    public void actionPerformed(ActionEvent e){

        String s = e.getActionCommand();

        if(s.equals("Solve")){
            double x1 = Double.parseDouble(t1.getText());
            double y1 = Double.parseDouble(t2.getText());

            double x2 = Double.parseDouble(t3.getText());
            double y2 = Double.parseDouble(t4.getText());

            double answer = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
            t5.setText(Double.toString(answer));

        }
    }


}
