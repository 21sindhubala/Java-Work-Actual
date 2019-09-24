import java.applet.Applet;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class ToDoList extends Applet
{
    public void paint(Graphics page)
    {
        int next;
        String input, add, when, deleted, move, where;
        LinkedList<String> list = new LinkedList <String>();
        list.addFirst(" Future:");
        list.addFirst(" Tommorrow:");
        list.addFirst(" Today:");
        list.addFirst("Overdue:");
        input = JOptionPane.showInputDialog("Do you want to add new tasks, cross off finished tasks, see your tasks, or move your tasks?");
        if(input.contains("new"))
        {
            when = JOptionPane.showInputDialog(("Today, tommorrow, or in the future"));
            if(when.contains("day"))
            {
                add = JOptionPane.showInputDialog("What's the task?");
                list.insertAfter(" Today:", add);
            }
            else if(when.contains("mm"))
            {
                add = JOptionPane.showInputDialog("What's the task?");
                list.insertAfter(" Tommorrow:", add);
            }
            else
            {
                add = JOptionPane.showInputDialog("What's the task?");
                list.insertAfter(" Future:", add);
            }
        }
        else if(input.contains("finished"))
        {
            deleted = JOptionPane.showInputDialog("Task to delete?");
            list.remove(deleted);
        }
        else if(input.contains("see"))
        {
            JFrame frame = new JFrame("To Do");
            JOptionPane.showMessageDialog(frame, list.toString());
        }
        else
        {
            move = JOptionPane.showInputDialog("Do you want to move all your tasks one day (has is been a day), or do you wish to move a specific task from the future to a certain date?");
            if(move.contains("day"))
            {
                list.remove(" Today:");
                list.insertBefore(" Tommorrow:", " Today:");
                list.remove(" Tomorrow:");
            }
            else
            {
                move = JOptionPane.showInputDialog("What task?");
                where = JOptionPane.showInputDialog("To today or tommorrow?");
                if(where.contains("day"));
                {
                    list.insertBefore(" Today:", move);
                    list.remove(move);
                }
            }
        }
    }
}

