import java.lang.annotation.ElementType;
import java.util.ArrayList;
import java.util.List;

/**
 * ToDoList.java represent list of tasks
 * @version 11/06/22
 * @author Yuval komar, Gali arba
 */

public class ToDoList implements Cloneable {
    private ArrayList<Task> List = new ArrayList<Task>();

    /**
     * constructor of the class
     */
    public ToDoList() {super();} //is it okay?

    /**
     * this method add task to the ToDoList
     * @param task
     * @throws TaskAlreadyExistsException
     */
    public void addTask(Task task) throws TaskAlreadyExistsException{
        //ToDo if task description already exist throw new TaskAlreadyExistsException
        List.add(task); // add task to the ToDoList
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
        //TODO writing that method
    }

    /**
     * return a hashCode value for the ToDoList object
     * @return hashCode
     */
    @Override
    public int hashCode(){
        //TODO write that class
    }
}
