//name: programmerJohn
//pgm desc: demonstrate utilizing java graphics library to create a tree & house
import javax.swing.*;
import java.awt.*;
import java.util.Random;
public class java144CreativeGraphics extends JPanel{
    static JFrame frame;
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        drawScene(g);
    }

    private void drawScene(Graphics g){
        Random rObj = new Random();
        //set up sky
        g.setColor(new Color(135,206,235));  //sky blue
        g.fillRect(0,0,getWidth(),getHeight());

        //draw sun
        int current_x = -80;
        int current_y = 0;
        int current_width = 80;
        int current_height = 80;

    for(int l = 0; l <= 1; l++) {
        System.out.println("L is equal to " + l);
        int firstNum = rObj.nextInt(0,255);
        int secondNum = rObj.nextInt(0,255);
        int thirdNum = rObj.nextInt(0,255);

        Color randColor = new Color(firstNum, secondNum, thirdNum);
        g.setColor(randColor);
        for (int i = 0; i <= 5; i++) {

            for (int j = 0; j <= 10; j++) {
                g.fillOval(current_x, current_y, current_width, current_height);
                current_x += 80;

            }
            current_y += 80;
            current_x = -80 ;
        }

        current_height -= 20;
        current_width -= 20;

        System.out.println("This is before the factor of 10 is applied");
        current_x = -80 + 10;
        System.out.println();
        current_y = 0;


    }



    }


    private void drawHouse(Graphics g){
        //House body
        g.setColor((Color.BLUE));   //tan color
        g.fillRect(300, 200, 200, 200);

        //create roof
        g.setColor(new Color(139, 69, 19));   //saddle brown
        int[] xPoints = {300, 400, 500};
        int[] yPoints = {200, 100, 200};
        g.fillPolygon(xPoints, yPoints, 3);

        //create window
        g.setColor(Color.CYAN);
        g.fillRect(420, 250, 50, 50);
        g.setColor(Color.BLACK);
        g.drawLine(445, 250, 445, 300);
        g.drawLine(420, 275, 470, 275);

        //setup door
        g.setColor(new Color(160, 82, 45));
        g.fillRect(340, 300, 60, 100);
        g.setColor(Color.BLACK);
        g.fillRect(340, 350, 10, 10);
    }

    private void drawTree(Graphics g){
        //tre trunk
        g.setColor(new Color(139, 69, 19));  //saddle brown
        g.fillRect(100, 200, 40, 700);

        //tree leaves
        g.setColor(new Color(0, 128, 0));   //dark green
        g.fillOval(50, 100, 140, 140);
        g.fillOval(20, 150, 140, 140);
        g.fillOval(80, 150, 140, 140);
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater( () -> {
            frame = new JFrame("TreeHouse");

            frame.add(new java144CreativeGraphics());

            frame.setSize(635, 500);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);



        });




    }
}
