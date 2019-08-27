/**
 * Created by 21sindhubala on 8/22/2019.
 */
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
public class Experiment extends Applet
{
    public void paint(Graphics g)
    {
        String school;
        int schoolNum;
        school = JOptionPane.showInputDialog("Enter school number:");
        schoolNum = Integer.parseInt(school);
        Font f = new Font("Georgia", Font.BOLD, 18);
        g.setFont(f);
        g.setColor(new Color (0,0,0));
        g.drawString(schoolNum + " is a very nice school.", 5, 60);
    }
}

