import java.lang.reflect.Method;
import java.util.Iterator;

/**
 * ArrayQueue.java implements Queue interface
 * @version 4/6/2022
 * @author Yuval komar, Gali arba
 * @param <E> instance of the array queue object
 */
public class ArrayQueue<E extends Cloneable> implements Queue<E>,Cloneable,Iterable<E>{
    protected Cloneable[] array;

    /**
     * the size of the queue
     */
    private int queueSize;

    /**
     * the index of the object at the head of the queue where the objects coming out
     */
    protected int front;

    /**
     * the index of tail of the queue where the object coming in
     */
    private int rear;

    /**
     * the max capacity of the queue
     */
    private final int capacity;

    /**
     * creates a new queue
     * @param maxCap is the maximum capacity of the queue
     * @throws NegativeCapacityException if the maximum capacity of the array is negative
     */
    public ArrayQueue(int maxCap) throws NegativeCapacityException { //maxCap is the maximum capacity
        if (maxCap < 0)
            throw new NegativeCapacityException();
        this.array = new Cloneable[maxCap]; //Initialize Array
        this.front = -1; //the index of the object at the head of the queue where the objects coming out
        this.rear = -1; //the index of tail of the queue where the object coming in
        this.capacity = maxCap; //the max size of the queue
        this.queueSize = 0;
    }
    /**
     * add new object to the queue
     * @param element is the new object entering the queue
     * @throws QueueOverflowException if the queue is full
     */
    @Override
    public void enqueue(E element) throws QueueOverflowException {
        if(capacity == this.size()) //when the queue is full
            throw new QueueOverflowException();
        else {
            if (this.size() == 0) { //when the queue is empty
                this.rear = 0;
                this.front = 0;
                this.array[front] = element;
                queueSize++;
            }
            if (this.size() != 0) { //when the queue isn't empty and not full
                this.rear += 1;
                this.array[rear] = element;
                queueSize++;
            }
            if (this.rear == capacity-1){ //if rear is in last index of the array
                this.rear = 0;
                this.array[this.rear] = element;
                queueSize++;
            }
        }
    }

    /**
     * pull an object from the head of the queue and returns it
     * @return the object at the head of the queue
     * @throws EmptyQueueException if the queue is empty
     */
    @Override
    public E dequeue() throws EmptyQueueException {
        if(front == -1 || array[front] == null) //checks if queue is empty
            throw new EmptyQueueException();
        E temp = (E) this.array[front];
        this.array[front] = null;
        queueSize--;
        if(this.front != size()){ //if front index not pointing on last index of the array
            this.front += 1;
            return temp;
        }
         // if front index is pointing on last index of the array
        this.front = 0;
        return temp;
    }

    /**
     * get the object at the head of the queue
     * @return the object at the head of the queue
     * @throws EmptyQueueException if the queue is empty
     */
    @Override
    public E peek() throws EmptyQueueException {
        if(this.isEmpty())
            throw new EmptyQueueException();
        return (E)array[front];
    }

    /**
     * returns the size of the deque
     * @return the size of the deque
     */
    @Override
    public int size() {
        return this.queueSize;
    }

    /**
     * checks if the queue is empty
     * @return true if the queue is empty
     */
    @Override
    public boolean isEmpty() {
        return queueSize == 0;
    }

    /**
     * makes new cloned queue
     * @return the new cloned Arrayqueue object
     */
    @Override
    public ArrayQueue<E> clone() {
        try{
            ArrayQueue<E> result = (ArrayQueue<E>) super.clone();
            result.array = this.array.clone();
            Class<Cloneable> eMethod = Cloneable.class;
            Method m = eMethod.getMethod("clone");
            for(int i = 0 ; i < this.capacity;i++){
                result.array[i] = (ArrayQueue<E>)m.invoke(result.array[i]);
            }

            return result;
        }
        catch (Exception e) {
            return null;

        }
    }

    /**
     *
     * @return
     */
    @Override
    public Iterator<E> iterator() {
        return (Iterator<E>) new ArrayQueueIterator(this);
    }

    public int getCapacity(){
        return this.capacity;
    }
    public int getFront(){
        return this.front;
    }
    public int getRear(){
        return this.rear;
    }

}