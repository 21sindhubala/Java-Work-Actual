import javax.swing.*;
import java.awt.*;
public class QuoteOptions
{
    public static void main (String[] args)
    {
        JFrame quoteFrame = new JFrame("Quote Options");
        quoteFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Experiment gui = new Experiment();
        quoteFrame.getContentPane().add(gui.getPanel());
        quoteFrame.setBackground(Color.green);
        quoteFrame.pack();
        quoteFrame.setVisible(true);
    }
}
