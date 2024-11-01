//name: programmerJohn
//pgm desc: demonstrate utilizing java graphics library to create a tree & house
import javax.swing.*;
import java.awt.*;
public class java128GraphicsTreeHouse extends JPanel{

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        drawScene(g);
    }

    private void drawScene(Graphics g){
        //set up sky
        g.setColor(new Color(135,206,235));  //sky blue
        g.fillRect(0,0,getWidth(),getHeight());


        //draw sun
        g.setColor(Color.YELLOW);
        g.fillOval(500, 50, 80, 80);

        //draw ground
        g.setColor(new Color(34, 139, 34));  //forest green
        g.fillRect(0, getHeight() - 100, getWidth(), 100);

        //draw house
        drawHouse(g);

        //draw tree
        drawTree(g);

        //draw cloud
    g.setColor(Color.WHITE);
    g.fillOval(300,50,200,30);
    g.fillOval(150,50,200,30);
    }

    ///.....
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
            JFrame frame = new JFrame("TreeHouse");

            frame.add(new java128GraphicsTreeHouse());

            frame.setSize(600, 500);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
