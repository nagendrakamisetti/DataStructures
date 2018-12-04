package ds.stack;

/**
 * @author Nagendra Kamisetti
 */
public class StackString {

    int top;
    char[] stackArray;
    int maxSize;

    public StackString(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new char[maxSize];
        this.top = -1;
    }

    public void push(char element) {
        if (isFull()) {
            System.out.println("This ds.stack is already full");
        } else {
            top++;
            stackArray[top] = element;
        }
    }

    public char pop() {

        int old_top = top;
        top--;
        return stackArray[old_top];

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
