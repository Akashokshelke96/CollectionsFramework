import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeLearn {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.offerFirst(1);
        dq.offerLast(9);
        System.out.println(dq);
        System.out.println("top" + dq.peekFirst());
        dq.pollFirst();
        System.out.println("top" + dq.peekFirst());
        System.out.println(dq);
    }
}
