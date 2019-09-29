import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
public class Experiment
{
    private JPanel primary;
    private JLabel quote;
    private JRadioButton comedy, philosophy;
    public int experiment = 0;
    private String comedyQuote = "Take my wife, please";
    private String philosophyQuote = "I think, therefore I am";

    public Experiment()
    {
        quote = new JLabel(comedyQuote);
        quote.setFont(new Font("Helvetica", Font.BOLD, 24));

        comedy = new JRadioButton("Comedy", true);
        comedy.setBackground(Color.green);
        philosophy = new JRadioButton("Philosophy", true);
        philosophy.setBackground(Color.green);

        ButtonGroup group = new ButtonGroup();
        group.add(comedy);
        group.add(philosophy);

        QuoteListener listener = new QuoteListener();
        comedy.addActionListener(listener);
        philosophy.addActionListener(listener);

        primary = new JPanel();
        primary.add(quote);
        primary.add(comedy);
        primary.add(philosophy);
    }

    public JPanel getPanel()
    {
        return primary;
    }

    private class QuoteListener implements ActionListener
    {
        public void actionPerformed (ActionEvent event)
        {
            Object source = event.getSource();
            if(source == comedy) {
                experiment = 1;
                comedyQuote = "Take my wife, please" + Integer.toString(experiment);
                quote.setText(comedyQuote);
            }
            else
                quote.setText(philosophyQuote);
        }
    }
}

