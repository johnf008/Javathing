//name: ProgrammerJohn
//demonstrate using the swing component: JComboBox
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.math.*;

public class java88ComboBox extends JFrame implements ItemListener {
    static JFrame f;
    static JLabel l, l1;
    static JComboBox comboBox1;
    public static void  main(String[]args){
        f = new JFrame("JComboBOx Demo");
        l = new JLabel("select your destination");
        l1 = new JLabel("Dallas selected");

        l.setForeground(Color.red);
        l1.setForeground(Color.blue);

        //create object to use for the ItemListener
        java88ComboBox cBoxObj = new java88ComboBox();

        //string array contain dropdown list of cities
        String[] cities = {"Dallas", "Houston", "New York", "Los Angeles", "Austin", "Denver"};

        //create object from comboBOx & send array of datta for the options
        comboBox1 = new JComboBox(cities);

        //add ItemListener to the JCombobox
        comboBox1.addItemListener(cBoxObj);

        //create panel
        JPanel p = new JPanel();

        //add components to panel
        p.add(l);
        p.add(comboBox1);
        p.add(l1);

        //add panel to frame
        f.add(p);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //stop prg when window frame is close
        //set size of the frame
        f.setSize(400,300);
        f.setVisible(true);


    }
    public void itemStateChanged(ItemEvent e){
        //check if the state of the combobox is changed
        if(e.getSource() == comboBox1){
            String choice = (String)comboBox1.getSelectedItem();
            l1.setText(choice + " selected ");
        }
    }
}
