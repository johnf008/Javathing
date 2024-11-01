//name: Programmer John
//pgn desc: Demonstrate using the swing component: JCombobox
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.math.*;
public class java88ComboBoxButton{
    //declare stand alone variable
    static String choice;

    //setup constructor
    java88ComboBoxButton(){
        JFrame f = new JFrame("JComboBox Demo");
        JLabel l = new JLabel("select your destination");
        JLabel l1 = new JLabel("");

        String[] cities = {"None", "Dallas", "Houston", "New York", "Los Angeles", "Austin", "Denver"};
        //create combobox/ dropdown list & send array of data for the list options
        JComboBox cBox = new JComboBox(cities);

        JButton subButton = new JButton("Submit");
        JLabel l2 = new JLabel("");
        //-------
        //create panel
        JPanel p = new JPanel();

        //add components to panel
        p.add(l);
        p.add(cBox);
        p.add(l1);
        p.add(subButton);
        p.add(l2);

        //add panel to frame
        f.add(p);

        //create itemlistener object & provide implementation Override code needed for comboBox "itemStateChanged" method
        ItemListener ListenObj = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getSource() == cBox){
                    if(e.getStateChange() == ItemEvent.SELECTED){
                        choice = (String) cBox.getSelectedItem();   //get selection & process it with button event
                        //l1.setText(Choice + " selected")l
                    }
                }
            }
        };

        //create actionListener object & provide implementation override code needed for button "actionPerformed" method
        ActionListener acListenObj = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = e.getActionCommand();    //obtain the event command from the method
                if (s.equals("Submit")){
                    l2.setText(choice + " selection will be processed");
                }
            }
        };

        //register listener objects with component Listeners so that respective events will be processed
        cBox.addItemListener(ListenObj);
        subButton.addActionListener(acListenObj);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //stop program when window frame is close
        //set size of the frame
        f.setSize(400,300);
        f.setVisible(true);
    }
    public static void main(String[] args){
        new java88ComboBoxButton();
    }


}