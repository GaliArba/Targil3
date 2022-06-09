import java.util.Iterator;

/**
 * ArrayQueue.java implements Queue interface
 * @version 4/6/2022
 * @author Yuval komar, Gali arba
 * @param <E> instance of the array queue object
 */
public class ArrayQueue implements Queue{
    private Object ArrayQueue[];
    private int front, rear, capacity;

    /**
     * creates a new queue
     * @param maxCap is the maximum capacity of the queue
     * @throws NegativeCapacityException
     */
    public ArrayQueue(int maxCap) throws NegativeCapacityException { //maxCap is the maximum capacity
        if (maxCap < 0)
            throw new NegativeCapacityException();
        ArrayQueue = new Object[maxCap]; //Initialize Array
    }

    @Override
    public void enqueue(Cloneable element) {

    }

    @Override
    public Cloneable dequeue() {
        return null;
    }

    @Override
    public Cloneable peek() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Queue clone() {
        return null;
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}