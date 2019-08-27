/**
 * Created by 21sindhubala on 8/26/2019.
 */
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
public class RandomTrees extends Applet
{
    public void paint(Graphics page)
    {
        int count = 1, x, y;
        while(count < 25)
        {
            x = (int)(Math.random() * 300);
            y = (int)(Math.random() * 300);
            page.setColor(new Color (102,51,0));
            page.fillRect(x,y,20,50);
            page.setColor(new Color(34, 170, 34));
            page.fillOval(x-10,y-20,40,40);
            count += 1;
        }
    }
}

