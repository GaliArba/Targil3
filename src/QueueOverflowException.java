/**
 * QueueOverflowException.java is an error object for trying to add
 * new part to the queue ,and it is full
 * @version 9/6/2022
 * @author Yuval komar, Gali arba
 */
public class QueueOverflowException extends QueueException {
    public QueueOverflowException() {
    }

    public QueueOverflowException(String message) {
        super(message);
    }

    public QueueOverflowException(String message, Throwable cause) {
        super(message, cause);
    }

}
