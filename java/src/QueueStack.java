import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueStack {
    public static void main(String[] args) {
        //FIFO queue
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        System.out.println("Top element is " + q.peek());
        System.out.println("Removed top element is " + q.poll());
        System.out.println("Top element is " + q.peek());
        System.out.println("Is the collection empty? " + q.isEmpty());

        System.out.println("Stack implementation below: ");
        //LIFO order
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);

        while (!stack.isEmpty()){
            System.out.println("Current top element(LIFO) is " + stack.peek());
            stack.pop();
        }
    }
}
