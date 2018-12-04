package ds.queue;

/**
 * @author Nagendra Kamisetti
 */
public class Queue {

    private int maxSize;
    private long[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int size) {
        this.maxSize = size;
        this.queueArray = new long[size];
        this.front = 0;
        this.rear = -1;
        this.nItems = 0;
    }

    public void insert(long item) {
        if (rear == maxSize - 1) {
            rear = -1;
        }
        this.nItems++;
        this.rear++;
        this.queueArray[rear] = item;
    }

    public long remove() {
        long temp = this.queueArray[front];
        if (front == maxSize - 1) {
            rear = 0;
        }
        this.nItems--;
        this.front++;
        return temp;
    }

    public long peekFront() {
        return queueArray[front];
    }

    public boolean isEmpty() {
        return nItems == 0;
    }

    public boolean isFull() {
        return nItems == maxSize;
    }

    public void view() {
        System.out.print("[");
        for (int i = front; i < queueArray.length; i++) {
            System.out.print(queueArray[i] + " ");
        }
        System.out.println("]");
    }

}
