import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class Count extends JPanel
{
    private final int WIDTH = 300, HEIGHT = 200;
    private final int RADIUS = 6;

    private ArrayList<Point> pointList;
    private int count;

    public Count()
    {
        pointList = new ArrayList<Point>();
        count = 0;
        addMouseListener(new Listener());
        setBackground(Color.black);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }
    public void paint(Graphics page)
    {
        super.paint(page);
        page.setColor(Color.green);
        for(Point drawPoint : pointList)
            page.fillOval(drawPoint.x - RADIUS, drawPoint.y - RADIUS, RADIUS * 2, RADIUS * 2);
    }

    private class Listener implements MouseListener
    {
        public void mousePressed(MouseEvent event)
        {
            pointList.add(event.getPoint());
            count++;
            repaint();
        }

        public void mouseClicked(MouseEvent event){}
        public void mouseReleased(MouseEvent event){}
        public void mouseEntered(MouseEvent event){}
        public void mouseExited(MouseEvent event){}
    }
}
