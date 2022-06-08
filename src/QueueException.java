/**
 * QueueException.java is the special errors class for Queues
 * @version 9/6/2022
 * @author Yuval komar, Gali arba
 */
public class QueueException extends RuntimeException{
    public QueueException() {
    }

    public QueueException(String message) {
        super(message);
    }

    public QueueException(String message, Throwable cause) {
        super(message, cause);
    }
}
