//programmer John
//pgm desc: see if user is able to get a car loan
import java.awt.event.*;
import javax.swing.*;

public class java95EOYExam extends JFrame implements ActionListener {


    static JTextField t,t2,t3;
    static JFrame f;
    static JButton b, b2;
    static JLabel l;
    static JLabel l1;
    static JLabel l2;
    static JLabel l3;

    static JRadioButton r1,r2;
    static ButtonGroup rbGroup;


    public static void main (String [] args){
        f = new JFrame("Car Loan App");

        l = new JLabel("");

        l1 = new JLabel("Name: ");
        l2 = new JLabel("Car Price: ");
        l3 = new JLabel("Salary: ");

        b = new JButton("Enter");
        b2 = new JButton("Reset");
        //...
        r1 = new JRadioButton();
        r2 = new JRadioButton();
        rbGroup = new ButtonGroup();

        r1.setText("60 Month Term");
        r2.setText("72 Month Term");

        rbGroup.add(r1);
        rbGroup.add(r2);

        java95EOYExam J95 = new java95EOYExam();

        b.addActionListener(J95);
        b2.addActionListener(J95);

        //..
        t = new JTextField("", 6);  //create length textfield object
        t2 = new JTextField("", 6);  //create width textfield object
        t3 = new JTextField("", 6); //create height texrtfield object

        JPanel p = new JPanel();  //create p object from Jpanel class
        //add widgets to panel
        p.add(l1);
        p.add(t);

        p.add(l2);
        p.add(t2);

        p.add(l3);
        p.add(t3);

        p.add(r1);
        p.add(r2);


        p.add(b);
        p.add(b2);

        p.add(l);
        //add panel to frame
        f.add(p);

        f.setSize(500,300); //set frame dimension
        f.setVisible(true);

    }
    public void actionPerformed(ActionEvent e){

        String s = e.getActionCommand(); //obtain the event command from method

        if(s.equals("Enter"))
        {
            double carPrice = Double.parseDouble(t2.getText());
            double salary = Double.parseDouble(t3.getText());
            String name = t.getText();

            double loanTerm = 0.0;
            if(r1.isSelected()){
                 loanTerm = 60.0;
            }
            if(r2.isSelected()){
                 loanTerm = 72.0;
            }

            double monthlyPayment = carPrice / loanTerm;

            double monthlyCheck = salary / 12;

            double carBudget = monthlyCheck / 3;

            String msgNotice = "";
            if(carBudget >= monthlyPayment){
                msgNotice = "Congratulations " + name + ", you are approved!";
            }
            else{
                msgNotice = "Unfortunately " + name + ", you were not approved.";
            }
            l.setText(msgNotice);
        }
        else if (s.equals("Reset")){
            t.setText("");
            t2.setText("");
            t3.setText("");
            rbGroup.clearSelection();
            l.setText("");
        }
    }
}
