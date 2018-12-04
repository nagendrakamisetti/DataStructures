package ds.stack;

/**
 * @author Nagendra Kamisetti
 */
public class StackApp {

    public static void main(String[] args) {

        Stack stack = new Stack(2);
        stack.push(10);
        stack.push(20);
        stack.push(30);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
