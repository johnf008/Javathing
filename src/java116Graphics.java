//name: ProgrammerJohn
//pgm desc: demonstrate using the Java "swing" and "awt" (abstract window toolkit) libraries to create graphics
import javax.swing.*;
import java.awt.*;
public class java116Graphics extends JPanel{

    public void paintComponent(Graphics g) {   //pass Graphics object to painting methods
        //handles any implementation-specific rendering that the superclass might need to perform
        //ensures component's background is properly rendering before custom painting is done
        super.paintComponent(g);
        //"this refers to current object
        this.setBackground(Color.WHITE);

        //add some text
        g.setColor(Color.BLACK);
        g.setFont(new Font("arial", Font.BOLD, 16));
        g.drawString("Hello, Welcome to Java Graphics!", 100,250);
        //draw red rectangle
        g.setColor(Color.RED);
        g.fillRect(50,50,100,80);
        //draw blue circle
        g.setColor(Color.BLUE);
        g.fillOval(200,50,100,100);
        //draw a green line
        g.setColor(Color.GREEN);
        g.drawLine(50,200,300,200);


        //setup coordinates for triangle polygon
        int x1 = 350, x2 = 350, x3 = 400;
        int y1=50,y2=150,y3=100;

        int[] xPoints = {x1,x2,x3};
        int[] yPoints = {y1,y2,y3};
        int nPoints = 3;

        g.setColor(Color.GREEN);

        //send array of coordinates & number of vertices to fill polygon method
        g.fillPolygon(xPoints, yPoints, nPoints);
    }
    public static void main(String[] args){
        JFrame frame = new JFrame("Welcome");
        frame.setSize(500,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new java116Graphics()); //class object parameter enables customization of panel
        frame.setVisible(true);  //triggers execution & initial paint of components via "paintComponet()'
    }
}
