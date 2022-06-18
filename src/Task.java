
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;



/**
 * Task.java represent a task of student
 * @version 11/06/22
 * @author Yuval komar, Gali arba
 */

public class Task extends Date implements Cloneable {
    private String description;
    private Date dueDate;

    /**
     * constructor of the class
     * @param description string that describe the task
     * @param dueDate Date that describe until when you can apply the task
     */
    public  Task(String description, Date dueDate){ // Constructor
        this.description = new String(description);
        this.dueDate = dueDate;
    }

    /**
     * the method prints the task due to format
     * @return print due to format
     */
    @Override
    public String toString(){
        return "(" + this.description + ", " + this.dueDate.toString() + ")";
    }

    @Override
    public Task clone() {
        try {
            Task result = (Task) super.clone();
            result.description = new String(description);
            result.dueDate = (Date) this.dueDate.clone();
            return result;
        }
        catch (Exception e) {
            return null;
        }
    }

    /**
     * this method checks if 2 tasks are equals
     * @param other that we'd like to compare
     * @return boolean value
     */
    @Override
    public boolean equals(Object other){
        if(other instanceof Task){
            Task otherTask = (Task) other;
            return this.description.equals(((Task) otherTask).description) &&
                    this.dueDate.equals(((Task) otherTask).dueDate) &&
                    this.hashCode() == otherTask.hashCode();
        }
        return false;
    }

    /**
     * return a hashCode value for the task object
     * @return hashCode
     */
    @Override
    public int hashCode(){
        return this.description.hashCode();
    }

    /**
     * check if a task description is equals to the current task description
     * @param checkDescription the task that need to checked
     * @return true if the tasks descriptions are the same
     */
    public boolean sameDescription(Task checkDescription){
        return this.description.equals(checkDescription.description);
    }

}
