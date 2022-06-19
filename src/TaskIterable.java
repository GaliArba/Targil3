import java.util.Date;

/**
 * java.TaskIterable extend Iterable interface
 * @version 18.06.22
 * @author Yuval Komar, Gali Arba
 */

public interface TaskIterable extends Iterable<Task>{

    public void setScanningDueDate(Date dueDate);
}
