/**
 * NegativeCapacityException.java is an error object for trying to make
 * the max size of the queue negative
 * @version 9/6/2022
 * @author Yuval komar, Gali arba
 */
public class NegativeCapacityException extends QueueException {
        public NegativeCapacityException() {
        }

        public NegativeCapacityException(String message) {
            super(message);
        }

        public NegativeCapacityException(String message, Throwable cause) {
            super(message, cause);
        }

}