/**
 * Created by 21sindhubala on 8/22/2019.
 */
import java.applet.Applet;
import java.awt.*;
public class DrawPicture extends Applet
{
    public void paint (Graphics page)
    {
        setBackground(Color.white);
        page.setColor(Color.pink);
        page.fillOval(15, 25, 100, 100);
        page.setColor(Color.black);
        page.drawOval(15,25,100,100);
        page.drawOval(35, 85, 60, 20);
        page.setColor(Color.black);
        page.fillOval(50, 90, 10, 10);
        page.fillOval(70, 90, 10, 10);
        page.setColor(Color.black);
        page.fillOval(45, 55, 12, 12);
        page.fillOval(75, 55, 12, 12);
        page.setColor(Color.pink);
        page.fillArc(28, 27, 20, 20, 20, 220);
        page.fillArc(87, 27, 20, 20, 300, 220);
        page.setColor(Color.black);
        page.drawArc(28, 27, 20, 20, 20, 210);
        page.drawArc(87, 27, 19, 20, 310, 220);

    }
}

