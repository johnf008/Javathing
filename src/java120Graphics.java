//programmerJohn
//pgm desc: demonstrate using the Java Graphics library tools

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class java120Graphics extends JPanel implements ActionListener{
    private int x = 0;
    private Timer timer;

    private int passCount = 1; //used to switch colors

    //constructor
    public java120Graphics(){
        timer = new Timer(5, this);
        timer.start();
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);


        if(passCount % 2 == 0 ){
            g.setColor(Color.BLUE);
            g.fillOval(x,100,200,200);

            g.setColor(Color.BLACK);
            g.drawString("X: " + x,10, 20);
        }
        else{
            g.setColor(Color.GREEN);
            g.fillOval(x,100,200,200);

            g.setColor(Color.BLACK);
            g.drawString("X: " + x,10,20);
        }
    }

    public void actionPerformed(ActionEvent e){
        x += 5;
        if(x > getWidth()){
            x = -50;
            passCount++;
        }

        repaint();
    }

    public static void main(String[] args){
        JFrame frame = new JFrame("Java Graphics Repaint");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new java120Graphics());
        frame.setSize(400,300);
        frame.setVisible(true);
    }
}
