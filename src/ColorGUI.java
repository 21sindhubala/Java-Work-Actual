import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;

public class ColorGUI {
    private JPanel primary;
    private JRadioButton blue, red, purple;

    public ColorGUI()
    {
        blue = new JRadioButton("Blue", true);
        red = new JRadioButton("Red", true);
        purple = new JRadioButton("Purple", true);

        ButtonGroup group = new ButtonGroup();
        group.add(blue);
        group.add(red);
        group.add(purple);

        ColorListener listener = new ColorListener();
        blue.addActionListener(listener);
        red.addActionListener(listener);
        purple.addActionListener(listener);

        primary = new JPanel();
        primary.add(blue);
        primary.add(red);
        primary.add(purple);
        primary.setBackground(Color.GRAY);

    }

    public JPanel getPanel()
    {
        return primary;
    }

    private class ColorListener implements ActionListener
    {
        public void actionPerformed (ActionEvent event)
        {
            Object source = event.getSource();
            if(source == blue)
                primary.setBackground(new Color(32, 116, 228));
            else if(source == red)
                primary.setBackground(new Color(176, 34, 34));
            else
                primary.setBackground(new Color(110, 42, 158));

        }
    }
}
