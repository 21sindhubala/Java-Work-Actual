public class Tasks {

    private String name, due;
    int importance;
    private boolean complete;

    public Tasks(String nameInput, String dayInput, String importanceInput)
    {
        name = nameInput;
        due = dayInput;
        if(importanceInput.contains("ig"))
            importance = 1;
        else if(importanceInput.contains("d"))
            importance = 2;
        else
            importance = 3;
        complete = false;
    }

    public String name()
    {
        return name;
    }

    public String due()
    {
        return due;
    }

    public String importance()
    {
        if(importance == 1)
            return "high";
        else if(importance == 2)
            return "medium";
        else if(importance == 3)
            return "low";
        else
            return "N/A";
    }

    public boolean complete()
    {
        return complete;
    }

    public void changeName(String newName)
    {
        name = newName;
    }

    public void changeDue(String newDay)
    {
        due = newDay;
    }

    public void changeImportance(String newImp)
    {
        if(newImp.contains("ig"))
            importance = 1;
    }
}
