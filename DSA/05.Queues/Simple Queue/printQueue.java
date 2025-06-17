import java.util.*;
public class printQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> k = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        while(!q.isEmpty()){
          k.add(q.peek());
            System.out.println(q.poll());
        }
        while(!k.isEmpty()){
            q.add(k.peek());
            k.poll();
        }
    }
}
