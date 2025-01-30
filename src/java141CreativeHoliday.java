//name:programmerJohn
//pgm desc: Be creative with the xmas spirit
import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import java.util.Random;

public class java141CreativeHoliday extends JPanel{
    public static BufferedImage image;
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        drawScene(g);
    }

    private void drawScene(Graphics g){
        Random rObj = new Random();

        g.setColor(new Color(143, 158, 194));
        g.fillRect(0,0,getWidth(),getHeight());



        int x = 350;
        int y = 270;
        int greenValue = 70;

        g.setColor(new Color(34, 155, 0));
        g.fillRect(0,450,700,50);

        g.setColor(new Color(59, 25, 8));
        g.fillRect(285,425,30,60);

        g.setColor(new Color(15, 82, 0));
        g.drawPolygon(new int[] {300, 200, 400}, new int[] {100, 425, 425}, 3);
        g.fillPolygon(new int[] {300, 200, 400}, new int[] {100, 425, 425}, 3);

        g.setColor(new Color(78, 255, 134));
        g.drawArc(235,350,25,25,0,360);
        g.fillArc(235,350,25,25,0,360);

        g.setColor(new Color(255, 78, 78));
        g.drawArc(260,300,25,25,0,360);
        g.fillArc(260,300,25,25,0,360);

        g.setColor(new Color(78, 255, 134));
        g.drawArc(285,350,25,25,0,360);
        g.fillArc(285,350,25,25,0,360);

        g.setColor(new Color(255, 99, 99));
        g.drawArc(310,300,25,25,0,360);
        g.fillArc(310,300,25,25,0,360);

        g.setColor(new Color(147, 255, 134));
        g.drawArc(335,350,25,25,0,360);
        g.fillArc(335,350,25,25,0,360);

        g.setColor(new Color(255, 240, 78));
        g.drawArc(285,250,25,25,0,360);
        g.fillArc(285,250,25,25,0,360);

        g.setColor(new Color(255, 240, 78));
        g.drawArc(260,75,75,75,0,360);
        g.fillArc(260,75,75,75,0,360);

        int rand_x = 0;
        int rand_y = 0;

        for(int i = 0; i < 20; i++){
            rand_x = rObj.nextInt(1,600);
            rand_y = rObj.nextInt(1,500);

            g.setColor(Color.WHITE);
            g.fillArc(rand_x,rand_y, 15,15,0,360);
        }

        drawHouse(g);
    }
    public void drawHouse(Graphics g){
        //House body
        g.setColor(new Color(182, 133, 93));   //tan color
        g.fillRect(500, 400, 100, 100);

        g.setColor(Color.RED);
        int[] xPoints = {500, 550, 600};
        int[] yPoints = {400, 300, 400};
        g.fillPolygon(xPoints, yPoints, 3);

        g.setColor(Color.CYAN);
        g.fillRect(495, 425, 50, 50);
        g.setColor(Color.BLACK);
        g.drawLine(520, 425, 520, 475);
        g.drawLine(495, 450, 545, 450);


    }

    public static void main(String[] args){
        SwingUtilities.invokeLater( () -> {
            JFrame frame = new JFrame("Creative_Graphics_Christmas_Edition");

            frame.add(new java141CreativeHoliday());

            frame.setSize(600, 500);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
