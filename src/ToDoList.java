/**
 * ToDoList.java represent list of tasks
 * @version 11/06/22
 * @author Yuval komar, Gali arba
 */

public class ToDoList implements Cloneable {
    private Task[] taskList;

    // Constructor
    public ToDoList() { }

    public void addTask(Task t) throws TaskAlreadyExistsException{
        //add to the list
        // if task description already exist throw new TaskAlreadyExistsException
    }

    @Override
    public String toString(){
        return "[" + new ToDoList() + "]";
    }

    @Override
    public ToDoList clone() { //override clone action
        return null;
    }
}
