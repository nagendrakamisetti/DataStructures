package stack;

/**
 * @author Nagendra Kamisetti
 */
public class Stack {

    int top;
    long[] stackArray;
    int maxSize;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new long[maxSize];
        this.top = -1;
    }

    public void push(long element) {
        if (isFull()) {
            System.out.println("This stack is already full");
        } else {
            top++;
            stackArray[top] = element;
        }
    }

    public long pop() {
        if (isEmpty()) {
            System.out.println("This stack is already empty");
            return -1;
        } else {
            int old_top = top;
            top--;
            return stackArray[old_top];
        }
    }

    public long peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

}
