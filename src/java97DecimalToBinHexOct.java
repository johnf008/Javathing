//programmer John
//pgm desc: convert decimal to bin, hex, and oct
import java.awt.event.*;
import javax.swing.*;

public class java97DecimalToBinHexOct extends JFrame implements ActionListener {


    static JTextField t, t2, t3, t4;
    static JFrame f;
    static JButton b;
    static JLabel l;

    static JLabel l2;
    static JLabel l3;
    static JLabel l4;

    static JCheckBox cb1, cb2, cb3;


    public static void main(String[] args) {
        f = new JFrame("Decimal To Bin, Hex, & Oct");

        l = new JLabel("Decimal: ");

        l2 = new JLabel("Binary: ");
        l3 = new JLabel("Hex: ");
        l4 = new JLabel("Octal: ");

        b = new JButton("Enter");

        cb1 = new JCheckBox("Covert to Binary");
        cb2 = new JCheckBox("Convert to Hex");
        cb3 = new JCheckBox("Convert to Octal");

        java97DecimalToBinHexOct J97 = new java97DecimalToBinHexOct();

        b.addActionListener(J97);


        //..
        t = new JTextField("", 6);  //create length textfield object
        t2 = new JTextField("", 6);  //create width textfield object
        t3 = new JTextField("", 6); //create height texrtfield object
        t4 = new JTextField("",6);

        JPanel p = new JPanel();  //create p object from Jpanel class
        //add widgets to panel
        p.add(l);
        p.add(t);

        p.add(cb1);
        p.add(cb2);
        p.add(cb3);

        p.add(b);

        p.add(l2);
        p.add(t2);

        p.add(l3);
        p.add(t3);

        p.add(l4);
        p.add(t4);
        //add panel to frame
        f.add(p);

        f.setSize(500, 300); //set frame dimension
        f.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

        String s = e.getActionCommand(); //obtain the event command from method

        if (s.equals("Enter")) {
            t2.setText("");
            t3.setText("");
            t4.setText("");

            int realDecimal;
            String decimal = t.getText();
            realDecimal = Integer.parseInt(decimal);

            if (cb1.isSelected()) {
                String binaryConversion = Integer.toBinaryString(realDecimal);
                t2.setText(binaryConversion);
            }
            if(cb2.isSelected()){
                String hexConversion = Integer.toHexString(realDecimal);
                t3.setText(hexConversion);
            }
            if(cb3.isSelected()){
                String octalConversion = Integer.toOctalString(realDecimal);
                t4.setText(octalConversion);
            }
        }
    }
}
