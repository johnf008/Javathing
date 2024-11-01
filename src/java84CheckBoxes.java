//name: ProgrammerJohn
//pgm desc: practice using checkboxes by ordering food
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.*;
public class java84CheckBoxes extends JFrame implements ActionListener {
    static JFrame frame;
    static JLabel labelHeading, labelOutMsg;

    static JCheckBox cbPizza, cbBurger, cbWings;
    static JButton buttonSubmit;
    public static void main(String[] args){
        java84CheckBoxes j84 = new java84CheckBoxes();  //create object from class to enable event handling

        frame = new JFrame("Eatz App");
        cbPizza = new JCheckBox("Pizza - $15");
        cbBurger = new JCheckBox("Burger - $8");
        cbWings = new JCheckBox("Wings - $12");

        labelHeading = new JLabel("Please make your selections");

        buttonSubmit = new JButton("Submit");

        buttonSubmit.addActionListener(j84);  //passing class object enables listening for event

        labelOutMsg = new JLabel("");

        //create object from window panel
        JPanel p = new JPanel();
        p.setBackground(Color.orange);

        //add the widget components unto the window panel
        p.add(cbPizza);
        p.add(cbBurger);
        p.add(cbWings);
        p.add(labelHeading);
        p.add(buttonSubmit);
        p.add(labelOutMsg);
        p.add(labelOutMsg);

        //add the panel to the window frame
        frame.add(p);

        frame.setSize(500,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        String s = e.getActionCommand();

        double amount = 0;
        String msg = "";

        if(s.equals("Submit")){
            if(cbPizza.isSelected()){
                amount += 15;
            }
            if (cbBurger.isSelected()){
                amount += 8;
            }
            if(cbWings.isSelected()){
                amount += 12;
            }
            msg = " Total: $" + amount;

            labelOutMsg.setText(msg);
        }
    }
}
