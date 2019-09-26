
import javax.swing.*;

public class IntLinkedList {
    public static void main (String[] args)
    {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        boolean done = false;
        String input, add, when, deleted, move, where, finished;
        LinkedList<java.lang.Integer> list = new LinkedList <Integer>();
        list.addFirst((int)(Math.random() * 100));
        list.addFirst((int)(Math.random() * 100));
        list.addFirst((int)(Math.random() * 100));
        list.addFirst((int)(Math.random() * 100));
        list.addFirst((int)(Math.random() * 100));

        while(done == false)
        {
            input = JOptionPane.showInputDialog("Would you like to add a number from the list, remove a number from the list, or print the list?");
            if (input.contains("add")) {
                input = JOptionPane.showInputDialog("At a certain point (y or n)?");
                if(input.contains("y"))
                {
                    input = JOptionPane.showInputDialog("What number would you like to add before?");
                    add = JOptionPane.showInputDialog("What number would you like to add?");
                    list.insertBefore(Integer.parseInt(input), Integer.parseInt(add));
                }
                else {
                    input = JOptionPane.showInputDialog("What number would you like to add?");
                    list.addFirst(Integer.parseInt(input));
                }
            }
            else if(input.contains("remove"))
            {
                input = JOptionPane.showInputDialog("What number would you like to remove?");
                list.remove(Integer.parseInt(input));
            }
            else
            {
                JOptionPane.showMessageDialog(frame, list.toString());
            }
            input = JOptionPane.showInputDialog("Are you done (y or n)?");
            if(input.contains("y"))
                done = true;
        }
    }
}
