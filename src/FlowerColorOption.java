import javax.swing.*;

public class FlowerColorOption
{
    public static void main (String[] args)
    {
        JFrame colorFrame = new JFrame("Color Options");
        colorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ColorGui gui = new ColorGui();
        colorFrame.getContentPane().add(gui.getPanel());
        colorFrame.pack();
        colorFrame.setVisible(true);
    }
}