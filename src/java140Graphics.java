//name: programmerJohn
//pgm desc: demonstrate utilizing the Graphics library tools
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
public class java140Graphics extends JPanel {

    private List<List<Point>> curves = new ArrayList<>();
    private Color currentColor = Color.BLACK;
    private int strokeWidth = 2;

    public java140Graphics() {
        setBackground(Color.WHITE);
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                List<Point> newCurve = new ArrayList<>();
                newCurve.add(new Point(e.getX(), e.getY()));
                curves.add(newCurve);
            }
        });
        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e){
                curves.get(curves.size() - 1).add(new Point(e.getX(),
                        e.getY()));
                repaint();
            }
        });
    }

    public void setColor(Color color){
        currentColor = color;
    }

    public void setStrokeWidth(int width){
        strokeWidth = width;
    }

    public void clear(){
        curves.clear();
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        for(List<Point> curve: curves){
            g2d.setColor(currentColor);
            g2d.setStroke(new BasicStroke(strokeWidth));

            for(int i = 1; i < curve.size(); i++){
                Point p1 = curve.get(i - 1);
                Point p2 = curve.get(i);
                g2d.drawLine(p1.x, p1.y, p2.x, p2.y);
            }
        }
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(  () -> {
            JFrame frame = new JFrame("Sketch 101");
            java140Graphics panel = new java140Graphics();
            frame.add(panel, BorderLayout.CENTER);

            JPanel controlPanel = new JPanel();
            JButton redButton = new JButton("Red");
            redButton.addActionListener(e ->panel.setColor(Color.RED));
            JButton blueButton = new JButton("Blue");
            blueButton.addActionListener(e ->panel.setColor(Color.BLUE));
            JButton clearButton = new JButton("Clear");
            clearButton.addActionListener(e -> panel.clear());

            controlPanel.add(redButton);
            controlPanel.add(blueButton);
            controlPanel.add(clearButton);
            frame.add(controlPanel, BorderLayout.SOUTH);

            frame.setSize(800,600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });  //close SwingUtilities invoke later
    }
}
