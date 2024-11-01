//name: ProgrammerJohn
//pgm desc: Create gui to convert dollars to different currencies
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class java81ConvertDollarGUI extends JFrame implements ActionListener {
    static JFrame f;

    static JTextField inputTxt;

    static JRadioButton rb1;
    static JRadioButton rb2;
    static JRadioButton rb3;
    static ButtonGroup rbGroup;
    static JLabel label1;
    static JLabel label2;
    static JButton button1;
    public static void main(String[] args){
        f = new JFrame("Convert Dollar");
        inputTxt = new JTextField("", 10);

        rb1 = new JRadioButton();
        rb2 = new JRadioButton();
        rb3 = new JRadioButton();
        rbGroup = new ButtonGroup();

        rb1.setText("Pesos");
        rb2. setText("Euros");
        rb3.setText("Yuan");

        rbGroup.add(rb1);
        rbGroup.add(rb2);
        rbGroup.add(rb3);

        button1 = new JButton("Calculate");

        label1 = new JLabel("Dollars$");
        label2 = new JLabel();

        java81ConvertDollarGUI java81 = new java81ConvertDollarGUI();

        button1.addActionListener(java81);

        JPanel p = new JPanel();

        p.add(label1);
        p.add(inputTxt);
        p.add(rb1);
        p.add(rb2);
        p.add(rb3);
        p.add(button1);
        p.add(label2);

        f.add(p);

        f.setSize(500,500);
        f.setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        String s = e.getActionCommand();

        String rbChoice = " ";

        double dollarAmount = Double.parseDouble(inputTxt.getText());

        double pesoRate = 16.50;
        double euroRate = 0.92;
        double yuanRate = 7.23;
        double conversion = 0.0;

        if(s.equals("Calculate")){
            if(rb1.isSelected()){
                 conversion = dollarAmount * pesoRate;

            }
            else if (rb2.isSelected()){
                 conversion = dollarAmount * euroRate;

            }
            else if (rb3.isSelected()){
                 conversion = dollarAmount * yuanRate;

            }
            String result = String.format("%.2f", conversion);
            label2.setText(result);
        }
    }
}
