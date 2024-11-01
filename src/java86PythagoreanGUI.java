//name: ProgrammerJohn
//pgm desc: Create gui to simulate Pythagorean equation
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class java86PythagoreanGUI extends JFrame implements ActionListener {
    static JFrame f;

    static JTextField inputTxt,inputTxtA,inputTxtB,inputTxtC;

    static JRadioButton rb1;
    static JRadioButton rb2;
    static JRadioButton rb3;
    static ButtonGroup rbGroup;
    static JLabel labelA, labelB, labelC, labelAnswer;
    static JButton button1;
    public static void main(String[] args){
        f = new JFrame("Java 86");
        inputTxt = new JTextField("", 10);

        inputTxtA = new JTextField("",10);
        inputTxtB = new JTextField("",10);
        inputTxtC = new JTextField("",10);

        rb1 = new JRadioButton();
        rb2 = new JRadioButton();
        rb3 = new JRadioButton();
        rbGroup = new ButtonGroup();

        rb1.setText("Solve for a (input b & c)");
        rb2. setText("Solve for b (input a & c)");
        rb3.setText("Solve for c (input a & b)");

        rbGroup.add(rb1);
        rbGroup.add(rb2);
        rbGroup.add(rb3);

        button1 = new JButton("Calculate");


        labelA = new JLabel("A (Height): ");
        labelB = new JLabel("B (Base): ");
        labelC = new JLabel("C (Hypotenuse): ");
        labelAnswer = new JLabel("");

        java86PythagoreanGUI java86 = new java86PythagoreanGUI();

        button1.addActionListener(java86);

        JPanel p = new JPanel();

        p.add(labelA);
        p.add(inputTxtA);

        p.add(labelB);
        p.add(inputTxtB);

        p.add(labelC);
        p.add(inputTxtC);

        p.add(rb1);
        p.add(rb2);
        p.add(rb3);

        p.add(button1);

        p.add(labelAnswer);


        f.add(p);

        f.setSize(500,500);
        f.setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        String s = e.getActionCommand();

        String rbChoice = " ";

        if(s.equals("Calculate")){
            if(rb1.isSelected()){
                double b = Double.parseDouble(inputTxtB.getText());
                double c = Double.parseDouble(inputTxtC.getText());

                double a = Math.sqrt((Math.pow(c,2)) - (Math.pow(b,2)));

                labelAnswer.setText("The a (height) is: "+ Double.toString(a));
            }
            else if (rb2.isSelected()){
                double a = Double.parseDouble(inputTxtA.getText());
                double c = Double.parseDouble(inputTxtC.getText());

                double b = Math.sqrt((Math.pow(c,2)) - (Math.pow(a,2)));

                labelAnswer.setText("The b (base) is: "+ Double.toString(b));

            }
            else if (rb3.isSelected()){
                double a = Double.parseDouble(inputTxtA.getText());
                double b = Double.parseDouble(inputTxtB.getText());

                double c = Math.sqrt((Math.pow(a,2)) + (Math.pow(b,2)));
                labelAnswer.setText("The c (hypotenuse) is: " + Double.toString(c));

            }


        }
    }
}
