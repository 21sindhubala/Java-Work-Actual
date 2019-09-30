import javax.swing.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
import java.awt.Color;
public class ToDoGUI {
    private JPanel primary;
    private JButton add, remove, move, print;
    private String input1, input2, input3, input4;
    private int importance;
    private LinkedList<Tasks> list = new LinkedList<Tasks>();

    public ToDoGUI()
    {
        add = new JButton("Add New Task");
        remove = new JButton("Remove Task from List");
        move = new JButton("Change Due Date for Task");
        print = new JButton("Show List");

        ButtonGroup group = new ButtonGroup();
        group.add(add);
        group.add(remove);
        group.add(move);
        group.add(print);
    }

    private class Listener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            Object source = e.getSource();
            if(source == add)
            {
                input1 = JOptionPane.showInputDialog("Name of task?");
                input2 = JOptionPane.showInputDialog("Importance of task (high, medium, or low?");
                input3 = JOptionPane.showInputDialog("Day task is due?");

                if(input2.contains("ig"))
                    importance = 1;
                else if(input2.contains("d"))
                    importance = 2;
                else
                    importance = 3;

                Tasks task = new Tasks(input1, input3, importance);
                list.addFirst(task);
            }
            else if(source == remove)
            {
                input1 = JOptionPane.showInputDialog("Name of task?");
                boolean done = false;
                int find = 0;

                while(done == false)
                {
                    if(list.get(find).name().contains(input1))
                    {
                        done = true;
                        list.remove(list.get(find));
                    }
                }
            }
            else if(source == move)
            {
                input1 = JOptionPane.showInputDialog("What task?");
                input2 = JOptionPane.showInputDialog("What would you change the date to?");
                boolean done = false;
                int find = 0;

                while(done == false)
                {
                    if(list.get(find).name().contains(input1))
                    {
                        done = true;
                        list.;
                    }
                }
            }
        }
    }
}
