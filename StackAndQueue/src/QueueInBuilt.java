import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueInBuilt {
    public static void main(String[] args) {
        //Queue is an interface its internal working is like linkedList
        Queue<Integer> queue = new LinkedList<>();

        queue.add(2);
        queue.add(4);
        queue.add(34);
        queue.add(21);

        System.out.println(queue.remove());
        System.out.println(queue.remove());

        //in deque we can insert and remove from both the sides
        Deque<Integer>  deque = new ArrayDeque<>();
        deque.add(34);
        deque.addFirst(324);
        deque.remove();
    }
}
//queue is like people are in a line infront of a stall
//FIFO