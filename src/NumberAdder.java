import javax.swing.JOptionPane;

public class NumberAdder
{
    public static void main (String[] args)
    {
        String number, output;
        int num, sum = 0, again;

        do {
            number = JOptionPane.showInputDialog("Enter an integer: ");
            num = Integer.parseInt(number);
            sum += num;
            again = JOptionPane.showConfirmDialog(null, "Do Another?");
        }
        while (again == JOptionPane.YES_OPTION);

        output = "The sum of the numbers was " + sum;
        JOptionPane.showMessageDialog(null, output);
    }
}
