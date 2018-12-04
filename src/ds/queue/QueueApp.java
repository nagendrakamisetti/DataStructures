package ds.queue;

/**
 * @author Nagendra Kamisetti
 */
public class QueueApp {

    public static void main(String[] args) {

        Queue queue = new Queue(4);
        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);
        queue.view();

        System.out.println(queue.remove());
        System.out.println(queue.remove());

    }
}
