import java.util.ArrayList;
import java.util.Iterator;

/**
 * java.ToDoListIterator implements iterator interface
 * @version 18.06.22
 * @author Yuval Komar, Gali Arba
 */

public class ToDoListIterator implements Iterator<Task> {
    private ToDoList taskList;

    //Constructor
    public ToDoListIterator(ToDoList list){
        this.taskList = list.clone();
    }

    @Override
    public boolean hasNext() {
        return false;
        //TODO write that method
    }

    @Override
    public Task next() {
        //TODO write that method
        return null;
    }
}
