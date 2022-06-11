import java.util.Iterator;

/**
 * ArrayQueue.java implements Queue interface
 * @version 4/6/2022
 * @author Yuval komar, Gali arba
 * @param <E> instance of the array queue object
 */
public class ArrayQueue<E extends Cloneable> implements Queue{
    private Cloneable array[];

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
        this.array = new Cloneable[maxCap]; //Initialize Array
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
        if(front == capacity-1 || this.array == null)
            throw new QueueOverflowException();
        this.array[this.rear] = element;
    }

    /**
     * pull an object from the head of the queue and returns it
     * @return the object at the head of the queue
     */
    @Override
    public Cloneable dequeue() throws EmptyQueueException {
        if(array[front] == null)
            throw new EmptyQueueException();

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