//name: programmerJohn
//pgm desc: demonstrate using the Hashmap data structure to store automotive data with a GUI

import java.awt.event.*;
import java.util.HashMap;
import javax.swing.*;
public class java139AutoPartGUIHashMap extends JPanel implements ActionListener{

    private HashMap<String, String> AutoParts; //declare HashMap & GUI components
    private JTextField nameField;
    private JTextField infoField;

    public  java139AutoPartGUIHashMap(){
        AutoParts = new HashMap<>();  //create object from hashmap class

        JLabel nameLabel = new JLabel("Part Name: ");
        nameField = new JTextField(15);
        JLabel infoLabel = new JLabel("Information: ");
        infoField = new JTextField(15);
        JButton addButton = new JButton("Add Part");
        JButton findButton = new JButton("Find Part");

        addButton.addActionListener(this); //this refers to the java139 object
        findButton.addActionListener(this);

        add(nameLabel); //adding swing widget components to the window panel
        add(nameField);
        add(infoLabel);
        add(infoField);
        add(addButton);
        add(findButton);
    }
    public void actionPerformed(ActionEvent e){
        String command = e.getActionCommand(); //get the label from the button that was clicked

        if(command.equals("Add Part")){
            addPart();
        } else if (command.equals("Find Part")){
            findPart();
        }
    }

    private void addPart(){
        String name = nameField.getText();
        String info = infoField.getText();

        if(name.isEmpty() || info.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter Part name & information");
            return;
        }

        AutoParts.put(name, info);  //add the information into the HashMap

        nameField.setText("");
        infoField.setText("");
        JOptionPane.showMessageDialog(this, "AutoPart added successfully");
    }

    private void findPart(){
        String name = nameField.getText();

        if (name.isEmpty()){
            JOptionPane.showMessageDialog(this, "please enter a part to find.");
            return;
        }

        String info = AutoParts.get(name);  //access HashMap & retrieve the auto part information

        if (info == null){
            JOptionPane.showMessageDialog(this, "part not found");
        } else{
            JOptionPane.showMessageDialog(this, name + " : " + info);
        }
        nameField.setText("");
    }

    public static void main(String[] args){
        JFrame frame = new JFrame("AutoPart Information");
        frame.setContentPane(new java139AutoPartGUIHashMap());
        frame.pack();
        frame.setVisible(true);
    }
}
