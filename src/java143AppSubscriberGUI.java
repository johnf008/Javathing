//name: programmerJohn
//pgm desc: setup the sql and GUI
import java.awt.event.*;//access standard GUI widgets & components
import javax.swing.*;  //access extended gui widgets & components
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class java143AppSubscriberGUI implements ActionListener {
    static JTextField nameEntry, emailEntry;
    static JFrame f;
    static JButton submitButton, resetButton;
    static JLabel nameLabel, emailLabel;
    static Random rObj;

    public static void main(String[] args) {
        java143AppSubscriberGUI jObj = new java143AppSubscriberGUI();

        rObj = new Random();
        f = new JFrame("App Subscriber");

        nameLabel = new JLabel("Name: ");
        nameEntry = new JTextField("", 20);

        emailLabel = new JLabel("Email: ");
        emailEntry = new JTextField("", 20);

        submitButton = new JButton("Submit");

        resetButton = new JButton("Reset");

        submitButton.addActionListener(jObj);
        resetButton.addActionListener(jObj);

        JPanel p = new JPanel();

        p.add(nameLabel);
        p.add(nameEntry);

        p.add(emailLabel);
        p.add(emailEntry);

        p.add(submitButton);
        p.add(resetButton);

        f.add(p);

        f.setSize(900, 300);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent r) {
        String s = r.getActionCommand(); //obtain event command (button text) using method

        if (s.equals("Submit")) {
            String name = nameEntry.getText();
            String email = emailEntry.getText();

            Integer subscriberId = rObj.nextInt(99999);

            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter("outputText.txt", true));

                String entry = "( "+ Integer.toString(subscriberId) + ", " + name + ", " + email + ")";

                writer.write("\n( "+ Integer.toString(subscriberId) + ", " + name + ", " + email + ")");

                writer.close();
            }
            catch(IOException e){
                e.printStackTrace();;
            }


        }
        else if (s.equals("Reset")) {
            nameEntry.setText(" ");
            emailEntry.setText(" ");
        }

    }
}
