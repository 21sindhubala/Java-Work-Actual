import javax.swing.*;
public class Color
{
    public static void main (String[] args)
    {
        JFrame frame = new JFrame("Color Options");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ColorGUI gui = new ColorGUI();
        frame.getContentPane().add(gui.getPanel());

        frame.pack();
        frame.setVisible(true);
    }
}
