
import java.util.Date;



/**
 * Task.java represent a task of student
 * @version 11/06/22
 * @author Yuval komar, Gali arba
 */

public class Task extends Date implements Cloneable {
    private String Description;
    private Date dueDate;

    /**
     * constructor of the class
     * @param description string that describe the task
     * @param dueDate Date that describe until when you can apply the task
     */
    public  Task(String description, Date dueDate){ // Constructor
        this.Description = new String(description);
        this.dueDate = dueDate;
    }

    /**
     * the method prints the task due to format
     * @return task
     */
    @Override
    public String toString(){
        return "(" + Description + ", " + dueDate + ")";
    }

    @Override
    public Task clone() {
        return null;
    }

    /**
     * this method checks if 2 tasks are equals
     * @param task that we'd like to compare
     * @return boolean value
     */
    @Override
    public boolean equals(Task task){
        //TODO write that
    }

    /**
     * return a hashCode value for the task object
     * @return hashCode
     */
    @Override
    public int hashCode(){
        //TODO write that method
    }

}
