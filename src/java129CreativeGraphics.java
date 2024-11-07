//name:programmerJohn
//pgm desc: Be creative with the elements
import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import java.util.Random;

public class java129CreativeGraphics extends JPanel{
    public static BufferedImage image;
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        drawScene(g);
    }

    private void drawScene(Graphics g){
        Random rObj = new Random();

        g.setColor(new Color(3, 0, 92));
        g.fillRect(0,0,getWidth(),getHeight());

        try {
            image = ImageIO.read(new File("/Users/265524jofl/Desktop/Javathing/718smiley.svg(1)(3).png"));
        }
        catch (IOException e){
            //not handled
        }
        g.drawImage(image, 0, 0, 200, 200, null);

        int x = 350;
        int y = 270;
        int greenValue = 70;

        g.setColor(new Color(33, 70, 0));
        g.fillArc(x,y,400,400,0,180);

        for(int i = 0; i < 5; i++){
            x += 25;
            y += 25;
            greenValue += 5;

            g.setColor(new Color(33, greenValue, 0));
            g.fillArc(x, y, 400, 400, 0, 180);
        }

        g.setColor(new Color(187, 106, 0));
        g.fillRect(550,200,50,100);

        g.setColor(new Color(0, 124, 107));
        g.fillRect(550,150,50,50);

        g.setColor(new Color(187, 106, 0));
        g.fillRect(550,150,50,20);

        g.setColor(Color.YELLOW);
        g.drawPolygon(new int[] {10, 550, 10}, new int[] {200, 180, 250}, 3);
        g.fillPolygon(new int[] {10, 550, 10}, new int[] {200, 180, 250}, 3);

        g.setColor(new Color(62, 77, 133));
        g.fillRect(0,400,370,300);

        g.setColor(new Color(159, 0, 0));
        g.fillArc(150,250,150,150,0,-180);

        g.setColor(new Color(103, 61, 0));
        g.fillRect(200,225,25,100);

        g.setColor(Color.WHITE);
        g.drawPolygon(new int[] {220, 275, 220}, new int[] {225, 300, 300}, 3);
        g.fillPolygon(new int[] {220, 275, 220}, new int[] {225, 300, 300}, 3);

    }

    public static void main(String[] args){
        SwingUtilities.invokeLater( () -> {
            JFrame frame = new JFrame("Creative_Graphics");

            frame.add(new java129CreativeGraphics());

            frame.setSize(600, 500);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
