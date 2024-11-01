//name:Programmer John
//pgm desc: make gui that calculates the trig functions
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.*;
public class java83TrigRadioButtons extends JFrame implements ActionListener {
    static JFrame f;

    static JTextField inputTxt, inputTxtTwo;

    static JRadioButton rb1;
    static JRadioButton rb2;
    static JRadioButton rb3;
    static ButtonGroup rbGroup;
    static JLabel label1;
    static JLabel label2;
    static JButton button1;
    public static void main(String[] args){
        f = new JFrame("MATH Xapp");
        inputTxt = new JTextField("", 10);

        rb1 = new JRadioButton();
        rb2 = new JRadioButton();
        rb3 = new JRadioButton();
        rbGroup = new ButtonGroup();

        rb1.setText("Sine");
        rb2. setText("Cosine");
        rb3.setText("Tangent");

        rbGroup.add(rb1);
        rbGroup.add(rb2);
        rbGroup.add(rb3);

        button1 = new JButton("Submit");

        label1 = new JLabel("Degrees: ");
        label2 = new JLabel("Result");

        inputTxtTwo = new JTextField("", 30);

        java83TrigRadioButtons java83 = new java83TrigRadioButtons();

        button1.addActionListener(java83);

        JPanel p = new JPanel();

        p.add(label1);
        p.add(inputTxt);
        p.add(rb1);
        p.add(rb2);
        p.add(rb3);
        p.add(button1);
        p.add(label2);
        p.add(inputTxtTwo);

        f.add(p);

        f.setSize(530,600);
        f.setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        String s = e.getActionCommand();

        double degrees = Double.parseDouble(inputTxt.getText());
        double radians = degrees * Math.PI/180;
        if(s.equals("Submit")){


            if(rb1.isSelected()){
                double sine = Math.sin(radians);
                inputTxtTwo.setText(Double.toString(sine));
            }
            else if (rb2.isSelected()){
                double cosine = Math.cos(radians);
                inputTxtTwo.setText(Double.toString(cosine));
            }
            else if (rb3.isSelected()){
                double tangent = Math.tan(radians);
                inputTxtTwo.setText(String.valueOf(tangent));
            }
        }
    }
}
