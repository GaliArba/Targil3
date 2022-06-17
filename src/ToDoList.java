import java.lang.annotation.ElementType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ToDoList.java represent list of tasks
 * @version 11/06/22
 * @author Yuval komar, Gali arba
 */

public class ToDoList implements Cloneable, TaskIterable {
    private ArrayList<Task> TaskList;

    /**
     * constructor of the class
     */
    public ToDoList() {
        TaskList = new ArrayList<Task>();
    }

    /**
     * this method add task to the ToDoList if there isnt already such task
     * @param task is the task that we add to the list
     * @throws TaskAlreadyExistsException throws if there is already such task
     */
    public void addTask(Task task) throws TaskAlreadyExistsException{
        //ToDo if task description already exist throw new TaskAlreadyExistsException
        for(int i=0;i<TaskList.size();i++){
            if(TaskList.get(i).sameDescription(task))
                throw new TaskAlreadyExistsException();
        }
        TaskList.add(task); // add task to the ToDoList
    }


    /**
     * this method print the ToDoList
     * @return ToDoList
     */
    @Override
    public String toString(){
        return "[" + new ToDoList() + "]";
    }

    @Override
    public ToDoList clone() { //override clone action
        return null;
    }

    /**
     * this method override equals method and compare between 2 ToDoLists
     * @param list ToDoList
     * @return boolean value
     */
    @Override
    public boolean equals(ToDoList list){
        return this.TaskList.equals(list);
    }

    /**
     * return a hashCode value for the ToDoList object
     * @return hashCode
     */
    @Override
    public int hashCode(){
        int ToDoListHashCode = 0;
        for(int i = 0; i < this.TaskList.size()-1; i++){
            ToDoListHashCode += this.TaskList.get(i).hashCode();
        }
        return ToDoListHashCode;
    }

    @Override
    public Iterator<Task> iterator() {
        return null;
        //TODO write that class and API
    }

}
