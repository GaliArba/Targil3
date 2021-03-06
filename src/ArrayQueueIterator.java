import java.util.Iterator;


/**
 * ArrayQueueIterator.java implements iterable interface
 * @version 14/6/2022
 * @author Yuval komar, Gali arba
 */
public class ArrayQueueIterator<E extends Cloneable> implements Iterator<E>{
    private ArrayQueue<E> aqArray;


    public ArrayQueueIterator(ArrayQueue<E> aq){
        this.aqArray = aq.clone();
    }

    @Override
    public boolean hasNext() {
        if(aqArray == null)
            return false;
        return !(this.aqArray.isEmpty());
    }

    @Override
    public E next() {
        return this.aqArray.dequeue();
    }
}
