/**
 * EmptyQueueException.java is an error object for trying to reach
 * the queue ,and it is empty
 * @version 9/6/2022
 * @author Yuval komar, Gali arba
 */
public class EmptyQueueException extends QueueException {
    public EmptyQueueException() { } //Default constructor

    public EmptyQueueException(String message) {
        super(message);
    }

    public EmptyQueueException(String message, Throwable cause) {
        super(message, cause);
    }

}
