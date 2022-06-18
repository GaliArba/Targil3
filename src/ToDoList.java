import java.lang.reflect.Method;
import java.util.*;

/**
 * ToDoList.java represent list of tasks
 * @version 11/06/22
 * @author Yuval komar, Gali arba
 */

public class ToDoList implements Cloneable, TaskIterable {
    private ArrayList<Task> TaskList;

    private Date scanType;

    /**
     * constructor of the class
     */
    public ToDoList() {
        TaskList = new ArrayList<Task>();
        scanType = null;
    }

    /**
     * this method add task to the ToDoList if there isnt already such task
     * @param task is the task that we add to the list
     * @throws TaskAlreadyExistsException throws if there is already such task
     */
    public void addTask(Task task) throws TaskAlreadyExistsException{
        //ToDo if task description already exist throw new TaskAlreadyExistsException
        for(int i = 0; i < TaskList.size(); i++){
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
        if(TaskList.size() == 0) // if list is empty
            return "";
                                //else prints due to format
        String list = "[";
        for(int i = 0; i < this.TaskList.size()-1; i++){
            list = list + TaskList.get(i) + ", ";
        }
        list = list + TaskList.get(TaskList.size()-1) + "]";
        return list;
    }

    @Override
    public ToDoList clone() { //override clone action
        try{
            ToDoList result = (ToDoList) super.clone();
            result.TaskList = (ArrayList<Task>) this.TaskList.clone();
            Class<Task> eMethod = Task.class;
            Method m = eMethod.getMethod("clone");
            for(int i = 0 ; i < this.TaskList.size() ;i++){
                result.TaskList.set(i, (Task) m.invoke(result.TaskList.get(i)));
            }

            return result;
        }
        catch (Exception e) {
            return null;

        }
    }

    /**
     * this method override equals method and compare between 2 ToDoLists
     * @param list ToDoList
     * @return boolean value
     */
    @Override
    public boolean equals(Object list){
        if(list instanceof ToDoList){
            ToDoList otherList = (ToDoList) list;
            for(int i = 0; i < this.TaskList.size()-1; i++){
                if(!(this.TaskList.get(i).equals(otherList.TaskList.get(i))))
                    return false;
            }
            return true;
        }
        return false;
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

    /**
     *
     * @return
     */
    @Override
    public Iterator<Task> iterator() {
        return new ToDoListIterator(this,scanType);
    }

    /**
     * this method get a date to filter a scanning on the list
     * @param dueDate the date that all task need to be before the current date
     */
    public void setScanningDueDate(Date dueDate){
        if(dueDate == null)
            return;
        this.scanType = dueDate;
    }

    /**
     * checks if the list is empty
     * @return true if the list is empty
     */
    public boolean isEmpty(){
        return this.TaskList.isEmpty();
    }

    /**
     * ordering the list by date and by alphabetic order for the equals dates
     * @return ordered list of tasks
     */
    public ToDoList orderByDate(){
        Comparator<Task> taskDateComparator
                = Comparator.comparing(Task::getDueDate).thenComparing(Task::getDescription);

        Collections.sort(this.TaskList,taskDateComparator);

        return this;
    }

    public ArrayList<Task> getTaskList(){
        return TaskList;
    }
}