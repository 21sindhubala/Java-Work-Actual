import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class PushCounter extends JApplet
{
    private int pushes;
    private JLabel label;
    private JButton push;

    public void init()
    {
        pushes = 0;

        push = new JButton("Push Me!");
        push.addActionListener(new ButtonListener());

        label = new JLabel("Pushes: " + Integer.toString(pushes));

        Container cp = getContentPane();
        cp.setBackground(Color.GRAY);
        cp.setLayout(new FlowLayout());
        cp.add(push);
        cp.add(label);

        setSize(300,35);
    }

    private class ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            pushes++;
            label.setText("Pushes: " + Integer.toString(pushes));
            repaint();
        }
    }
}
