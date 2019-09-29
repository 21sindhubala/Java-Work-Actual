import javax.swing.*;
public class DrawTree extends JApplet
{
    public void init()
    {
        getContentPane().add(new DrawTreePanel());
        setSize(300,200);
    }
}
