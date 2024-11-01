//name: ProgrammerJohn
//pgm desc: user selects what planet to display an image of
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class java80RadioBAndImages extends JFrame implements ActionListener {
    static JFrame f;
    static JTextField inputTxt;

    static JRadioButton rb1;
    static JRadioButton rb2;
    static JRadioButton rb3;
    static ButtonGroup rbGroup;

    static JButton Bsubmit;

    static JLabel imgLabel;
    static JButton imgButton;

    public static void main(String[] args){
        f = new JFrame("XApp");
        inputTxt = new JTextField(" ", 10);

        rb1 = new JRadioButton();
        rb2 = new JRadioButton();
        rb3 = new JRadioButton();
        rbGroup = new ButtonGroup();

        rb1.setText("Pluto");
        rb2. setText("Jupiter");
        rb3.setText("Saturn");

        rbGroup.add(rb1);
        rbGroup.add(rb2);
        rbGroup.add(rb3);

        Bsubmit = new JButton("render image");

        imgLabel = new JLabel();
        imgButton = new JButton();

        java80RadioBAndImages java80 = new java80RadioBAndImages();

        Bsubmit.addActionListener(java80);

        //create panel object
        JPanel p = new JPanel();

        //add widget components to the panel
        p.add(inputTxt);
        p.add(rb1);
        p.add(rb2);
        p.add(rb3);
        p.add(Bsubmit);
        p.add(imgLabel);
       // p.add(imgButton);

        //add panel to frame window
        f.add(p);

        f.setSize(400,500);
        f.setVisible(true);
        //

        //close main method
    }

    public void actionPerformed(ActionEvent e){
        String s = e.getActionCommand();

        String rbChoice = " ";
        if(s.equals("render image")) {
            if(rb1.isSelected()){
                rbChoice = "/Users/265524jofl/Desktop/javaImages/images.jpg";
            }
            else if(rb2.isSelected()){
                rbChoice = "/Users/265524jofl/Desktop/javaImages/jupiter.png";
            }
            else if (rb3.isSelected()){
                rbChoice = "/Users/265524jofl/Desktop/javaImages/saturn.jpg";
            }

            //rbGroup.clearSelection();

            ImageIcon planetImg = new ImageIcon(rbChoice);

            imgLabel.setIcon(planetImg);
            //imgButton.setIcon(planetImg);
        }
    }
}
