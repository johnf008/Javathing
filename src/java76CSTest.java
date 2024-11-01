//name:ProgrammerJohn
//pgn desc: Calculate total gallons
import java.awt.event.*;
import javax.swing.*;
public class java76CSTest extends JFrame implements ActionListener {
    static JTextField t1, t2;
    static JFrame f;
    static JButton b,b2,b3;
    static JLabel l1,l2;

    public static void main(String[] args){
        f = new JFrame("programmerJohn Gas Pump GUI App");

        l1 = new JLabel("Amount $");
        l2 = new JLabel("Total Gallons");

        b = new JButton("$2.60 Unleaded");
        b2 = new JButton("$2.75 Super");
        b3 = new JButton("$3.00 Premium");

        java76CSTest J76obj = new java76CSTest();

        b.addActionListener(J76obj);
        b2.addActionListener(J76obj);
        b3.addActionListener(J76obj);

        t1 = new JTextField("", 10);
        t2 = new JTextField("", 15);

        JPanel p = new JPanel();

        p.add(l1);
        p.add(t1);

        p.add(b);
        p.add(b2);
        p.add(b3);

        p.add(l2);
        p.add(t2);

        f.add(p);

        f.setSize(220,300);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){

        double amount = Double.parseDouble(t1.getText());

        String s = e.getActionCommand();

        if(s.equals("$2.60 Unleaded")){
            amount = amount / 2.60;
            t2.setText(Double.toString(amount));
        }
        else if(s.equals("$2.75 Super")){
            amount = amount / 2.75;
            t2.setText(Double.toString(amount));
        }
        else if (s.equals("$3.00 Premium")){
            amount = amount / 3.00;
            t2.setText(Double.toString(amount));
        }
    }
}
