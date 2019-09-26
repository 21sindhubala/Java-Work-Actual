import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorGui {
    private final int WIDTH = 300, HEIGHT = 100;
    private JPanel primary;
    private JLabel color;
    private JRadioButton blue, red, yellow;
    private String b = "blue";
    private String r = "red";
    private String y = "yellow";

    public ColorGui()
    {
        color = new JLabel ("blue");
        color.setFont(new Font("Helvetica", Font.BOLD, 24));

        blue = new JRadioButton("Blue", true);
        blue.setBackground(Color.blue);
        red = new JRadioButton("Red", true);
        red.setBackground(Color.red);
        yellow = new JRadioButton("Yellow", true);
        yellow.setBackground(Color.yellow);

        ButtonGroup group = new ButtonGroup();
        group.add(blue);
        group.add(red);
        group.add(yellow);

        ColorListener listener = new ColorListener();
        blue.addActionListener(listener);
        red.addActionListener(listener);
        yellow.addActionListener(listener);

        primary.setBackground(Color.green);
        primary = new JPanel();
        primary.add(blue);
        primary.add(red);
        primary.add(yellow);

        if(color.getText().contains("blue"))
            primary.setBackground(Color.blue);
        else
        if (color.getText().contains("red"))
            primary.setBackground(Color.red);
        else
            primary.setBackground(Color.yellow);
        primary.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }

    public JPanel getPanel()
    {
        return primary;
    }

    private class ColorListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            Object source = event.getSource();

            if(source == blue)
            {
                color.setText(b);
            }
            else {
                if (source == red) {
                    color.setText(r);
                } else {
                    color.setText(y);
                }
            }
        }
    }
}
