//name: programmerJohn
//pgm desc: Calculate simple interest in a gui
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.*;

public class java87GUISimpleInterest extends JFrame implements ActionListener {
    static JTextField t1, t2, t3, t4;
    static JFrame f;
    static JButton b;
    static JLabel l1,l2, l3, l4;
    public static void main(String[] args){
        f = new JFrame("GUI Simple Interest");

        l1 = new JLabel("Amount to Invest:");
        l2 = new JLabel("Duration in years: ");

        l3 = new JLabel("Interest Rate: ");
        l4 = new JLabel("Interest Earned: ");


        t1 = new JTextField("", 5);
        t2 = new JTextField("", 5);
        t3 = new JTextField("", 5);
        t4 = new JTextField("",5);


        b = new JButton("Solve");

        JPanel p = new JPanel();

        java87GUISimpleInterest J87 = new java87GUISimpleInterest();

        b.addActionListener(J87);


        p.add(l1);
        p.add(t1);

        p.add(l2);
        p.add(t2);

        p.add(l3);
        p.add(t3);

        p.add(b);

        p.add(l4);
        p.add(t4);
        f.add(p);
        f.setSize(600,500);
        f.setVisible(true);

    }
    public void actionPerformed(ActionEvent e){

        String s = e.getActionCommand();

        if(s.equals("Solve")){
            double amount = Double.parseDouble(t1.getText());
            double duration = Double.parseDouble(t2.getText());
            double interestRate = Double.parseDouble(t3.getText());

            double earnedInterest = (amount * duration * interestRate) / 100;

            t4.setText(Double.toString(earnedInterest));

        }
    }


}
