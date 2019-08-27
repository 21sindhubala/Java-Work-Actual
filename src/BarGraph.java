/**
 * Created by 21sindhubala on 8/22/2019.
 */
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Font;
import javax.swing.JOptionPane;
public class BarGraph extends Applet
{
    public void paint(Graphics page)
    {
        String s1, s2, s3;
        int i1, i2, i3;
        s1 = JOptionPane.showInputDialog("Enter value 1 (must be between 1 and 100)");
        s2 = JOptionPane.showInputDialog("Enter value 2 (must be between 1 and 100)");
        s3 = JOptionPane.showInputDialog("Enter value 3 (must be between 1 and 100)");
        i1 = Integer.parseInt(s1);
        i2 = Integer.parseInt(s2);
        i3 = Integer.parseInt (s3);
        page.drawLine(40, 20, 40, 200);
        page.drawLine(40,200,220,200);
        Font f = new Font ("Georgia", Font.BOLD, 18);
        int count = 182, r;
        while(count>1)
        {
            page.drawLine(30, count, 50, count);
            count -= 18;
        }

        page.drawString("10",10,187);
        page.drawString("20",10,169);
        page.drawString("30",10,151);
        page.drawString("40",10,132);
        page.drawString("50",10,115);
        page.drawString("60",10,97);
        page.drawString("70",10,79);
        page.drawString("80",10,61);
        page.drawString("90",10,43);
        page.drawString("100",10,25);
        page.drawString("v1",80,220);
        page.drawString("v2",140,220);
        page.drawString("v3",200,220);

        count = 1;
        while(count <= i1)
        {
            r = 200 - (count * 18/10);
            page.drawRect(70, r, 40, 18/10);
            count += 1;
        }
        count = 1;
        while(count <= i2)
        {
            r = 200 - (count * 18/10);
            page.drawRect(130, r, 40, 18/10);
            count += 1;
        }
        count = 1;
        while(count <= i3)
        {
            r = 200 - (count * 18/10);
            page.drawRect(190, r, 40, 18/10);
            count += 1;
        }

    }
}

