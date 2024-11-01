//name: programmerJohn
//pgm desc: Make gui for taco truck
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.math.*;
import java.util.Random;

public class java91CreativeCode  {

    static String choice;
    static String typeTortilla;
    static Boolean meat;
    static Boolean cheese;
    static Boolean jal;
    static Boolean tomato;

    public static void main(String[] args) {

        typeTortilla = "Corn Tortilla";

        Random ran = new Random();
        JFrame f = new JFrame("John Tacos");

        JLabel l1 = new JLabel("Full Name");
        JTextField t1 = new JTextField("",20);

        JLabel l2 = new JLabel("Card Number");
        JTextField t2 = new JTextField("", 16);

        JRadioButton rb1 = new JRadioButton();
        JRadioButton rb2 = new JRadioButton();

        ButtonGroup rbGroup = new ButtonGroup();

        rb1.setText("Dine In");
        rb2.setText("To Go");

        rbGroup.add(rb1);
        rbGroup.add(rb2);

        JLabel l3 = new JLabel("Type of Tortilla");

        String[] tortillas = {"Corn Tortilla", "Flour Tortilla", "Spanish Tortilla", "Blue Corn Tortilla", "Nopal Tortilla", "Beetroot Tortilla", "Hoja Santa Tortilla"};
        //create combobox/ dropdown list & send array of data for the list options
        JComboBox cBox = new JComboBox(tortillas);

        JCheckBox meatCB = new JCheckBox("Meat");
        JCheckBox cheeseCB = new JCheckBox("Cheese");
        JCheckBox jalapenoCB = new JCheckBox("Jalapeño");
        JCheckBox tomatoCB = new JCheckBox("Tomatoes");


        JButton subButton = new JButton("Enter");
        JButton reset = new JButton("Reset");

        java91CreativeCode j91 = new java91CreativeCode();


        JLabel l4 = new JLabel("");

        JLabel l5 = new JLabel("Confirmation");
        JTextField t5 = new JTextField("", 75);

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

        p.add(meatCB);
        p.add(cheeseCB);
        p.add(jalapenoCB);
        p.add(tomatoCB);

        p.add(l4);

        p.add(subButton);

        p.add(l5);
        p.add(t5);

        p.add(reset);


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
                try {
                    String s = e.getActionCommand();    //obtain the event command from the method
                    if (s.equals("Enter")) {
                        boolean seeIf = true;

                        String name = t1.getText();
                        int cardNumber = Integer.parseInt(t2.getText());

                        String testThing = Integer.toString(cardNumber);

                        if (name.equals("") || testThing.equals("")) {
                            seeIf = false;
                        }

                        String typeOrder = "";
                        if (rb1.isSelected()) {
                            typeOrder = "Dine In";
                        }
                        else if (rb2.isSelected()) {
                            typeOrder = "To Go";
                        } else {
                            seeIf = false;
                        }

                        typeTortilla = choice;

                        if(typeTortilla == null){
                            typeTortilla = "Corn Tortilla";
                        }

                        meat = false;
                        cheese = false;
                        jal = false;
                         tomato = false;
                        String fullCheckBoxes = "";
                        if (meatCB.isSelected()) {
                            fullCheckBoxes = fullCheckBoxes + "Meat, ";
                             meat = true;
                        }
                        if (cheeseCB.isSelected()) {
                            fullCheckBoxes = fullCheckBoxes + "Cheese, ";
                             cheese = true;
                        }
                        if (jalapenoCB.isSelected()) {
                            fullCheckBoxes = fullCheckBoxes + "Jalapenños, ";
                             jal = true;

                        }
                        if (tomatoCB.isSelected()) {
                            fullCheckBoxes = fullCheckBoxes + "Tomatoes ";
                             tomato = true;
                        }

                        if (fullCheckBoxes.equals("")) {
                            seeIf = false;
                        }

                        if(seeIf) {
                            String fullThing = "Name: " + name + ", Card: " + cardNumber + ", Type Order: " + typeOrder + ", Type Tortilla: " + typeTortilla
                                    + ", Toppings: " + fullCheckBoxes;
                            l4.setText("Thank you for ordering");
                            t5.setText(fullThing);


                        }
                        else{
                            l4.setText("You need to input information");
                            t5.setText("");

                        }
                    }
                    else if(s.equals("Reset")){
                        t1.setText("");
                        t2.setText("");
                        rbGroup.clearSelection();

                        if(meat){
                            meatCB.setSelected(false);
                        }
                        if(cheese){
                            cheeseCB.setSelected(false);
                        }
                        if(jal)
                        {
                            jalapenoCB.setSelected(false);
                        }
                        if(tomato){
                            tomatoCB.setSelected(false);
                        }
                    }
                }
                catch(Exception ex){
                    l4.setText("You need to input information");
                    t5.setText("You need to input information");
                }





            }
        };



        //register listener objects with component Listeners so that respective events will be processed
        cBox.addItemListener(ListenObj);
        subButton.addActionListener(acListenObj);
        reset.addActionListener(acListenObj);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //stop program when window frame is close
        //set size of the frame
        f.setSize(925, 280);
        f.setVisible(true);

        Color myColor = new Color(0, 185,232);
        p.setBackground(myColor);
    }
}
