import java.util.Date;
import java.util.Iterator;

/**
 * java.ToDoListIterator implements iterator interface
 * @version 18.06.22
 * @author Yuval Komar, Gali Arba
 */

public class ToDoListIterator implements Iterator<Task> {
    private ToDoList orderList;
    private Date scanType;
    private int index;
    private int nextIndex;


    //Constructor
    public ToDoListIterator(ToDoList currentList, Date scanType){
        this.orderList = currentList.clone();
        this.scanType = scanType;
        this.orderList.orderByDate();
        this.index = 0;
        this.nextIndex = 0;
    }

    @Override
    public boolean hasNext() {
       if(scanType == null)
       {
           return !(orderList.getTaskList().size()-1 <= index);
       }
       return !(orderList.getTaskList().size()-1 <= index) &&
               (orderList.getTaskList().get(index).getDueDate().before(scanType));
    }

    @Override
    public Task next() {
        if(nextIndex == 0) {
            nextIndex++;
            return orderList.getTaskList().get(index);
        }
        index = nextIndex;
        nextIndex++;
        return orderList.getTaskList().get(index);
    }
}
