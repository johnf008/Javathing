//name: programmerJohn
//pgm desc: create file writer and write
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.math.*;
import java.util.Random;
import java.io.*;    //access the input output package from java library
import java.nio.Buffer;

public class java94CustomerSysApp extends JFrame implements ActionListener{
    static JTextField t1, t2;
    static JLabel l1,l2;
    static JButton b1;
    static JRadioButton r1,r2,r3;
    static JFrame f;
    static ButtonGroup rbGroup;
    public static void main(String[]args){

        f = new JFrame("Customer Sys App");

        l1 = new JLabel("Employee Name: ");

        t1 = new JTextField("", 5);
        t2 = new JTextField("", 5);

        r1 = new JRadioButton();
        r2 = new JRadioButton();
        r3 = new JRadioButton();
        rbGroup = new ButtonGroup();

        r1.setText("HR");
        r2.setText("IT");
        r3.setText("Admin");

        rbGroup.add(r1);
        rbGroup.add(r2);
        rbGroup.add(r3);

        b1 = new JButton("Submit");

        java94CustomerSysApp J94 = new java94CustomerSysApp();
        b1.addActionListener(J94);

        JPanel p = new JPanel();

        p.add(l1);
        p.add(t1);
        p.add(t2);
        p.add(r1);
        p.add(r2);
        p.add(r3);
        p.add(b1);

        f.add(p);
        f.setSize(500, 500);

        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        String s = e.getActionCommand();


        if(s.equals("Submit")){
            if(r1.isSelected()){
                try{
                BufferedWriter writerOne = new BufferedWriter(new FileWriter("HRempfile.Txt"));

                String name = t1.getText();
                int id = Integer.parseInt(t2.getText());

                String fullThing = "Name: " + name + " ID: " + id;
                writerOne.write(fullThing);
                writerOne.write("\n");

                writerOne.close();



                }
                catch(IOException H){
                   H.printStackTrace();
                }
            }
            if(r2.isSelected()){
                try{
                    BufferedWriter writerOne = new BufferedWriter(new FileWriter("ITempfile.Txt"));

                    String name = t1.getText();
                    int id = Integer.parseInt(t2.getText());

                    String fullThing = "Name: " + name + " ID: " + id;
                    writerOne.write(fullThing);
                    writerOne.write("\n");

                    writerOne.close();
                }
                catch(IOException I){
                    I.printStackTrace();
                }
            }
            if (r3.isSelected()) {
                try{
                    BufferedWriter writerOne = new BufferedWriter(new FileWriter("Adminempfile.Txt"));

                    String name = t1.getText();
                    int id = Integer.parseInt(t2.getText());

                    String fullThing = "Name: " + name + " ID: " + id;
                    writerOne.write(fullThing);
                    writerOne.write("\n");

                    writerOne.close();
                }
                catch(IOException A){
                    A.printStackTrace();
                }
            }
            rbGroup.clearSelection();
            t1.setText("");
            t2.setText("");
        }
    }

}