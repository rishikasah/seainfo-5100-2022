package thread;

import java.util.LinkedList;
import java.util.Queue;

public class ThreadSafeQueue<T>{

    private Queue<T> thsQueue;
    private Object objLock = new Object();

    public ThreadSafeQueue(){
        thsQueue = new LinkedList<>();
    }

    public void add(T data){
        synchronized (objLock) {
            thsQueue.add(data);
        }
    }

    public T remove(){
        synchronized (objLock){
            return thsQueue.remove();
        }
    }

    public T peek(){
        synchronized (objLock){
            return thsQueue.peek();
        }
    }

    public boolean isEmpty(){
        synchronized (objLock){
            return thsQueue.isEmpty();
        }
    }
}
