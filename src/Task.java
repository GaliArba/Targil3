
import java.util.Date;



/**
 * Task.java represent a task of student
 * @version 11/06/22
 * @author Yuval komar, Gali arba
 */

public class Task extends Date implements Cloneable {
    private String Description;
    private Date dueDate;

    public  Task(String description, Date dueDate){ // Constructor
        this.Description = new String(description);
        this.dueDate = dueDate;
    }

    @Override
    public String toString(){
        return "(" + Description + ", " + dueDate + ")";
    }

    @Override
    public Task clone() {
        return null;
    }



}
