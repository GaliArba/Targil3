/**
 * TaskAlreadyExistsException.java is the special errors class for ToDoList
 * @version 11/6/2022
 * @author Yuval komar, Gali arba
 */

public class TaskAlreadyExistsException extends RuntimeException {
    public TaskAlreadyExistsException() { } // Default constructor

    public TaskAlreadyExistsException(String message) {
        super(message);
    }

    public TaskAlreadyExistsException(String message, Throwable cause) {
        super(message, cause);
    }
}
