//name: programmerJohn
//pgm desc: Make an airline flight gui
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.math.*;
import java.util.Random;

public class java90MultiComponentGUI  {

    static String choice;

    public static void main(String[] args) {
        Random ran = new Random();
        new java90MultiComponentGUI();
        JFrame f = new JFrame("NorthGate Airlines");

        JLabel l1 = new JLabel("First Name");
        JTextField t1 = new JTextField("",20);

        JLabel l2 = new JLabel("Last Name");
        JTextField t2 = new JTextField("", 20);

        JRadioButton rb1 = new JRadioButton();
        JRadioButton rb2 = new JRadioButton();

        ButtonGroup rbGroup = new ButtonGroup();

        rb1.setText("Male");
        rb2.setText("Female");

        rbGroup.add(rb1);
        rbGroup.add(rb2);

        JLabel l3 = new JLabel("Destination");

        String[] cities = {"None", "Dallas", "Houston", "New York", "Los Angeles", "Austin", "Denver"};
        //create combobox/ dropdown list & send array of data for the list options
        JComboBox cBox = new JComboBox(cities);

        JCheckBox firstClassCB = new JCheckBox("First Class");
        JCheckBox starMenuCB = new JCheckBox("Star Menu");
        JCheckBox windowCB = new JCheckBox("Window");
        JCheckBox mediaCB = new JCheckBox("Media");

        JButton subButton = new JButton("Enter");

        JLabel l4 = new JLabel("");

        JLabel l5 = new JLabel("Confirmation");
        JTextField t5 = new JTextField("", 40);

        //-------
        //create panel
        JPanel p = new JPanel();

        //add components to panel
        p.add(l1);
        p.add(t1);

        p.add(l2);
        p.add(t2);

        p.add(rb1);
        p.add(rb2);

        p.add(l3);
        p.add(cBox);

        p.add(firstClassCB);
        p.add(starMenuCB);
        p.add(windowCB);
        p.add(mediaCB);

        p.add(l4);

        p.add(subButton);

        p.add(l5);
        p.add(t5);


        //add panel to frame
        f.add(p);

        //create itemlistener object & provide implementation Override code needed for comboBox "itemStateChanged" method
        ItemListener ListenObj = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getSource() == cBox) {
                    if (e.getStateChange() == ItemEvent.SELECTED) {
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
                if (s.equals("Enter")) {
                    int confNum = ran.nextInt(10000,99999);
                    String firstName = t1.getText();
                    String lastName = t2.getText();
                    String fullName = firstName + " " + lastName;

                    String gender = "";
                    if(rb1.isSelected()){
                        gender = "Male";
                    }
                    if(rb2.isSelected()){
                        gender = "Female";
                    }

                    String destination = choice;

                    String fullCheckBoxes = "";
                    if(firstClassCB.isSelected()){
                        fullCheckBoxes = fullCheckBoxes + "First Class, ";
                    }
                    if(starMenuCB.isSelected()){
                        fullCheckBoxes = fullCheckBoxes + "Star Menu, ";
                    }
                    if(windowCB.isSelected()){
                        fullCheckBoxes = fullCheckBoxes + "Window, ";
                    }
                    if(mediaCB.isSelected()){
                        fullCheckBoxes = fullCheckBoxes + "Media ";
                    }

                    String fullThing = Integer.toString(confNum) + ", " + fullName + ", " + gender + ", "+ destination + ", " + fullCheckBoxes;
                    l4.setText("Thank you for booking with us");
                    t5.setText(fullThing);

                }
            }
        };

        //register listener objects with component Listeners so that respective events will be processed
        cBox.addItemListener(ListenObj);
        subButton.addActionListener(acListenObj);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //stop program when window frame is close
        //set size of the frame
        f.setSize(820, 250);
        f.setVisible(true);
        p.setBackground(Color.orange);
    }
}
