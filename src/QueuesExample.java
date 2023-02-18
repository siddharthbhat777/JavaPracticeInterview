import java.util.LinkedList;
import java.util.Queue;

public class QueuesExample {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.add("Hey bro");
        q.add("Hiiii");
        q.add("third element");
        q.add("fourth element");
        System.out.println(q.peek());
    }
}
