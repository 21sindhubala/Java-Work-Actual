import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;
public class DrawTreePanel extends JPanel
{
    private Point point1 = null, point2 = null;

    public DrawTreePanel()
    {
        Listener listener = new Listener();
        addMouseListener(listener);
        addMouseMotionListener(listener);
    }

    public void paintComponent(Graphics page)
    {
        super.paintComponent(page);
        int width, height, ovalX, ovalY;

        if(point1 != null && point2 != null)
        {
            width = point2.x - point1.x;
            height = (point2.x - point1.x) * 5/2;
            ovalX = point1.x - (width / 2);
            ovalY = point1.y - (height / 2);

            page.setColor(new Color (102,51,0));;
            page.fillRect(point1.x, point1.y, width, height);
            page.setColor(new Color(60, 135, 46));
            page.fillOval(ovalX, ovalY, width * 2, height * 4/5);
        }
    }

    private class Listener implements MouseListener, MouseMotionListener
    {
        public void mousePressed(MouseEvent event)
        {
            point1 = event.getPoint();
        }

        public void mouseDragged(MouseEvent event)
        {
            point2 = event.getPoint();
            repaint();
        }
        public void mouseClicked(MouseEvent event){}
        public void mouseReleased(MouseEvent event){}
        public void mouseEntered(MouseEvent event){}
        public void mouseExited(MouseEvent event){}
        public void mouseMoved(MouseEvent event){}

    }
}
