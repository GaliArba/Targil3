import java.util.Iterator;

/**
 * ArrayQueue.java implements Queue interface
 * @version 4/6/2022
 * @author Yuval komar, Gali arba
 * @param <E> instance of the array queue object
 */
public class ArrayQueue<E> implements Queue{
    private Object ArrayQueue[];

    /**
     * the index of the object at the head of the queue where the objects coming out
     */
    private int front;

    /**
     * the index of tail of the queue where the object coming in
     */
    private int rear;

    /**
     * the max capacity of the queue
     */
    private int capacity;
    /**
     * creates a new queue
     * @param maxCap is the maximum capacity of the queue
     * @throws NegativeCapacityException if the maximum capacity of the array is negative
     */
    public ArrayQueue(int maxCap) throws NegativeCapacityException { //maxCap is the maximum capacity
        if (maxCap < 0)
            throw new NegativeCapacityException();
        this.ArrayQueue = new Object[maxCap]; //Initialize Array
        this.front = 0; //the index of the object at the head of the queue where the objects coming out
        this.rear = 0; //the index of tail of the queue where the object coming in
        this.capacity = maxCap; //the max size of the queue
    }

    /**
     * add new object to the queue
     * @param element is the new object entering the queue
     * @throws QueueOverflowException if the queue is full
     */
    @Override
    public void enqueue(Cloneable element) throws QueueOverflowException {
        if(front == capacity-1 || this.ArrayQueue == null)
            throw new QueueOverflowException();
        this.ArrayQueue[this.rear] = element;


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